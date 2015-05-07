package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.ReportItem;
import kr.ch.oe.model.ReportItemExample;
import org.apache.ibatis.annotations.Param;

public interface ReportItemMapper {

	int countByExample(ReportItemExample example);

	int deleteByExample(ReportItemExample example);

	int deleteByPrimaryKey(Long reportItemSeq);

	int insert(ReportItem record);

	int insertSelective(ReportItem record);

	List<ReportItem> selectByExampleWithBLOBs(ReportItemExample example);

	List<ReportItem> selectByExample(ReportItemExample example);

	ReportItem selectByPrimaryKey(Long reportItemSeq);

	int updateByExampleSelective(@Param("record") ReportItem record,
			@Param("example") ReportItemExample example);

	int updateByExampleWithBLOBs(@Param("record") ReportItem record,
			@Param("example") ReportItemExample example);

	int updateByExample(@Param("record") ReportItem record,
			@Param("example") ReportItemExample example);

	int updateByPrimaryKeySelective(ReportItem record);

	int updateByPrimaryKeyWithBLOBs(ReportItem record);

	int updateByPrimaryKey(ReportItem record);
}