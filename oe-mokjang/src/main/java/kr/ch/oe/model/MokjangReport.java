package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

/**
 * 목장 보고?��
 * @author gusfot
 *
 */
public class MokjangReport {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private Long mokjangReportSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.weeks
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private Integer weeks;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.dept_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private Long deptSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.worship_dt
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String worshipDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String worshipPlace;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.next_worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String nextWorshipPlace;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.offering
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private Long offering;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.welcome_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String welcomeUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.worship_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String worshipUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.word_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String wordUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.work_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String workUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.reg_id
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String regId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.reg_time
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private Date regTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mokjang_report.etc_report_content
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	private String etcReportContent;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.mokjang_report_seq
	 * @return  the value of mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public Long getMokjangReportSeq() {
		return mokjangReportSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.mokjang_report_seq
	 * @param mokjangReportSeq  the value for mokjang_report.mokjang_report_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setMokjangReportSeq(Long mokjangReportSeq) {
		this.mokjangReportSeq = mokjangReportSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.weeks
	 * @return  the value of mokjang_report.weeks
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public Integer getWeeks() {
		return weeks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.weeks
	 * @param weeks  the value for mokjang_report.weeks
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.dept_seq
	 * @return  the value of mokjang_report.dept_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public Long getDeptSeq() {
		return deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.dept_seq
	 * @param deptSeq  the value for mokjang_report.dept_seq
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.worship_dt
	 * @return  the value of mokjang_report.worship_dt
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWorshipDt() {
		return worshipDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.worship_dt
	 * @param worshipDt  the value for mokjang_report.worship_dt
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWorshipDt(String worshipDt) {
		this.worshipDt = worshipDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.worship_place
	 * @return  the value of mokjang_report.worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWorshipPlace() {
		return worshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.worship_place
	 * @param worshipPlace  the value for mokjang_report.worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWorshipPlace(String worshipPlace) {
		this.worshipPlace = worshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.next_worship_place
	 * @return  the value of mokjang_report.next_worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getNextWorshipPlace() {
		return nextWorshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.next_worship_place
	 * @param nextWorshipPlace  the value for mokjang_report.next_worship_place
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setNextWorshipPlace(String nextWorshipPlace) {
		this.nextWorshipPlace = nextWorshipPlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.offering
	 * @return  the value of mokjang_report.offering
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public Long getOffering() {
		return offering;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.offering
	 * @param offering  the value for mokjang_report.offering
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setOffering(Long offering) {
		this.offering = offering;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.welcome_user_name
	 * @return  the value of mokjang_report.welcome_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWelcomeUserName() {
		return welcomeUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.welcome_user_name
	 * @param welcomeUserName  the value for mokjang_report.welcome_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWelcomeUserName(String welcomeUserName) {
		this.welcomeUserName = welcomeUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.worship_user_name
	 * @return  the value of mokjang_report.worship_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWorshipUserName() {
		return worshipUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.worship_user_name
	 * @param worshipUserName  the value for mokjang_report.worship_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWorshipUserName(String worshipUserName) {
		this.worshipUserName = worshipUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.word_user_name
	 * @return  the value of mokjang_report.word_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWordUserName() {
		return wordUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.word_user_name
	 * @param wordUserName  the value for mokjang_report.word_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWordUserName(String wordUserName) {
		this.wordUserName = wordUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.work_user_name
	 * @return  the value of mokjang_report.work_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getWorkUserName() {
		return workUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.work_user_name
	 * @param workUserName  the value for mokjang_report.work_user_name
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setWorkUserName(String workUserName) {
		this.workUserName = workUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.reg_id
	 * @return  the value of mokjang_report.reg_id
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getRegId() {
		return regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.reg_id
	 * @param regId  the value for mokjang_report.reg_id
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.reg_time
	 * @return  the value of mokjang_report.reg_time
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.reg_time
	 * @param regTime  the value for mokjang_report.reg_time
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mokjang_report.etc_report_content
	 * @return  the value of mokjang_report.etc_report_content
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public String getEtcReportContent() {
		return etcReportContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mokjang_report.etc_report_content
	 * @param etcReportContent  the value for mokjang_report.etc_report_content
	 * @mbggenerated  Sun Mar 01 17:35:48 KST 2015
	 */
	public void setEtcReportContent(String etcReportContent) {
		this.etcReportContent = etcReportContent;
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
	 * 개인 보고?��목록
	 */
	private List<Report> reports;
	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
}