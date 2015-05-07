package kr.ch.oe.model;

import java.util.Date;

/**
 * 전도 현황
 * @author gusfot
 *
 */
public class MissionWorkStatus {
    @Override
	public String toString() {
		return "MissionWorkStatus [missionWorkStatusSeq="
				+ missionWorkStatusSeq + ", userId=" + userId + ", newUserId="
				+ newUserId + ", regDate=" + regDate + ", regId=" + regId
				+ ", regTime=" + regTime + "]";
	}

    private Long missionWorkStatusSeq;

    /**
     * 전도자ID(이름)
     */
    private String userId;

    /**
     * 전도되어진 사람ID(이름)
     */
    private String newUserId;

    private String regDate;

    private String regId;

    private Date regTime;

    public Long getMissionWorkStatusSeq() {
        return missionWorkStatusSeq;
    }

    public void setMissionWorkStatusSeq(Long missionWorkStatusSeq) {
        this.missionWorkStatusSeq = missionWorkStatusSeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(String newUserId) {
        this.newUserId = newUserId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}