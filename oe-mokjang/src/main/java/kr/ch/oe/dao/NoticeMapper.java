package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.Notice;
import kr.ch.oe.model.NoticeExample;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {

    int countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Long noticeSeq);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExampleWithBLOBs(NoticeExample example);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Long noticeSeq);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);
}