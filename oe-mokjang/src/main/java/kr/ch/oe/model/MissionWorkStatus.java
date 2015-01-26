package kr.ch.oe.model;

import java.util.Date;

public class MissionWorkStatus {
    @Override
	public String toString() {
		return "MissionWorkStatus [missionWorkStatusSeq="
				+ missionWorkStatusSeq + ", userId=" + userId + ", newUserId="
				+ newUserId + ", regDate=" + regDate + ", regId=" + regId
				+ ", regTime=" + regTime + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.mission_work_status_seq
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private Long missionWorkStatusSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.new_user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private String newUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.reg_date
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private String regDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.reg_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private String regId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mission_work_status.reg_time
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    private Date regTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.mission_work_status_seq
     *
     * @return the value of mission_work_status.mission_work_status_seq
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public Long getMissionWorkStatusSeq() {
        return missionWorkStatusSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.mission_work_status_seq
     *
     * @param missionWorkStatusSeq the value for mission_work_status.mission_work_status_seq
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setMissionWorkStatusSeq(Long missionWorkStatusSeq) {
        this.missionWorkStatusSeq = missionWorkStatusSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.user_id
     *
     * @return the value of mission_work_status.user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.user_id
     *
     * @param userId the value for mission_work_status.user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.new_user_id
     *
     * @return the value of mission_work_status.new_user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public String getNewUserId() {
        return newUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.new_user_id
     *
     * @param newUserId the value for mission_work_status.new_user_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setNewUserId(String newUserId) {
        this.newUserId = newUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.reg_date
     *
     * @return the value of mission_work_status.reg_date
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.reg_date
     *
     * @param regDate the value for mission_work_status.reg_date
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.reg_id
     *
     * @return the value of mission_work_status.reg_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public String getRegId() {
        return regId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.reg_id
     *
     * @param regId the value for mission_work_status.reg_id
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission_work_status.reg_time
     *
     * @return the value of mission_work_status.reg_time
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission_work_status.reg_time
     *
     * @param regTime the value for mission_work_status.reg_time
     *
     * @mbggenerated Mon Jan 26 10:27:45 KST 2015
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}