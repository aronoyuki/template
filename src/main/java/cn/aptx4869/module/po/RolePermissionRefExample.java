package cn.aptx4869.module.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RolePermissionRefExample {
    /**
     * ROLE_PERMISSION_REF
     */
    protected String orderByClause;

    /**
     * ROLE_PERMISSION_REF
     */
    protected boolean distinct;

    /**
     * ROLE_PERMISSION_REF
     */
    protected List<Criteria> oredCriteria;

    public RolePermissionRefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ROLE_PERMISSION_REF 2018-10-14
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNull() {
            addCriterion("ROLE_UUID is null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNotNull() {
            addCriterion("ROLE_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidEqualTo(String value) {
            addCriterion("ROLE_UUID =", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotEqualTo(String value) {
            addCriterion("ROLE_UUID <>", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThan(String value) {
            addCriterion("ROLE_UUID >", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_UUID >=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThan(String value) {
            addCriterion("ROLE_UUID <", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThanOrEqualTo(String value) {
            addCriterion("ROLE_UUID <=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLike(String value) {
            addCriterion("ROLE_UUID like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotLike(String value) {
            addCriterion("ROLE_UUID not like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIn(List<String> values) {
            addCriterion("ROLE_UUID in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotIn(List<String> values) {
            addCriterion("ROLE_UUID not in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidBetween(String value1, String value2) {
            addCriterion("ROLE_UUID between", value1, value2, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotBetween(String value1, String value2) {
            addCriterion("ROLE_UUID not between", value1, value2, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidIsNull() {
            addCriterion("PERMISSION_UUID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidIsNotNull() {
            addCriterion("PERMISSION_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidEqualTo(String value) {
            addCriterion("PERMISSION_UUID =", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotEqualTo(String value) {
            addCriterion("PERMISSION_UUID <>", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidGreaterThan(String value) {
            addCriterion("PERMISSION_UUID >", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_UUID >=", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLessThan(String value) {
            addCriterion("PERMISSION_UUID <", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_UUID <=", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLike(String value) {
            addCriterion("PERMISSION_UUID like", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotLike(String value) {
            addCriterion("PERMISSION_UUID not like", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidIn(List<String> values) {
            addCriterion("PERMISSION_UUID in", values, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotIn(List<String> values) {
            addCriterion("PERMISSION_UUID not in", values, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidBetween(String value1, String value2) {
            addCriterion("PERMISSION_UUID between", value1, value2, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_UUID not between", value1, value2, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("DESCRIBE =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("DESCRIBE <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("DESCRIBE >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIBE >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("DESCRIBE <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("DESCRIBE <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("DESCRIBE like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("DESCRIBE not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("DESCRIBE in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("DESCRIBE not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("DESCRIBE between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("DESCRIBE not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeIsNull() {
            addCriterion("DELETE_TME is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeIsNotNull() {
            addCriterion("DELETE_TME is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeEqualTo(Date value) {
            addCriterionForJDBCDate("DELETE_TME =", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DELETE_TME <>", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeGreaterThan(Date value) {
            addCriterionForJDBCDate("DELETE_TME >", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DELETE_TME >=", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeLessThan(Date value) {
            addCriterionForJDBCDate("DELETE_TME <", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DELETE_TME <=", value, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeIn(List<Date> values) {
            addCriterionForJDBCDate("DELETE_TME in", values, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DELETE_TME not in", values, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DELETE_TME between", value1, value2, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andDeleteTmeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DELETE_TME not between", value1, value2, "deleteTme");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("CREATOR_ID like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("CREATOR_ID not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("UPDATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("UPDATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(String value) {
            addCriterion("UPDATER_ID =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(String value) {
            addCriterion("UPDATER_ID <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(String value) {
            addCriterion("UPDATER_ID >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER_ID >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(String value) {
            addCriterion("UPDATER_ID <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATER_ID <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLike(String value) {
            addCriterion("UPDATER_ID like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotLike(String value) {
            addCriterion("UPDATER_ID not like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<String> values) {
            addCriterion("UPDATER_ID in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<String> values) {
            addCriterion("UPDATER_ID not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(String value1, String value2) {
            addCriterion("UPDATER_ID between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(String value1, String value2) {
            addCriterion("UPDATER_ID not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdIsNull() {
            addCriterion("DELETER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeleterIdIsNotNull() {
            addCriterion("DELETER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeleterIdEqualTo(String value) {
            addCriterion("DELETER_ID =", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdNotEqualTo(String value) {
            addCriterion("DELETER_ID <>", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdGreaterThan(String value) {
            addCriterion("DELETER_ID >", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdGreaterThanOrEqualTo(String value) {
            addCriterion("DELETER_ID >=", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdLessThan(String value) {
            addCriterion("DELETER_ID <", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdLessThanOrEqualTo(String value) {
            addCriterion("DELETER_ID <=", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdLike(String value) {
            addCriterion("DELETER_ID like", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdNotLike(String value) {
            addCriterion("DELETER_ID not like", value, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdIn(List<String> values) {
            addCriterion("DELETER_ID in", values, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdNotIn(List<String> values) {
            addCriterion("DELETER_ID not in", values, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdBetween(String value1, String value2) {
            addCriterion("DELETER_ID between", value1, value2, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeleterIdNotBetween(String value1, String value2) {
            addCriterion("DELETER_ID not between", value1, value2, "deleterId");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * ROLE_PERMISSION_REF
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ROLE_PERMISSION_REF 2018-10-14
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}