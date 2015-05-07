package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DepartmentExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andDeptSeqIsNull() {
			addCriterion("dept_seq is null");
			return (Criteria) this;
		}

		public Criteria andDeptSeqIsNotNull() {
			addCriterion("dept_seq is not null");
			return (Criteria) this;
		}

		public Criteria andDeptSeqEqualTo(Long value) {
			addCriterion("dept_seq =", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqNotEqualTo(Long value) {
			addCriterion("dept_seq <>", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqGreaterThan(Long value) {
			addCriterion("dept_seq >", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("dept_seq >=", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqLessThan(Long value) {
			addCriterion("dept_seq <", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqLessThanOrEqualTo(Long value) {
			addCriterion("dept_seq <=", value, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqIn(List<Long> values) {
			addCriterion("dept_seq in", values, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqNotIn(List<Long> values) {
			addCriterion("dept_seq not in", values, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqBetween(Long value1, Long value2) {
			addCriterion("dept_seq between", value1, value2, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptSeqNotBetween(Long value1, Long value2) {
			addCriterion("dept_seq not between", value1, value2, "deptSeq");
			return (Criteria) this;
		}

		public Criteria andDeptNameIsNull() {
			addCriterion("dept_name is null");
			return (Criteria) this;
		}

		public Criteria andDeptNameIsNotNull() {
			addCriterion("dept_name is not null");
			return (Criteria) this;
		}

		public Criteria andDeptNameEqualTo(String value) {
			addCriterion("dept_name =", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotEqualTo(String value) {
			addCriterion("dept_name <>", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameGreaterThan(String value) {
			addCriterion("dept_name >", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
			addCriterion("dept_name >=", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLessThan(String value) {
			addCriterion("dept_name <", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLessThanOrEqualTo(String value) {
			addCriterion("dept_name <=", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameLike(String value) {
			addCriterion("dept_name like", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotLike(String value) {
			addCriterion("dept_name not like", value, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameIn(List<String> values) {
			addCriterion("dept_name in", values, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotIn(List<String> values) {
			addCriterion("dept_name not in", values, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameBetween(String value1, String value2) {
			addCriterion("dept_name between", value1, value2, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptNameNotBetween(String value1, String value2) {
			addCriterion("dept_name not between", value1, value2, "deptName");
			return (Criteria) this;
		}

		public Criteria andDeptTypeIsNull() {
			addCriterion("dept_type is null");
			return (Criteria) this;
		}

		public Criteria andDeptTypeIsNotNull() {
			addCriterion("dept_type is not null");
			return (Criteria) this;
		}

		public Criteria andDeptTypeEqualTo(String value) {
			addCriterion("dept_type =", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeNotEqualTo(String value) {
			addCriterion("dept_type <>", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeGreaterThan(String value) {
			addCriterion("dept_type >", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
			addCriterion("dept_type >=", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeLessThan(String value) {
			addCriterion("dept_type <", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeLessThanOrEqualTo(String value) {
			addCriterion("dept_type <=", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeLike(String value) {
			addCriterion("dept_type like", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeNotLike(String value) {
			addCriterion("dept_type not like", value, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeIn(List<String> values) {
			addCriterion("dept_type in", values, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeNotIn(List<String> values) {
			addCriterion("dept_type not in", values, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeBetween(String value1, String value2) {
			addCriterion("dept_type between", value1, value2, "deptType");
			return (Criteria) this;
		}

		public Criteria andDeptTypeNotBetween(String value1, String value2) {
			addCriterion("dept_type not between", value1, value2, "deptType");
			return (Criteria) this;
		}

		public Criteria andLeaderIdIsNull() {
			addCriterion("leader_id is null");
			return (Criteria) this;
		}

		public Criteria andLeaderIdIsNotNull() {
			addCriterion("leader_id is not null");
			return (Criteria) this;
		}

		public Criteria andLeaderIdEqualTo(String value) {
			addCriterion("leader_id =", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdNotEqualTo(String value) {
			addCriterion("leader_id <>", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdGreaterThan(String value) {
			addCriterion("leader_id >", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdGreaterThanOrEqualTo(String value) {
			addCriterion("leader_id >=", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdLessThan(String value) {
			addCriterion("leader_id <", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdLessThanOrEqualTo(String value) {
			addCriterion("leader_id <=", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdLike(String value) {
			addCriterion("leader_id like", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdNotLike(String value) {
			addCriterion("leader_id not like", value, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdIn(List<String> values) {
			addCriterion("leader_id in", values, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdNotIn(List<String> values) {
			addCriterion("leader_id not in", values, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdBetween(String value1, String value2) {
			addCriterion("leader_id between", value1, value2, "leaderId");
			return (Criteria) this;
		}

		public Criteria andLeaderIdNotBetween(String value1, String value2) {
			addCriterion("leader_id not between", value1, value2, "leaderId");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("descripton =", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("descripton <>", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("descripton >", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("descripton >=", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("descripton <", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("descripton <=", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("descripton like", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("descripton not like", value, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("descripton in", values, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("descripton not in", values, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("descripton between", value1, value2, "descripton");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("descripton not between", value1, value2, "descripton");
			return (Criteria) this;
		}

		public Criteria andParentSeqIsNull() {
			addCriterion("parent_seq is null");
			return (Criteria) this;
		}

		public Criteria andParentSeqIsNotNull() {
			addCriterion("parent_seq is not null");
			return (Criteria) this;
		}

		public Criteria andParentSeqEqualTo(Long value) {
			addCriterion("parent_seq =", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqNotEqualTo(Long value) {
			addCriterion("parent_seq <>", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqGreaterThan(Long value) {
			addCriterion("parent_seq >", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("parent_seq >=", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqLessThan(Long value) {
			addCriterion("parent_seq <", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqLessThanOrEqualTo(Long value) {
			addCriterion("parent_seq <=", value, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqIn(List<Long> values) {
			addCriterion("parent_seq in", values, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqNotIn(List<Long> values) {
			addCriterion("parent_seq not in", values, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqBetween(Long value1, Long value2) {
			addCriterion("parent_seq between", value1, value2, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andParentSeqNotBetween(Long value1, Long value2) {
			addCriterion("parent_seq not between", value1, value2, "parentSeq");
			return (Criteria) this;
		}

		public Criteria andRegTimeIsNull() {
			addCriterion("reg_time is null");
			return (Criteria) this;
		}

		public Criteria andRegTimeIsNotNull() {
			addCriterion("reg_time is not null");
			return (Criteria) this;
		}

		public Criteria andRegTimeEqualTo(Date value) {
			addCriterion("reg_time =", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeNotEqualTo(Date value) {
			addCriterion("reg_time <>", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeGreaterThan(Date value) {
			addCriterion("reg_time >", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("reg_time >=", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeLessThan(Date value) {
			addCriterion("reg_time <", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeLessThanOrEqualTo(Date value) {
			addCriterion("reg_time <=", value, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeIn(List<Date> values) {
			addCriterion("reg_time in", values, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeNotIn(List<Date> values) {
			addCriterion("reg_time not in", values, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeBetween(Date value1, Date value2) {
			addCriterion("reg_time between", value1, value2, "regTime");
			return (Criteria) this;
		}

		public Criteria andRegTimeNotBetween(Date value1, Date value2) {
			addCriterion("reg_time not between", value1, value2, "regTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	protected String limitByClause;
	
	
	public String getLimitByClause() {
		return limitByClause;
	}

	public void setLimitByClause(String limitByClause) {
		this.limitByClause = limitByClause;
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table department
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 08 10:31:21 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}