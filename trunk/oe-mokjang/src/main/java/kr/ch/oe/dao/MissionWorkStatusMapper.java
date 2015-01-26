package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.MissionWorkStatus;
import kr.ch.oe.model.MissionWorkStatusExample;
import org.apache.ibatis.annotations.Param;

public interface MissionWorkStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int countByExample(MissionWorkStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int deleteByExample(MissionWorkStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int deleteByPrimaryKey(Long missionWorkStatusSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int insert(MissionWorkStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int insertSelective(MissionWorkStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    List<MissionWorkStatus> selectByExample(MissionWorkStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    MissionWorkStatus selectByPrimaryKey(Long missionWorkStatusSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int updateByExampleSelective(@Param("record") MissionWorkStatus record, @Param("example") MissionWorkStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int updateByExample(@Param("record") MissionWorkStatus record, @Param("example") MissionWorkStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int updateByPrimaryKeySelective(MissionWorkStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission_work_status
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    int updateByPrimaryKey(MissionWorkStatus record);
}