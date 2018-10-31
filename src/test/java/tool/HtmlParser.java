package tool;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

/**
 * @author huy
 * @date 2018/10/30 16:17
 * @description
 */
public class HtmlParser {

    public static void main(String[] args) {
        String file = "C:\\Users\\arano\\Desktop\\Temp\\33333娇.xls";
        Element table = parseExcelToHtmlTable(file, 0, 5, 6 ,0);
        writeElementToFile(table, "table.html");
        System.out.println(table.toString());
    }

    /**
     * 将表格解析成html中的table
     * @param url
     * @param sheetIndex
     * @param headerLine
     * @param startRow
     * @param startCol
     * @return
     */
    private static Element parseExcelToHtmlTable(String url, int sheetIndex, int headerLine, int startRow, int startCol){
        File file = new File(url);
        if(!file.exists()){
            return null;
        }
        Element table = new Element("table");
        try {
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetIndex);
            //生成表头
            Element thead = new Element("thead");
            thead.appendChild(generateTr(sheet, 0));
            table.appendChild(thead);
            //生成内容
            Element tbody = new Element("tbody");
            int rows = sheet.getRows();
            for(int i = startRow; i < rows; i ++){
                tbody.appendChild(generateTr(sheet, i));
            }
            table.appendChild(tbody);
            //处理合并单元格
            Range[] ranges = sheet.getMergedCells();
            for(Range range : ranges){
                Cell topLeft = range.getTopLeft();
                if(topLeft.getRow() < startRow){
                    continue;
                }
                Cell bottomRight = range.getBottomRight();
                int leftMergedCellCount = getCountOfLeftMergedCell(sheet, topLeft, startCol);
                int tdRowIndex = topLeft.getRow() - startRow;
                int tdColIndex = topLeft.getColumn() - startCol - leftMergedCellCount;
                int rowRange = bottomRight.getRow() - topLeft.getRow();
                int colRange = bottomRight.getColumn() - topLeft.getColumn();
                Element td = getTdByIndex(tbody, tdRowIndex, tdColIndex);
                td.attr("rowspan", String.valueOf(rowRange + 1));
                td.attr("colspan", String.valueOf(colRange + 1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return table;
    }

    /**
     * 根据行生成tr
     * @param sheet
     * @param rowNum
     * @return
     */
    private static Element generateTr(Sheet sheet, int rowNum, int startColNum, int endColNum){
        Cell[] cells = sheet.getRow(rowNum);
        int length = cells.length;
        Element tr = null;
        if(cells != null && length > 0){
            tr = new Element("tr");
            for(int i = startColNum; i <= endColNum; i ++){
                Element td = new Element("td");
                Cell cell = cells[i];
                String content = cell.getContents();
                if(StringUtils.isNotBlank(content)){
                    td.appendText(content);
                }
                if(!isMergedCell(sheet, cell)){
                    //td.attr("style", "border:1px solid black;");
                    tr.appendChild(td);
                }
            }
        }
        return tr;

    }

    /**
     * 根据行生成tr
     * @param sheet
     * @param rowNum
     * @return
     */
    private static Element generateTr(Sheet sheet, int rowNum){
        return generateTr(sheet,rowNum, 0, 4);
    }

    /**
     * 根据索引获取td元素
     * @param tbody
     * @param row
     * @param col
     * @return
     */
    private static Element getTdByIndex(Element tbody, int row, int col){
        Elements trs = tbody.children();
        Element tr = trs.get(row);
        Element td = null;
            if(col < tr.childNodeSize()){
                td = tr.children().get(col);
            } else {
                td = tr.child(tr.childNodeSize() - 1);
            }
        return td;
    }

    /**
     * 判断单元格是否为合并单元格
     * @param sheet
     * @param cell
     * @return
     */
    private static boolean isMergedCell(Sheet sheet, Cell cell){
        Range[] ranges = sheet.getMergedCells();
        boolean result = false;
        if(ranges != null && ranges.length > 0){
            for(Range range : ranges){
                Cell topLeft = range.getTopLeft();
                Cell bottomRight = range.getBottomRight();
                if(cell.getRow() >= topLeft.getRow()
                        && cell.getRow() <= bottomRight.getRow()
                        && cell.getColumn() >= topLeft.getColumn()
                        && cell.getColumn() <= bottomRight.getColumn()
                        && (cell.getRow() != topLeft.getRow() || cell.getColumn() != topLeft.getColumn())){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 获取单元格左边有多少合并单元格
     * @param sheet
     * @param cell
     * @return
     */
    private static int getCountOfLeftMergedCell(Sheet sheet, Cell cell, int startCol){
        Cell[] cells = sheet.getRow(cell.getRow());
        int result = 0;
        if(cells != null && cells.length > 0){
            for(int i = startCol; i < cell.getColumn(); i ++){
                if(isMergedCell(sheet, cells[i])){
                    result ++;
                }
            }
        }
        return result;
    }

    /**
     * 获取单元格上面有多少合并单元格
     * @param sheet
     * @param cell
     * @return
     */
    private static int getCountOfTopMergedCell(Sheet sheet, Cell cell, int startRow){
        Cell[] cells = sheet.getColumn(cell.getColumn());
        int result = 0;
        if(cells != null && cells.length > 0){
            for(int i = startRow; i < cell.getRow(); i ++){
                if(isMergedCell(sheet, cells[i])){
                    result ++;
                }
            }
        }
        return result;
    }

    /**
     * 将内容写到文件
     * @param element
     * @param fileName
     */
    private static void writeElementToFile(Element element, String fileName){
        String dir = "C:\\Users\\arano\\Desktop\\Temp\\";
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dir + fileName)));
            writer.print(element.toString());
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }
}
