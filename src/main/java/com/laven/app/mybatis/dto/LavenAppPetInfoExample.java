package com.laven.app.mybatis.dto;

import java.util.ArrayList;
import java.util.List;

public class LavenAppPetInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LavenAppPetInfoExample() {
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

        public Criteria andPetuseridIsNull() {
            addCriterion("petUserId is null");
            return (Criteria) this;
        }

        public Criteria andPetuseridIsNotNull() {
            addCriterion("petUserId is not null");
            return (Criteria) this;
        }

        public Criteria andPetuseridEqualTo(String value) {
            addCriterion("petUserId =", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridNotEqualTo(String value) {
            addCriterion("petUserId <>", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridGreaterThan(String value) {
            addCriterion("petUserId >", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridGreaterThanOrEqualTo(String value) {
            addCriterion("petUserId >=", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridLessThan(String value) {
            addCriterion("petUserId <", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridLessThanOrEqualTo(String value) {
            addCriterion("petUserId <=", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridLike(String value) {
            addCriterion("petUserId like", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridNotLike(String value) {
            addCriterion("petUserId not like", value, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridIn(List<String> values) {
            addCriterion("petUserId in", values, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridNotIn(List<String> values) {
            addCriterion("petUserId not in", values, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridBetween(String value1, String value2) {
            addCriterion("petUserId between", value1, value2, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetuseridNotBetween(String value1, String value2) {
            addCriterion("petUserId not between", value1, value2, "petuserid");
            return (Criteria) this;
        }

        public Criteria andPetidIsNull() {
            addCriterion("petId is null");
            return (Criteria) this;
        }

        public Criteria andPetidIsNotNull() {
            addCriterion("petId is not null");
            return (Criteria) this;
        }

        public Criteria andPetidEqualTo(String value) {
            addCriterion("petId =", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotEqualTo(String value) {
            addCriterion("petId <>", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThan(String value) {
            addCriterion("petId >", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThanOrEqualTo(String value) {
            addCriterion("petId >=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThan(String value) {
            addCriterion("petId <", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThanOrEqualTo(String value) {
            addCriterion("petId <=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLike(String value) {
            addCriterion("petId like", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotLike(String value) {
            addCriterion("petId not like", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidIn(List<String> values) {
            addCriterion("petId in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotIn(List<String> values) {
            addCriterion("petId not in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidBetween(String value1, String value2) {
            addCriterion("petId between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotBetween(String value1, String value2) {
            addCriterion("petId not between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNull() {
            addCriterion("petName is null");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNotNull() {
            addCriterion("petName is not null");
            return (Criteria) this;
        }

        public Criteria andPetnameEqualTo(String value) {
            addCriterion("petName =", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotEqualTo(String value) {
            addCriterion("petName <>", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThan(String value) {
            addCriterion("petName >", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThanOrEqualTo(String value) {
            addCriterion("petName >=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThan(String value) {
            addCriterion("petName <", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThanOrEqualTo(String value) {
            addCriterion("petName <=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLike(String value) {
            addCriterion("petName like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotLike(String value) {
            addCriterion("petName not like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameIn(List<String> values) {
            addCriterion("petName in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotIn(List<String> values) {
            addCriterion("petName not in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameBetween(String value1, String value2) {
            addCriterion("petName between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotBetween(String value1, String value2) {
            addCriterion("petName not between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameIsNull() {
            addCriterion("petShortName is null");
            return (Criteria) this;
        }

        public Criteria andPetshortnameIsNotNull() {
            addCriterion("petShortName is not null");
            return (Criteria) this;
        }

        public Criteria andPetshortnameEqualTo(String value) {
            addCriterion("petShortName =", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameNotEqualTo(String value) {
            addCriterion("petShortName <>", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameGreaterThan(String value) {
            addCriterion("petShortName >", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("petShortName >=", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameLessThan(String value) {
            addCriterion("petShortName <", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameLessThanOrEqualTo(String value) {
            addCriterion("petShortName <=", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameLike(String value) {
            addCriterion("petShortName like", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameNotLike(String value) {
            addCriterion("petShortName not like", value, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameIn(List<String> values) {
            addCriterion("petShortName in", values, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameNotIn(List<String> values) {
            addCriterion("petShortName not in", values, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameBetween(String value1, String value2) {
            addCriterion("petShortName between", value1, value2, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetshortnameNotBetween(String value1, String value2) {
            addCriterion("petShortName not between", value1, value2, "petshortname");
            return (Criteria) this;
        }

        public Criteria andPetageIsNull() {
            addCriterion("petAge is null");
            return (Criteria) this;
        }

        public Criteria andPetageIsNotNull() {
            addCriterion("petAge is not null");
            return (Criteria) this;
        }

        public Criteria andPetageEqualTo(Integer value) {
            addCriterion("petAge =", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageNotEqualTo(Integer value) {
            addCriterion("petAge <>", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageGreaterThan(Integer value) {
            addCriterion("petAge >", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageGreaterThanOrEqualTo(Integer value) {
            addCriterion("petAge >=", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageLessThan(Integer value) {
            addCriterion("petAge <", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageLessThanOrEqualTo(Integer value) {
            addCriterion("petAge <=", value, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageIn(List<Integer> values) {
            addCriterion("petAge in", values, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageNotIn(List<Integer> values) {
            addCriterion("petAge not in", values, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageBetween(Integer value1, Integer value2) {
            addCriterion("petAge between", value1, value2, "petage");
            return (Criteria) this;
        }

        public Criteria andPetageNotBetween(Integer value1, Integer value2) {
            addCriterion("petAge not between", value1, value2, "petage");
            return (Criteria) this;
        }

        public Criteria andPetdetailIsNull() {
            addCriterion("petDetail is null");
            return (Criteria) this;
        }

        public Criteria andPetdetailIsNotNull() {
            addCriterion("petDetail is not null");
            return (Criteria) this;
        }

        public Criteria andPetdetailEqualTo(String value) {
            addCriterion("petDetail =", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailNotEqualTo(String value) {
            addCriterion("petDetail <>", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailGreaterThan(String value) {
            addCriterion("petDetail >", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailGreaterThanOrEqualTo(String value) {
            addCriterion("petDetail >=", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailLessThan(String value) {
            addCriterion("petDetail <", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailLessThanOrEqualTo(String value) {
            addCriterion("petDetail <=", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailLike(String value) {
            addCriterion("petDetail like", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailNotLike(String value) {
            addCriterion("petDetail not like", value, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailIn(List<String> values) {
            addCriterion("petDetail in", values, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailNotIn(List<String> values) {
            addCriterion("petDetail not in", values, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailBetween(String value1, String value2) {
            addCriterion("petDetail between", value1, value2, "petdetail");
            return (Criteria) this;
        }

        public Criteria andPetdetailNotBetween(String value1, String value2) {
            addCriterion("petDetail not between", value1, value2, "petdetail");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }
    }

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