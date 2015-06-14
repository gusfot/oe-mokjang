package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.DepartmentChangeHist;
import kr.ch.oe.model.DepartmentChangeHistExample;
import org.apache.ibatis.annotations.Param;

public interface DepartmentChangeHistMapper {

	int countByExample(DepartmentChangeHistExample example);

    int deleteByExample(DepartmentChangeHistExample example);

    int deleteByPrimaryKey(Long departmentChangeHistSeq);

    int insert(DepartmentChangeHist record);

    int insertSelective(DepartmentChangeHist record);

    List<DepartmentChangeHist> selectByExample(DepartmentChangeHistExample example);

    DepartmentChangeHist selectByPrimaryKey(Long departmentChangeHistSeq);

    int updateByExampleSelective(@Param("record") DepartmentChangeHist record, @Param("example") DepartmentChangeHistExample example);

    int updateByExample(@Param("record") DepartmentChangeHist record, @Param("example") DepartmentChangeHistExample example);

    int updateByPrimaryKeySelective(DepartmentChangeHist record);

    int updateByPrimaryKey(DepartmentChangeHist record);
    
}