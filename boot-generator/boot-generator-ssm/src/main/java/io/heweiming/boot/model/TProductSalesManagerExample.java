package io.heweiming.boot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TProductSalesManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TProductSalesManagerExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idIsNull() {
            addCriterion("sales_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idIsNotNull() {
            addCriterion("sales_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idEqualTo(Integer value) {
            addCriterion("sales_manager_id =", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idNotEqualTo(Integer value) {
            addCriterion("sales_manager_id <>", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idGreaterThan(Integer value) {
            addCriterion("sales_manager_id >", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_manager_id >=", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idLessThan(Integer value) {
            addCriterion("sales_manager_id <", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idLessThanOrEqualTo(Integer value) {
            addCriterion("sales_manager_id <=", value, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idIn(List<Integer> values) {
            addCriterion("sales_manager_id in", values, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idNotIn(List<Integer> values) {
            addCriterion("sales_manager_id not in", values, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idBetween(Integer value1, Integer value2) {
            addCriterion("sales_manager_id between", value1, value2, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_manager_id not between", value1, value2, "sales_manager_id");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameIsNull() {
            addCriterion("sales_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameIsNotNull() {
            addCriterion("sales_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameEqualTo(String value) {
            addCriterion("sales_manager_name =", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameNotEqualTo(String value) {
            addCriterion("sales_manager_name <>", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameGreaterThan(String value) {
            addCriterion("sales_manager_name >", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sales_manager_name >=", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameLessThan(String value) {
            addCriterion("sales_manager_name <", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameLessThanOrEqualTo(String value) {
            addCriterion("sales_manager_name <=", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameLike(String value) {
            addCriterion("sales_manager_name like", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameNotLike(String value) {
            addCriterion("sales_manager_name not like", value, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameIn(List<String> values) {
            addCriterion("sales_manager_name in", values, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameNotIn(List<String> values) {
            addCriterion("sales_manager_name not in", values, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameBetween(String value1, String value2) {
            addCriterion("sales_manager_name between", value1, value2, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andSales_manager_nameNotBetween(String value1, String value2) {
            addCriterion("sales_manager_name not between", value1, value2, "sales_manager_name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idEqualTo(String value) {
            addCriterion("create_user_id =", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idGreaterThan(String value) {
            addCriterion("create_user_id >", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idLessThan(String value) {
            addCriterion("create_user_id <", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idLike(String value) {
            addCriterion("create_user_id like", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idNotLike(String value) {
            addCriterion("create_user_id not like", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idIn(List<String> values) {
            addCriterion("create_user_id in", values, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_user_idNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameIsNull() {
            addCriterion("create_username is null");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameIsNotNull() {
            addCriterion("create_username is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameEqualTo(String value) {
            addCriterion("create_username =", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameNotEqualTo(String value) {
            addCriterion("create_username <>", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameGreaterThan(String value) {
            addCriterion("create_username >", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("create_username >=", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameLessThan(String value) {
            addCriterion("create_username <", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameLessThanOrEqualTo(String value) {
            addCriterion("create_username <=", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameLike(String value) {
            addCriterion("create_username like", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameNotLike(String value) {
            addCriterion("create_username not like", value, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameIn(List<String> values) {
            addCriterion("create_username in", values, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameNotIn(List<String> values) {
            addCriterion("create_username not in", values, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameBetween(String value1, String value2) {
            addCriterion("create_username between", value1, value2, "create_username");
            return (Criteria) this;
        }

        public Criteria andCreate_usernameNotBetween(String value1, String value2) {
            addCriterion("create_username not between", value1, value2, "create_username");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModify_dateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThan(Date value) {
            addCriterion("modify_date <", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_user_idIsNull() {
            addCriterion("modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModify_user_idIsNotNull() {
            addCriterion("modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModify_user_idEqualTo(String value) {
            addCriterion("modify_user_id =", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idNotEqualTo(String value) {
            addCriterion("modify_user_id <>", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idGreaterThan(String value) {
            addCriterion("modify_user_id >", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user_id >=", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idLessThan(String value) {
            addCriterion("modify_user_id <", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idLessThanOrEqualTo(String value) {
            addCriterion("modify_user_id <=", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idLike(String value) {
            addCriterion("modify_user_id like", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idNotLike(String value) {
            addCriterion("modify_user_id not like", value, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idIn(List<String> values) {
            addCriterion("modify_user_id in", values, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idNotIn(List<String> values) {
            addCriterion("modify_user_id not in", values, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idBetween(String value1, String value2) {
            addCriterion("modify_user_id between", value1, value2, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_user_idNotBetween(String value1, String value2) {
            addCriterion("modify_user_id not between", value1, value2, "modify_user_id");
            return (Criteria) this;
        }

        public Criteria andModify_usernameIsNull() {
            addCriterion("modify_username is null");
            return (Criteria) this;
        }

        public Criteria andModify_usernameIsNotNull() {
            addCriterion("modify_username is not null");
            return (Criteria) this;
        }

        public Criteria andModify_usernameEqualTo(String value) {
            addCriterion("modify_username =", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameNotEqualTo(String value) {
            addCriterion("modify_username <>", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameGreaterThan(String value) {
            addCriterion("modify_username >", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("modify_username >=", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameLessThan(String value) {
            addCriterion("modify_username <", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameLessThanOrEqualTo(String value) {
            addCriterion("modify_username <=", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameLike(String value) {
            addCriterion("modify_username like", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameNotLike(String value) {
            addCriterion("modify_username not like", value, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameIn(List<String> values) {
            addCriterion("modify_username in", values, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameNotIn(List<String> values) {
            addCriterion("modify_username not in", values, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameBetween(String value1, String value2) {
            addCriterion("modify_username between", value1, value2, "modify_username");
            return (Criteria) this;
        }

        public Criteria andModify_usernameNotBetween(String value1, String value2) {
            addCriterion("modify_username not between", value1, value2, "modify_username");
            return (Criteria) this;
        }

        public Criteria andDelete_dateIsNull() {
            addCriterion("delete_date is null");
            return (Criteria) this;
        }

        public Criteria andDelete_dateIsNotNull() {
            addCriterion("delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_dateEqualTo(Date value) {
            addCriterion("delete_date =", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateNotEqualTo(Date value) {
            addCriterion("delete_date <>", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateGreaterThan(Date value) {
            addCriterion("delete_date >", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_date >=", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateLessThan(Date value) {
            addCriterion("delete_date <", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateLessThanOrEqualTo(Date value) {
            addCriterion("delete_date <=", value, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateIn(List<Date> values) {
            addCriterion("delete_date in", values, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateNotIn(List<Date> values) {
            addCriterion("delete_date not in", values, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateBetween(Date value1, Date value2) {
            addCriterion("delete_date between", value1, value2, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_dateNotBetween(Date value1, Date value2) {
            addCriterion("delete_date not between", value1, value2, "delete_date");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idIsNull() {
            addCriterion("delete_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idIsNotNull() {
            addCriterion("delete_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idEqualTo(String value) {
            addCriterion("delete_user_id =", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idNotEqualTo(String value) {
            addCriterion("delete_user_id <>", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idGreaterThan(String value) {
            addCriterion("delete_user_id >", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idGreaterThanOrEqualTo(String value) {
            addCriterion("delete_user_id >=", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idLessThan(String value) {
            addCriterion("delete_user_id <", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idLessThanOrEqualTo(String value) {
            addCriterion("delete_user_id <=", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idLike(String value) {
            addCriterion("delete_user_id like", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idNotLike(String value) {
            addCriterion("delete_user_id not like", value, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idIn(List<String> values) {
            addCriterion("delete_user_id in", values, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idNotIn(List<String> values) {
            addCriterion("delete_user_id not in", values, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idBetween(String value1, String value2) {
            addCriterion("delete_user_id between", value1, value2, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_user_idNotBetween(String value1, String value2) {
            addCriterion("delete_user_id not between", value1, value2, "delete_user_id");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameIsNull() {
            addCriterion("delete_username is null");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameIsNotNull() {
            addCriterion("delete_username is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameEqualTo(String value) {
            addCriterion("delete_username =", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameNotEqualTo(String value) {
            addCriterion("delete_username <>", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameGreaterThan(String value) {
            addCriterion("delete_username >", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("delete_username >=", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameLessThan(String value) {
            addCriterion("delete_username <", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameLessThanOrEqualTo(String value) {
            addCriterion("delete_username <=", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameLike(String value) {
            addCriterion("delete_username like", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameNotLike(String value) {
            addCriterion("delete_username not like", value, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameIn(List<String> values) {
            addCriterion("delete_username in", values, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameNotIn(List<String> values) {
            addCriterion("delete_username not in", values, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameBetween(String value1, String value2) {
            addCriterion("delete_username between", value1, value2, "delete_username");
            return (Criteria) this;
        }

        public Criteria andDelete_usernameNotBetween(String value1, String value2) {
            addCriterion("delete_username not between", value1, value2, "delete_username");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "is_deleted");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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