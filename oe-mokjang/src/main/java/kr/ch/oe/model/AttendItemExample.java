package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendItemExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public AttendItemExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
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

		public Criteria andAttendItemSeqIsNull() {
			addCriterion("attend_item_seq is null");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqIsNotNull() {
			addCriterion("attend_item_seq is not null");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqEqualTo(Long value) {
			addCriterion("attend_item_seq =", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqNotEqualTo(Long value) {
			addCriterion("attend_item_seq <>", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqGreaterThan(Long value) {
			addCriterion("attend_item_seq >", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("attend_item_seq >=", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqLessThan(Long value) {
			addCriterion("attend_item_seq <", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqLessThanOrEqualTo(Long value) {
			addCriterion("attend_item_seq <=", value, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqIn(List<Long> values) {
			addCriterion("attend_item_seq in", values, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqNotIn(List<Long> values) {
			addCriterion("attend_item_seq not in", values, "attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqBetween(Long value1, Long value2) {
			addCriterion("attend_item_seq between", value1, value2,
					"attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemSeqNotBetween(Long value1, Long value2) {
			addCriterion("attend_item_seq not between", value1, value2,
					"attendItemSeq");
			return (Criteria) this;
		}

		public Criteria andItemNameIsNull() {
			addCriterion("item_name is null");
			return (Criteria) this;
		}

		public Criteria andItemNameIsNotNull() {
			addCriterion("item_name is not null");
			return (Criteria) this;
		}

		public Criteria andItemNameEqualTo(String value) {
			addCriterion("item_name =", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameNotEqualTo(String value) {
			addCriterion("item_name <>", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameGreaterThan(String value) {
			addCriterion("item_name >", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameGreaterThanOrEqualTo(String value) {
			addCriterion("item_name >=", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameLessThan(String value) {
			addCriterion("item_name <", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameLessThanOrEqualTo(String value) {
			addCriterion("item_name <=", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameLike(String value) {
			addCriterion("item_name like", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameNotLike(String value) {
			addCriterion("item_name not like", value, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameIn(List<String> values) {
			addCriterion("item_name in", values, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameNotIn(List<String> values) {
			addCriterion("item_name not in", values, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameBetween(String value1, String value2) {
			addCriterion("item_name between", value1, value2, "itemName");
			return (Criteria) this;
		}

		public Criteria andItemNameNotBetween(String value1, String value2) {
			addCriterion("item_name not between", value1, value2, "itemName");
			return (Criteria) this;
		}

		public Criteria andWeightIsNull() {
			addCriterion("weight is null");
			return (Criteria) this;
		}

		public Criteria andWeightIsNotNull() {
			addCriterion("weight is not null");
			return (Criteria) this;
		}

		public Criteria andWeightEqualTo(Integer value) {
			addCriterion("weight =", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotEqualTo(Integer value) {
			addCriterion("weight <>", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThan(Integer value) {
			addCriterion("weight >", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
			addCriterion("weight >=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThan(Integer value) {
			addCriterion("weight <", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThanOrEqualTo(Integer value) {
			addCriterion("weight <=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightIn(List<Integer> values) {
			addCriterion("weight in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotIn(List<Integer> values) {
			addCriterion("weight not in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightBetween(Integer value1, Integer value2) {
			addCriterion("weight between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotBetween(Integer value1, Integer value2) {
			addCriterion("weight not between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andItemTypeIsNull() {
			addCriterion("item_type is null");
			return (Criteria) this;
		}

		public Criteria andItemTypeIsNotNull() {
			addCriterion("item_type is not null");
			return (Criteria) this;
		}

		public Criteria andItemTypeEqualTo(String value) {
			addCriterion("item_type =", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeNotEqualTo(String value) {
			addCriterion("item_type <>", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeGreaterThan(String value) {
			addCriterion("item_type >", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
			addCriterion("item_type >=", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeLessThan(String value) {
			addCriterion("item_type <", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeLessThanOrEqualTo(String value) {
			addCriterion("item_type <=", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeLike(String value) {
			addCriterion("item_type like", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeNotLike(String value) {
			addCriterion("item_type not like", value, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeIn(List<String> values) {
			addCriterion("item_type in", values, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeNotIn(List<String> values) {
			addCriterion("item_type not in", values, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeBetween(String value1, String value2) {
			addCriterion("item_type between", value1, value2, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeNotBetween(String value1, String value2) {
			addCriterion("item_type not between", value1, value2, "itemType");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescIsNull() {
			addCriterion("item_type_desc is null");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescIsNotNull() {
			addCriterion("item_type_desc is not null");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescEqualTo(String value) {
			addCriterion("item_type_desc =", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescNotEqualTo(String value) {
			addCriterion("item_type_desc <>", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescGreaterThan(String value) {
			addCriterion("item_type_desc >", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescGreaterThanOrEqualTo(String value) {
			addCriterion("item_type_desc >=", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescLessThan(String value) {
			addCriterion("item_type_desc <", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescLessThanOrEqualTo(String value) {
			addCriterion("item_type_desc <=", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescLike(String value) {
			addCriterion("item_type_desc like", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescNotLike(String value) {
			addCriterion("item_type_desc not like", value, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescIn(List<String> values) {
			addCriterion("item_type_desc in", values, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescNotIn(List<String> values) {
			addCriterion("item_type_desc not in", values, "itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescBetween(String value1, String value2) {
			addCriterion("item_type_desc between", value1, value2,
					"itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andItemTypeDescNotBetween(String value1, String value2) {
			addCriterion("item_type_desc not between", value1, value2,
					"itemTypeDesc");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNull() {
			addCriterion("priority is null");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNotNull() {
			addCriterion("priority is not null");
			return (Criteria) this;
		}

		public Criteria andPriorityEqualTo(Integer value) {
			addCriterion("priority =", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotEqualTo(Integer value) {
			addCriterion("priority <>", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThan(Integer value) {
			addCriterion("priority >", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
			addCriterion("priority >=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThan(Integer value) {
			addCriterion("priority <", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThanOrEqualTo(Integer value) {
			addCriterion("priority <=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityIn(List<Integer> values) {
			addCriterion("priority in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotIn(List<Integer> values) {
			addCriterion("priority not in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityBetween(Integer value1, Integer value2) {
			addCriterion("priority between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
			addCriterion("priority not between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andUseYnIsNull() {
			addCriterion("use_yn is null");
			return (Criteria) this;
		}

		public Criteria andUseYnIsNotNull() {
			addCriterion("use_yn is not null");
			return (Criteria) this;
		}

		public Criteria andUseYnEqualTo(String value) {
			addCriterion("use_yn =", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnNotEqualTo(String value) {
			addCriterion("use_yn <>", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnGreaterThan(String value) {
			addCriterion("use_yn >", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnGreaterThanOrEqualTo(String value) {
			addCriterion("use_yn >=", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnLessThan(String value) {
			addCriterion("use_yn <", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnLessThanOrEqualTo(String value) {
			addCriterion("use_yn <=", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnLike(String value) {
			addCriterion("use_yn like", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnNotLike(String value) {
			addCriterion("use_yn not like", value, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnIn(List<String> values) {
			addCriterion("use_yn in", values, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnNotIn(List<String> values) {
			addCriterion("use_yn not in", values, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnBetween(String value1, String value2) {
			addCriterion("use_yn between", value1, value2, "useYn");
			return (Criteria) this;
		}

		public Criteria andUseYnNotBetween(String value1, String value2) {
			addCriterion("use_yn not between", value1, value2, "useYn");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqIsNull() {
			addCriterion("attend_item_mngr_seq is null");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqIsNotNull() {
			addCriterion("attend_item_mngr_seq is not null");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqEqualTo(Long value) {
			addCriterion("attend_item_mngr_seq =", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqNotEqualTo(Long value) {
			addCriterion("attend_item_mngr_seq <>", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqGreaterThan(Long value) {
			addCriterion("attend_item_mngr_seq >", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("attend_item_mngr_seq >=", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqLessThan(Long value) {
			addCriterion("attend_item_mngr_seq <", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqLessThanOrEqualTo(Long value) {
			addCriterion("attend_item_mngr_seq <=", value, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqIn(List<Long> values) {
			addCriterion("attend_item_mngr_seq in", values, "attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqNotIn(List<Long> values) {
			addCriterion("attend_item_mngr_seq not in", values,
					"attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqBetween(Long value1, Long value2) {
			addCriterion("attend_item_mngr_seq between", value1, value2,
					"attendItemMngrSeq");
			return (Criteria) this;
		}

		public Criteria andAttendItemMngrSeqNotBetween(Long value1, Long value2) {
			addCriterion("attend_item_mngr_seq not between", value1, value2,
					"attendItemMngrSeq");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table attend_item
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
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
     * This class corresponds to the database table attend_item
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 21 17:31:03 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}