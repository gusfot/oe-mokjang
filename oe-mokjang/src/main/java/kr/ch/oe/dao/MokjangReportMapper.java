package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.MokjangReportExample;

import org.apache.ibatis.annotations.Param;

public interface MokjangReportMapper {

	int countByExample(MokjangReportExample example);

	int deleteByExample(MokjangReportExample example);

	int deleteByPrimaryKey(Long mokjangReportSeq);

	int insert(MokjangReport record);

	int insertSelective(MokjangReport record);

	List<MokjangReport> selectByExampleWithBLOBs(MokjangReportExample example);

	List<MokjangReport> selectByExample(MokjangReportExample example);

	MokjangReport selectByPrimaryKey(Long mokjangReportSeq);

	int updateByExampleSelective(@Param("record") MokjangReport record,
			@Param("example") MokjangReportExample example);

	int updateByExampleWithBLOBs(@Param("record") MokjangReport record,
			@Param("example") MokjangReportExample example);

	int updateByExample(@Param("record") MokjangReport record,
			@Param("example") MokjangReportExample example);

	int updateByPrimaryKeySelective(MokjangReport record);

	int updateByPrimaryKeyWithBLOBs(MokjangReport record);

	int updateByPrimaryKey(MokjangReport record);

	MokjangReport selectMokjangReport(Map<String, Object> params);

	/**
	 * 부서코드로 전체누적점수 조회
	 * @param deptSeq
	 * @return
	 */
	int selectTotalPointByDeptSeq(long deptSeq);
	
}