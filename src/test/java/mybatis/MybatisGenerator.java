package mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huy
 * @date 2018/7/13 16:54
 * @description
 */
public class MybatisGenerator {
    public static void main(String[] args) throws Exception {
        //setTables();
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库所有表
     * @throws Exception
     */
    private static void setTables() throws Exception {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        //通过DocumentBuilder创建doc的文档对象
        Document doc = db.parse(is);
        //创建XPath
        XPath xpath = XPathFactory.newInstance().newXPath();
        //第一个参数就是xpath,第二参数就是文档
        NodeList list = (NodeList)xpath.evaluate("/generatorConfiguration/context/jdbcConnection", doc, XPathConstants.NODESET);
        //context
        NodeList contextList = (NodeList)xpath.evaluate("/generatorConfiguration/context", doc, XPathConstants.NODESET);
        //遍历输出相应的结果
        NamedNodeMap map = list.item(0).getAttributes();
        String driverClass = map.getNamedItem("driverClass").getNodeValue();
        String url = map.getNamedItem("connectionURL").getNodeValue();
        String user = map.getNamedItem("userId").getNodeValue();
        String password = map.getNamedItem("password").getNodeValue();

        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select table_name from user_tables";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String tableName = resultSet.getString("table_name");
            org.w3c.dom.Element tableNode = doc.createElement("table");
            contextList.item(0).appendChild(tableNode);
            tableNode.setAttribute("tableName", tableName);
            System.out.println(tableName);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(doc);// 用document构造数据源
        classloader.getResource(".").getPath();
        StreamResult result = new StreamResult(new File(classloader.getResource(".").getPath() + "/books_bak.xml"));
        transformer.transform(domSource, result);



    }
}
