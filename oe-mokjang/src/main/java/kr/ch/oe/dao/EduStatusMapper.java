package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.EduStatus;
import kr.ch.oe.model.EduStatusExample;

import org.apache.ibatis.annotations.Param;

public interface EduStatusMapper {

	int countByExample(EduStatusExample example);

    int deleteByExample(EduStatusExample example);

    int deleteByPrimaryKey(Long eduStatusSeq);

    int insert(EduStatus record);

    int insertSelective(EduStatus record);

    List<EduStatus> selectByExample(EduStatusExample example);

    EduStatus selectByPrimaryKey(Long eduStatusSeq);

    int updateByExampleSelective(@Param("record") EduStatus record, @Param("example") EduStatusExample example);

    int updateByExample(@Param("record") EduStatus record, @Param("example") EduStatusExample example);

    int updateByPrimaryKeySelective(EduStatus record);

    int updateByPrimaryKey(EduStatus record);
    
	public List<EduStatus> selectEduStatusList(Map<String, Object> params);
}