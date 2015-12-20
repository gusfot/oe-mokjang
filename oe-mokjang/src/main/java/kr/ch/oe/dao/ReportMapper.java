package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.ReportExample;
import org.apache.ibatis.annotations.Param;

public interface ReportMapper {

	int countByExample(ReportExample example);

	int deleteByExample(ReportExample example);

	int deleteByPrimaryKey(Long reportSeq);

	int insert(Report record);

	int insertSelective(Report record);

	List<Report> selectByExample(ReportExample example);

	Report selectByPrimaryKey(Long reportSeq);
	
	Report selectByReportSeq(Long reportSeq);

	int updateByExampleSelective(@Param("record") Report record,
			@Param("example") ReportExample example);

	int updateByExample(@Param("record") Report record,
			@Param("example") ReportExample example);

	int updateByPrimaryKeySelective(Report record);

	int updateByPrimaryKey(Report record);

	/**
	 * 부서순번(코드)로 전체 누적점수 조회
	 * @param deptSeq
	 * @return
	 */
	int selectTotalPointByDeptSeq(long deptSeq);
}