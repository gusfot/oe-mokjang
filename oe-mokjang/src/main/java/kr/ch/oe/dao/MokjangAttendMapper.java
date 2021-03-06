package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.MokjangAttend;
import kr.ch.oe.model.MokjangAttendExample;

import org.apache.ibatis.annotations.Param;

public interface MokjangAttendMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int countByExample(MokjangAttendExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int deleteByExample(MokjangAttendExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int deleteByPrimaryKey(Long mokjangAttendSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int insert(MokjangAttend record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int insertSelective(MokjangAttend record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	List<MokjangAttend> selectByExample(MokjangAttendExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	MokjangAttend selectByPrimaryKey(Long mokjangAttendSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int updateByExampleSelective(@Param("record") MokjangAttend record,
			@Param("example") MokjangAttendExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int updateByExample(@Param("record") MokjangAttend record,
			@Param("example") MokjangAttendExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int updateByPrimaryKeySelective(MokjangAttend record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mokjang_attend
	 * @mbggenerated  Sun Jun 21 17:35:04 KST 2015
	 */
	int updateByPrimaryKey(MokjangAttend record);

	MokjangAttend selectMokjangAttend(Map<String, Object> params);
}