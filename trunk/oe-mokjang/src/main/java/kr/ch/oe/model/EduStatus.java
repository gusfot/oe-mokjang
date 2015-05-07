package kr.ch.oe.model;

import java.util.Date;

/**
 * 양육현황 
 * @author gusfot
 *
 */
public class EduStatus {
	
	private String eduName;

	private Long eduStatusSeq;

    private String userId;

    private Long eduSeq;

    private String eduDate;

    private Integer eduUnit;

    private String state;

    private String regId;

    private Date regTime;

    public Long getEduStatusSeq() {
        return eduStatusSeq;
    }

    public void setEduStatusSeq(Long eduStatusSeq) {
        this.eduStatusSeq = eduStatusSeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getEduSeq() {
        return eduSeq;
    }

    public void setEduSeq(Long eduSeq) {
        this.eduSeq = eduSeq;
    }

    public String getEduDate() {
        return eduDate;
    }

    public void setEduDate(String eduDate) {
        this.eduDate = eduDate;
    }

    public Integer getEduUnit() {
        return eduUnit;
    }

    public void setEduUnit(Integer eduUnit) {
        this.eduUnit = eduUnit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

	public String getEduName() {
		return eduName;
	}

	public void setEduName(String eduName) {
		this.eduName = eduName;
	}
}