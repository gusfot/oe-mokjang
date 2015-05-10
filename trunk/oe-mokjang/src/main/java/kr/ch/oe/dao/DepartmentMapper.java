package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;

import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {

	int countByExample(DepartmentExample example);

	int deleteByExample(DepartmentExample example);

	int deleteByPrimaryKey(Long deptSeq);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByExample(DepartmentExample example);

	Department selectByPrimaryKey(Long deptSeq);

	int updateByExampleSelective(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	int updateByExample(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);

	Department selectByDeptSeq(Long deptseq);
}