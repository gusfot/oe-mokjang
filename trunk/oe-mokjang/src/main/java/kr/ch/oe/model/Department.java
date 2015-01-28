package kr.ch.oe.model;

import java.util.Date;

public class Department {
	
    @Override
	public String toString() {
		return "Department [deptSeq=" + deptSeq + ", deptName=" + deptName
				+ ", parentSeq=" + parentSeq + ", regTime=" + regTime + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.dept_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    private Long deptSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.dept_name
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.parent_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    private Long parentSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.reg_time
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    private Date regTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.dept_seq
     *
     * @return the value of department.dept_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public Long getDeptSeq() {
        return deptSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.dept_seq
     *
     * @param deptSeq the value for department.dept_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public void setDeptSeq(Long deptSeq) {
        this.deptSeq = deptSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.dept_name
     *
     * @return the value of department.dept_name
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.dept_name
     *
     * @param deptName the value for department.dept_name
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.parent_seq
     *
     * @return the value of department.parent_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public Long getParentSeq() {
        return parentSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.parent_seq
     *
     * @param parentSeq the value for department.parent_seq
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public void setParentSeq(Long parentSeq) {
        this.parentSeq = parentSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.reg_time
     *
     * @return the value of department.reg_time
     *
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.reg_time
     * @param regTime the value for department.reg_time
     * @mbggenerated Thu Jan 08 10:31:21 KST 2015
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}