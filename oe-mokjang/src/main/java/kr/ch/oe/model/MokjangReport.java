package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

/**
 * 목장 보고??
 * @author gusfot
 *
 */
public class MokjangReport {

	private Integer point;

	private Long gyoguDeptSeq;
	
	private Long mokjangReportSeq;

	private Integer weeks;

	private Long deptSeq;
	
	private String worshipDt;
	
	private String worshipPlace;
	
	private String nextWorshipPlace;
	
	private Long offering;
	
	private String welcomeUserName;
	
	private String worshipUserName;
	
	private String wordUserName;
	
	private String workUserName;
	
	private String regId;
	
	private Date regTime;
	
	private String etcReportContent;
	
	public Long getMokjangReportSeq() {
		return mokjangReportSeq;
	}

	public void setMokjangReportSeq(Long mokjangReportSeq) {
		this.mokjangReportSeq = mokjangReportSeq;
	}

	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	public Long getDeptSeq() {
		return deptSeq;
	}

	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	public String getWorshipDt() {
		return worshipDt;
	}

	public void setWorshipDt(String worshipDt) {
		this.worshipDt = worshipDt;
	}

	public String getWorshipPlace() {
		return worshipPlace;
	}

	public void setWorshipPlace(String worshipPlace) {
		this.worshipPlace = worshipPlace;
	}

	public String getNextWorshipPlace() {
		return nextWorshipPlace;
	}

	public void setNextWorshipPlace(String nextWorshipPlace) {
		this.nextWorshipPlace = nextWorshipPlace;
	}

	public Long getOffering() {
		return offering;
	}

	public void setOffering(Long offering) {
		this.offering = offering;
	}

	public String getWelcomeUserName() {
		return welcomeUserName;
	}

	public void setWelcomeUserName(String welcomeUserName) {
		this.welcomeUserName = welcomeUserName;
	}

	public String getWorshipUserName() {
		return worshipUserName;
	}

	public void setWorshipUserName(String worshipUserName) {
		this.worshipUserName = worshipUserName;
	}

	public String getWordUserName() {
		return wordUserName;
	}

	public void setWordUserName(String wordUserName) {
		this.wordUserName = wordUserName;
	}

	public String getWorkUserName() {
		return workUserName;
	}

	public void setWorkUserName(String workUserName) {
		this.workUserName = workUserName;
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

	public String getEtcReportContent() {
		return etcReportContent;
	}

	public void setEtcReportContent(String etcReportContent) {
		this.etcReportContent = etcReportContent;
	}
	
	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "MokjangReport [reports=" + reports + ", mokjangReportSeq="
				+ mokjangReportSeq + ", weeks=" + weeks + ", deptSeq="
				+ deptSeq + ", worshipDt=" + worshipDt + ", worshipPlace="
				+ worshipPlace + ", offering=" + offering + ", regId=" + regId
				+ ", regTime=" + regTime + "]";
	}

	/**
	 * 개인 보고서 목록
	 */
	private List<Report> reports;
	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public Long getGyoguDeptSeq() {
		return gyoguDeptSeq;
	}

	public void setGyoguDeptSeq(Long gyoguDeptSeq) {
		this.gyoguDeptSeq = gyoguDeptSeq;
	}
}