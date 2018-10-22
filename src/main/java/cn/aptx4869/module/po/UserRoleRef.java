package cn.aptx4869.module.po;

import cn.aptx4869.common.entity.BasePo;

import java.util.Date;

public class UserRoleRef extends BasePo {
    /**
     * 主键
     */
    private String uuid;

    /**
     * 用户主键
     */
    private String userUuid;

    /**
     * 角色主键
     */
    private String roleUuid;

    /**
     * 描述
     */
    private String describe;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除时间
     */
    private Date deleteTme;

    /**
     * 创建者ID
     */
    private String creatorId;

    /**
     * 更新者ID
     */
    private String updaterId;

    /**
     * 删除者ID
     */
    private String deleterId;

    /**
     * 是否删除
     */
    private Integer deleted;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 主键
     * @return UUID 主键
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 主键
     * @param uuid 主键
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * 用户主键
     * @return USER_UUID 用户主键
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * 用户主键
     * @param userUuid 用户主键
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    /**
     * 角色主键
     * @return ROLE_UUID 角色主键
     */
    public String getRoleUuid() {
        return roleUuid;
    }

    /**
     * 角色主键
     * @param roleUuid 角色主键
     */
    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid == null ? null : roleUuid.trim();
    }

    /**
     * 描述
     * @return DESCRIBE 描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 描述
     * @param describe 描述
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return UPDATE_TIME 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 删除时间
     * @return DELETE_TME 删除时间
     */
    public Date getDeleteTme() {
        return deleteTme;
    }

    /**
     * 删除时间
     * @param deleteTme 删除时间
     */
    public void setDeleteTme(Date deleteTme) {
        this.deleteTme = deleteTme;
    }

    /**
     * 创建者ID
     * @return CREATOR_ID 创建者ID
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 创建者ID
     * @param creatorId 创建者ID
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * 更新者ID
     * @return UPDATER_ID 更新者ID
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * 更新者ID
     * @param updaterId 更新者ID
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * 删除者ID
     * @return DELETER_ID 删除者ID
     */
    public String getDeleterId() {
        return deleterId;
    }

    /**
     * 删除者ID
     * @param deleterId 删除者ID
     */
    public void setDeleterId(String deleterId) {
        this.deleterId = deleterId == null ? null : deleterId.trim();
    }

    /**
     * 是否删除
     * @return DELETED 是否删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 是否删除
     * @param deleted 是否删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 版本号
     * @return VERSION 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}