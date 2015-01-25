package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MokjangReportExample {
    
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public MokjangReportExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
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

		public Criteria andMokjangReportSeqIsNull() {
			addCriterion("mokjang_report_seq is null");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqIsNotNull() {
			addCriterion("mokjang_report_seq is not null");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqEqualTo(Long value) {
			addCriterion("mokjang_report_seq =", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqNotEqualTo(Long value) {
			addCriterion("mokjang_report_seq <>", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqGreaterThan(Long value) {
			addCriterion("mokjang_report_seq >", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("mokjang_report_seq >=", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqLessThan(Long value) {
			addCriterion("mokjang_report_seq <", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqLessThanOrEqualTo(Long value) {
			addCriterion("mokjang_report_seq <=", value, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqIn(List<Long> values) {
			addCriterion("mokjang_report_seq in", values, "mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqNotIn(List<Long> values) {
			addCriterion("mokjang_report_seq not in", values,
					"mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqBetween(Long value1, Long value2) {
			addCriterion("mokjang_report_seq between", value1, value2,
					"mokjangReportSeq");
			return (Criteria) this;
		}

		public Criteria andMokjangReportSeqNotBetween(Long value1, Long value2) {
			addCriterion("mokjang_report_seq not between", value1, value2,
					"mokjangReportSeq");
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

		public Criteria andWeeksEqualTo(Integer value) {
			addCriterion("weeks =", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotEqualTo(Integer value) {
			addCriterion("weeks <>", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksGreaterThan(Integer value) {
			addCriterion("weeks >", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksGreaterThanOrEqualTo(Integer value) {
			addCriterion("weeks >=", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksLessThan(Integer value) {
			addCriterion("weeks <", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksLessThanOrEqualTo(Integer value) {
			addCriterion("weeks <=", value, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksIn(List<Integer> values) {
			addCriterion("weeks in", values, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotIn(List<Integer> values) {
			addCriterion("weeks not in", values, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksBetween(Integer value1, Integer value2) {
			addCriterion("weeks between", value1, value2, "weeks");
			return (Criteria) this;
		}

		public Criteria andWeeksNotBetween(Integer value1, Integer value2) {
			addCriterion("weeks not between", value1, value2, "weeks");
			return (Criteria) this;
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

		public Criteria andWorshipDtIsNull() {
			addCriterion("worship_dt is null");
			return (Criteria) this;
		}

		public Criteria andWorshipDtIsNotNull() {
			addCriterion("worship_dt is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipDtEqualTo(String value) {
			addCriterion("worship_dt =", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtNotEqualTo(String value) {
			addCriterion("worship_dt <>", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtGreaterThan(String value) {
			addCriterion("worship_dt >", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtGreaterThanOrEqualTo(String value) {
			addCriterion("worship_dt >=", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtLessThan(String value) {
			addCriterion("worship_dt <", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtLessThanOrEqualTo(String value) {
			addCriterion("worship_dt <=", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtLike(String value) {
			addCriterion("worship_dt like", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtNotLike(String value) {
			addCriterion("worship_dt not like", value, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtIn(List<String> values) {
			addCriterion("worship_dt in", values, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtNotIn(List<String> values) {
			addCriterion("worship_dt not in", values, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtBetween(String value1, String value2) {
			addCriterion("worship_dt between", value1, value2, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipDtNotBetween(String value1, String value2) {
			addCriterion("worship_dt not between", value1, value2, "worshipDt");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceIsNull() {
			addCriterion("worship_place is null");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceIsNotNull() {
			addCriterion("worship_place is not null");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceEqualTo(String value) {
			addCriterion("worship_place =", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceNotEqualTo(String value) {
			addCriterion("worship_place <>", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceGreaterThan(String value) {
			addCriterion("worship_place >", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceGreaterThanOrEqualTo(String value) {
			addCriterion("worship_place >=", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceLessThan(String value) {
			addCriterion("worship_place <", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceLessThanOrEqualTo(String value) {
			addCriterion("worship_place <=", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceLike(String value) {
			addCriterion("worship_place like", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceNotLike(String value) {
			addCriterion("worship_place not like", value, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceIn(List<String> values) {
			addCriterion("worship_place in", values, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceNotIn(List<String> values) {
			addCriterion("worship_place not in", values, "worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceBetween(String value1, String value2) {
			addCriterion("worship_place between", value1, value2,
					"worshipPlace");
			return (Criteria) this;
		}

		public Criteria andWorshipPlaceNotBetween(String value1, String value2) {
			addCriterion("worship_place not between", value1, value2,
					"worshipPlace");
			return (Criteria) this;
		}

		public Criteria andOfferingIsNull() {
			addCriterion("offering is null");
			return (Criteria) this;
		}

		public Criteria andOfferingIsNotNull() {
			addCriterion("offering is not null");
			return (Criteria) this;
		}

		public Criteria andOfferingEqualTo(Long value) {
			addCriterion("offering =", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingNotEqualTo(Long value) {
			addCriterion("offering <>", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingGreaterThan(Long value) {
			addCriterion("offering >", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingGreaterThanOrEqualTo(Long value) {
			addCriterion("offering >=", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingLessThan(Long value) {
			addCriterion("offering <", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingLessThanOrEqualTo(Long value) {
			addCriterion("offering <=", value, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingIn(List<Long> values) {
			addCriterion("offering in", values, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingNotIn(List<Long> values) {
			addCriterion("offering not in", values, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingBetween(Long value1, Long value2) {
			addCriterion("offering between", value1, value2, "offering");
			return (Criteria) this;
		}

		public Criteria andOfferingNotBetween(Long value1, Long value2) {
			addCriterion("offering not between", value1, value2, "offering");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mokjang_report
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
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
     * This class corresponds to the database table mokjang_report
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 18 18:00:50 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}