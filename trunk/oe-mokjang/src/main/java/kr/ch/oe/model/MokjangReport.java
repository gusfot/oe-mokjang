package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

public class MokjangReport {

	/**
	 * 개인 보고서목록
	 */
	private List<Report> reports;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private Long mokjangReportSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.weeks
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private Integer weeks;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.dept_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private Long deptSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.worship_dt
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private String worshipDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.worship_place
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private String worshipPlace;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.offering
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private Long offering;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.reg_id
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private String regId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.reg_time
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	private Date regTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.mokjang_report_seq
	 * @return  the value of mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Long getMokjangReportSeq() {
		return mokjangReportSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.mokjang_report_seq
	 * @param mokjangReportSeq  the value for mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setMokjangReportSeq(Long mokjangReportSeq) {
		this.mokjangReportSeq = mokjangReportSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.weeks
	 * @return  the value of mokjang_report.weeks
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Integer getWeeks() {
		return weeks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.weeks
	 * @param weeks  the value for mokjang_report.weeks
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.dept_seq
	 * @return  the value of mokjang_report.dept_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Long getDeptSeq() {
		return deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.dept_seq
	 * @param deptSeq  the value for mokjang_report.dept_seq
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.worship_dt
	 * @return  the value of mokjang_report.worship_dt
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public String getWorshipDt() {
		return worshipDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.worship_dt
	 * @param worshipDt  the value for mokjang_report.worship_dt
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setWorshipDt(String worshipDt) {
		this.worshipDt = worshipDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.worship_place
	 * @return  the value of mokjang_report.worship_place
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public String getWorshipPlace() {
		return worshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.worship_place
	 * @param worshipPlace  the value for mokjang_report.worship_place
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setWorshipPlace(String worshipPlace) {
		this.worshipPlace = worshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.offering
	 * @return  the value of mokjang_report.offering
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Long getOffering() {
		return offering;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.offering
	 * @param offering  the value for mokjang_report.offering
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setOffering(Long offering) {
		this.offering = offering;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.reg_id
	 * @return  the value of mokjang_report.reg_id
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public String getRegId() {
		return regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.reg_id
	 * @param regId  the value for mokjang_report.reg_id
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.reg_time
	 * @return  the value of mokjang_report.reg_time
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.reg_time
	 * @param regTime  the value for mokjang_report.reg_time
	 * @mbggenerated  Sun Jan 18 18:01:28 KST 2015
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
}