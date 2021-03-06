package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorshipExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public WorshipExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
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

		public Criteria andWorshipSeqIsNull() {
			addCriterion("worship_seq is null");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqIsNotNull() {
			addCriterion("worship_seq is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqEqualTo(Integer value) {
			addCriterion("worship_seq =", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotEqualTo(Integer value) {
			addCriterion("worship_seq <>", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqGreaterThan(Integer value) {
			addCriterion("worship_seq >", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqGreaterThanOrEqualTo(Integer value) {
			addCriterion("worship_seq >=", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqLessThan(Integer value) {
			addCriterion("worship_seq <", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqLessThanOrEqualTo(Integer value) {
			addCriterion("worship_seq <=", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqIn(List<Integer> values) {
			addCriterion("worship_seq in", values, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotIn(List<Integer> values) {
			addCriterion("worship_seq not in", values, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqBetween(Integer value1, Integer value2) {
			addCriterion("worship_seq between", value1, value2, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotBetween(Integer value1, Integer value2) {
			addCriterion("worship_seq not between", value1, value2,
					"worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipNameIsNull() {
			addCriterion("worship_name is null");
			return (Criteria) this;
		}

		public Criteria andWorshipNameIsNotNull() {
			addCriterion("worship_name is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipNameEqualTo(String value) {
			addCriterion("worship_name =", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameNotEqualTo(String value) {
			addCriterion("worship_name <>", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameGreaterThan(String value) {
			addCriterion("worship_name >", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameGreaterThanOrEqualTo(String value) {
			addCriterion("worship_name >=", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameLessThan(String value) {
			addCriterion("worship_name <", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameLessThanOrEqualTo(String value) {
			addCriterion("worship_name <=", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameLike(String value) {
			addCriterion("worship_name like", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameNotLike(String value) {
			addCriterion("worship_name not like", value, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameIn(List<String> values) {
			addCriterion("worship_name in", values, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameNotIn(List<String> values) {
			addCriterion("worship_name not in", values, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameBetween(String value1, String value2) {
			addCriterion("worship_name between", value1, value2, "worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipNameNotBetween(String value1, String value2) {
			addCriterion("worship_name not between", value1, value2,
					"worshipName");
			return (Criteria) this;
		}

		public Criteria andWorshipDayIsNull() {
			addCriterion("worship_day is null");
			return (Criteria) this;
		}

		public Criteria andWorshipDayIsNotNull() {
			addCriterion("worship_day is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipDayEqualTo(String value) {
			addCriterion("worship_day =", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayNotEqualTo(String value) {
			addCriterion("worship_day <>", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayGreaterThan(String value) {
			addCriterion("worship_day >", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayGreaterThanOrEqualTo(String value) {
			addCriterion("worship_day >=", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayLessThan(String value) {
			addCriterion("worship_day <", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayLessThanOrEqualTo(String value) {
			addCriterion("worship_day <=", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayLike(String value) {
			addCriterion("worship_day like", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayNotLike(String value) {
			addCriterion("worship_day not like", value, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayIn(List<String> values) {
			addCriterion("worship_day in", values, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayNotIn(List<String> values) {
			addCriterion("worship_day not in", values, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayBetween(String value1, String value2) {
			addCriterion("worship_day between", value1, value2, "worshipDay");
			return (Criteria) this;
		}

		public Criteria andWorshipDayNotBetween(String value1, String value2) {
			addCriterion("worship_day not between", value1, value2,
					"worshipDay");
			return (Criteria) this;
		}

		public Criteria andRegIdIsNull() {
			addCriterion("reg_id is null");
			return (Criteria) this;
		}

		public Criteria andRegIdIsNotNull() {
			addCriterion("reg_id is not null");
			return (Criteria) this;
		}

		public Criteria andRegIdEqualTo(String value) {
			addCriterion("reg_id =", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotEqualTo(String value) {
			addCriterion("reg_id <>", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdGreaterThan(String value) {
			addCriterion("reg_id >", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdGreaterThanOrEqualTo(String value) {
			addCriterion("reg_id >=", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdLessThan(String value) {
			addCriterion("reg_id <", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdLessThanOrEqualTo(String value) {
			addCriterion("reg_id <=", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdLike(String value) {
			addCriterion("reg_id like", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotLike(String value) {
			addCriterion("reg_id not like", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdIn(List<String> values) {
			addCriterion("reg_id in", values, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotIn(List<String> values) {
			addCriterion("reg_id not in", values, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdBetween(String value1, String value2) {
			addCriterion("reg_id between", value1, value2, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotBetween(String value1, String value2) {
			addCriterion("reg_id not between", value1, value2, "regId");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table worship
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 14 14:25:17 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}