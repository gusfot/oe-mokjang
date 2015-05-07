package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.ReportItemMngr;
import kr.ch.oe.model.ReportItemMngrExample;
import org.apache.ibatis.annotations.Param;

public interface ReportItemMngrMapper {

	int countByExample(ReportItemMngrExample example);

	int deleteByExample(ReportItemMngrExample example);

	int deleteByPrimaryKey(Long reportItemMngrSeq);

	int insert(ReportItemMngr record);

	int insertSelective(ReportItemMngr record);

	List<ReportItemMngr> selectByExampleWithBLOBs(ReportItemMngrExample example);

	List<ReportItemMngr> selectByExample(ReportItemMngrExample example);

	ReportItemMngr selectByPrimaryKey(Long reportItemMngrSeq);

	int updateByExampleSelective(@Param("record") ReportItemMngr record,
			@Param("example") ReportItemMngrExample example);

	int updateByExampleWithBLOBs(@Param("record") ReportItemMngr record,
			@Param("example") ReportItemMngrExample example);

	int updateByExample(@Param("record") ReportItemMngr record,
			@Param("example") ReportItemMngrExample example);

	int updateByPrimaryKeySelective(ReportItemMngr record);

	int updateByPrimaryKeyWithBLOBs(ReportItemMngr record);

	int updateByPrimaryKey(ReportItemMngr record);
}