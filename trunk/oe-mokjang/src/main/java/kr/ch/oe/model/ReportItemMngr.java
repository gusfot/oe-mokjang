package kr.ch.oe.model;

import java.util.Date;

public class ReportItemMngr {

	private Long reportItemMngrSeq;
	
	private String mngrName;
	
	private Date startDate;
	
	private Date endDate;
	
	private String useYn;
	
	private String regId;
	
	private Date regTime;
	
	private String desc;

	public Long getReportItemMngrSeq() {
		return reportItemMngrSeq;
	}

	public void setReportItemMngrSeq(Long reportItemMngrSeq) {
		this.reportItemMngrSeq = reportItemMngrSeq;
	}

	public String getMngrName() {
		return mngrName;
	}

	public void setMngrName(String mngrName) {
		this.mngrName = mngrName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}