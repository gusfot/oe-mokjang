package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.MissionWorkStatus;
import kr.ch.oe.model.MissionWorkStatusExample;
import org.apache.ibatis.annotations.Param;

public interface MissionWorkStatusMapper {
    
    int countByExample(MissionWorkStatusExample example);

    int deleteByExample(MissionWorkStatusExample example);

    int deleteByPrimaryKey(Long missionWorkStatusSeq);

    int insert(MissionWorkStatus record);

    int insertSelective(MissionWorkStatus record);

    List<MissionWorkStatus> selectByExample(MissionWorkStatusExample example);

    MissionWorkStatus selectByPrimaryKey(Long missionWorkStatusSeq);

    int updateByExampleSelective(@Param("record") MissionWorkStatus record, @Param("example") MissionWorkStatusExample example);

    int updateByExample(@Param("record") MissionWorkStatus record, @Param("example") MissionWorkStatusExample example);

    int updateByPrimaryKeySelective(MissionWorkStatus record);

    int updateByPrimaryKey(MissionWorkStatus record);
    
}