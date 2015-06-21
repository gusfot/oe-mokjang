package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendWorshipExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public AttendWorshipExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
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

		public Criteria andAttendWorshipSeqIsNull() {
			addCriterion("attend_worship_seq is null");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqIsNotNull() {
			addCriterion("attend_worship_seq is not null");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqEqualTo(Long value) {
			addCriterion("attend_worship_seq =", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqNotEqualTo(Long value) {
			addCriterion("attend_worship_seq <>", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqGreaterThan(Long value) {
			addCriterion("attend_worship_seq >", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("attend_worship_seq >=", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqLessThan(Long value) {
			addCriterion("attend_worship_seq <", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqLessThanOrEqualTo(Long value) {
			addCriterion("attend_worship_seq <=", value, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqIn(List<Long> values) {
			addCriterion("attend_worship_seq in", values, "attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqNotIn(List<Long> values) {
			addCriterion("attend_worship_seq not in", values,
					"attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqBetween(Long value1, Long value2) {
			addCriterion("attend_worship_seq between", value1, value2,
					"attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andAttendWorshipSeqNotBetween(Long value1, Long value2) {
			addCriterion("attend_worship_seq not between", value1, value2,
					"attendWorshipSeq");
			return (Criteria) this;
		}

		public Criteria andWeeksIsNull() {
			addCriterion("weeks is null");
			return (Criteria) this;
		}

		public Criteria andWeeksIsNotNull() {
			addCriterion("weeks is not null");
			return (Criteria) this;
		}

		public Criteria andWeeksEqualTo(Long value) {
			addCriterion("weeks =", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotEqualTo(Long value) {
			addCriterion("weeks <>", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksGreaterThan(Long value) {
			addCriterion("weeks >", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksGreaterThanOrEqualTo(Long value) {
			addCriterion("weeks >=", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksLessThan(Long value) {
			addCriterion("weeks <", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksLessThanOrEqualTo(Long value) {
			addCriterion("weeks <=", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksIn(List<Long> values) {
			addCriterion("weeks in", values, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotIn(List<Long> values) {
			addCriterion("weeks not in", values, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksBetween(Long value1, Long value2) {
			addCriterion("weeks between", value1, value2, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotBetween(Long value1, Long value2) {
			addCriterion("weeks not between", value1, value2, "weeks");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqIsNull() {
			addCriterion("worship_seq is null");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqIsNotNull() {
			addCriterion("worship_seq is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqEqualTo(Long value) {
			addCriterion("worship_seq =", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotEqualTo(Long value) {
			addCriterion("worship_seq <>", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqGreaterThan(Long value) {
			addCriterion("worship_seq >", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("worship_seq >=", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqLessThan(Long value) {
			addCriterion("worship_seq <", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqLessThanOrEqualTo(Long value) {
			addCriterion("worship_seq <=", value, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqIn(List<Long> values) {
			addCriterion("worship_seq in", values, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotIn(List<Long> values) {
			addCriterion("worship_seq not in", values, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqBetween(Long value1, Long value2) {
			addCriterion("worship_seq between", value1, value2, "worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipSeqNotBetween(Long value1, Long value2) {
			addCriterion("worship_seq not between", value1, value2,
					"worshipSeq");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesIsNull() {
			addCriterion("worship_times is null");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesIsNotNull() {
			addCriterion("worship_times is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesEqualTo(Integer value) {
			addCriterion("worship_times =", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesNotEqualTo(Integer value) {
			addCriterion("worship_times <>", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesGreaterThan(Integer value) {
			addCriterion("worship_times >", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesGreaterThanOrEqualTo(Integer value) {
			addCriterion("worship_times >=", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesLessThan(Integer value) {
			addCriterion("worship_times <", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesLessThanOrEqualTo(Integer value) {
			addCriterion("worship_times <=", value, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesIn(List<Integer> values) {
			addCriterion("worship_times in", values, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesNotIn(List<Integer> values) {
			addCriterion("worship_times not in", values, "worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesBetween(Integer value1, Integer value2) {
			addCriterion("worship_times between", value1, value2,
					"worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipTimesNotBetween(Integer value1, Integer value2) {
			addCriterion("worship_times not between", value1, value2,
					"worshipTimes");
			return (Criteria) this;
		}

		public Criteria andWorshipDateIsNull() {
			addCriterion("worship_date is null");
			return (Criteria) this;
		}

		public Criteria andWorshipDateIsNotNull() {
			addCriterion("worship_date is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipDateEqualTo(String value) {
			addCriterion("worship_date =", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateNotEqualTo(String value) {
			addCriterion("worship_date <>", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateGreaterThan(String value) {
			addCriterion("worship_date >", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateGreaterThanOrEqualTo(String value) {
			addCriterion("worship_date >=", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateLessThan(String value) {
			addCriterion("worship_date <", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateLessThanOrEqualTo(String value) {
			addCriterion("worship_date <=", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateLike(String value) {
			addCriterion("worship_date like", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateNotLike(String value) {
			addCriterion("worship_date not like", value, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateIn(List<String> values) {
			addCriterion("worship_date in", values, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateNotIn(List<String> values) {
			addCriterion("worship_date not in", values, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateBetween(String value1, String value2) {
			addCriterion("worship_date between", value1, value2, "worshipDate");
			return (Criteria) this;
		}

		public Criteria andWorshipDateNotBetween(String value1, String value2) {
			addCriterion("worship_date not between", value1, value2,
					"worshipDate");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attend_worship
	 * @mbggenerated  Sun Jun 14 14:51:40 KST 2015
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
     * This class corresponds to the database table attend_worship
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 14 14:28:00 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}