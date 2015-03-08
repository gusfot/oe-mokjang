package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int countByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int deleteByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int deleteByPrimaryKey(Long deptSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int insert(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int insertSelective(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	List<Department> selectByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	Department selectByPrimaryKey(Long deptSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int updateByExampleSelective(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int updateByExample(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int updateByPrimaryKeySelective(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table department
	 * @mbggenerated  Sun Mar 08 17:47:15 KST 2015
	 */
	int updateByPrimaryKey(Department record);
}