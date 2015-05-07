package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.Edu;
import kr.ch.oe.model.EduExample;
import org.apache.ibatis.annotations.Param;

public interface EduMapper {

	int countByExample(EduExample example);

	int deleteByExample(EduExample example);

	int deleteByPrimaryKey(Long eduSeq);

	int insert(Edu record);

	int insertSelective(Edu record);

	List<Edu> selectByExample(EduExample example);

	Edu selectByPrimaryKey(Long eduSeq);

	int updateByExampleSelective(@Param("record") Edu record,
			@Param("example") EduExample example);

	int updateByExample(@Param("record") Edu record,
			@Param("example") EduExample example);

	int updateByPrimaryKeySelective(Edu record);

	int updateByPrimaryKey(Edu record);
}