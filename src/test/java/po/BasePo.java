package po;

import java.util.Date;

/**
 * @author huy
 * @date 2018/9/29 16:08
 * @description 数据库公有字段
 */
public class BasePo {
   /* *//**
     * 插入时间
     *//*
    private Date sysCreateTime;

    *//**
     * 修改时间
     *//*
    private Date sysUpdateTime;

    *//**
     * 删除时间
     *//*
    private Date sysDeleteTime;

    *//**
     * 插入人ID
     *//*
    private String sysCreateId;

    *//**
     * 修改人ID
     *//*
    private String sysUpdateId;

    *//**
     * 删除人ID
     *//*
    private String sysDeleteId;

    *//**
     * 区域
     *//*
    private String dataSource;

    *//**
     * 是否删除
     *//*
    private Integer isDeleted;

    *//**
     * 版本号
     *//*
    private Integer version;

    public BaseEntity(){
        this.isDeleted = 0;
        this.sysCreateTime = new Date();
        this.sysUpdateTime = new Date();
        this.version = 1;
    }

    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    public Date getSysDeleteTime() {
        return sysDeleteTime;
    }

    public void setSysDeleteTime(Date sysDeleteTime) {
        this.sysDeleteTime = sysDeleteTime;
    }

    public String getSysCreateId() {
        return sysCreateId;
    }

    public void setSysCreateId(String sysCreateId) {
        this.sysCreateId = sysCreateId;
    }

    public String getSysUpdateId() {
        return sysUpdateId;
    }

    public void setSysUpdateId(String sysUpdateId) {
        this.sysUpdateId = sysUpdateId;
    }

    public String getSysDeleteId() {
        return sysDeleteId;
    }

    public void setSysDeleteId(String sysDeleteId) {
        this.sysDeleteId = sysDeleteId;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }*/
}
