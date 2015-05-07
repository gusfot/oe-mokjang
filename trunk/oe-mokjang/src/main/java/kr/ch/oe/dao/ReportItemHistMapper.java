package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.ReportItemHist;
import kr.ch.oe.model.ReportItemHistExample;
import org.apache.ibatis.annotations.Param;

public interface ReportItemHistMapper {

    int countByExample(ReportItemHistExample example);

    int deleteByExample(ReportItemHistExample example);

    int deleteByPrimaryKey(Long reportItemHistSeq);

    int insert(ReportItemHist record);

    int insertSelective(ReportItemHist record);

    List<ReportItemHist> selectByExample(ReportItemHistExample example);

    ReportItemHist selectByPrimaryKey(Long reportItemHistSeq);

    int updateByExampleSelective(@Param("record") ReportItemHist record, @Param("example") ReportItemHistExample example);

    int updateByExample(@Param("record") ReportItemHist record, @Param("example") ReportItemHistExample example);

    int updateByPrimaryKeySelective(ReportItemHist record);

    int updateByPrimaryKey(ReportItemHist record);
}