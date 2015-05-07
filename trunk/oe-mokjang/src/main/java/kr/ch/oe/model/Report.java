package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

/**
 * 개인 보고서
 * @author gusfot
 *
 */
public class Report {

	@Override
	public String toString() {
		return "Report [reportSeq=" + reportSeq + ", userId=" + userId
				+ ", deptSeq=" + deptSeq + ", weeks=" + weeks + ", mokjangYn="
				+ ", regId=" + regId
				+ ", regTime=" + regTime + ", mokjangReportSeq="
				+ mokjangReportSeq + "]";
	}

	private Long reportSeq;
	

	private String userId;

	private Long deptSeq;

	private Integer weeks;
	
	private String regId;

	private Date regTime;
	
	private Long mokjangReportSeq;

	private List<ReportItemHist> reportItemHist;
	
	public Long getReportSeq() {
		return reportSeq;
	}

	public void setReportSeq(Long reportSeq) {
		this.reportSeq = reportSeq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getDeptSeq() {
		return deptSeq;
	}

	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
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

	public Long getMokjangReportSeq() {
		return mokjangReportSeq;
	}

	public void setMokjangReportSeq(Long mokjangReportSeq) {
		this.mokjangReportSeq = mokjangReportSeq;
	}

	public List<ReportItemHist> getReportItemHist() {
		return reportItemHist;
	}

	public void setReportItemHist(List<ReportItemHist> reportItemHist) {
		this.reportItemHist = reportItemHist;
	}
}