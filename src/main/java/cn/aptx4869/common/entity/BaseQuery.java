package cn.aptx4869.common.entity;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * @author huy
 * @date 2018/10/23 9:59
 * @description 基础查询对象，定义一些通用查询参数
 */
public class BaseQuery implements Serializable {
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 分页大小
     */
    private Integer pageSize;

    public BaseQuery() {
        pageNum = 1;
        pageSize = 10;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
