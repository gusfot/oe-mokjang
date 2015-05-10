package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

public class Department {
	
	private Long deptSeq;

	private String deptName;

	private String deptType;

	private String leaderId;

	private String descripton;

	private Long parentSeq;

	private Date regTime;
	
	private List<Department> children;

	public Long getDeptSeq() {
		return deptSeq;
	}

	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	public String getDescription() {
		return descripton;
	}

	public void setDescription(String descripton) {
		this.descripton = descripton;
	}

	public Long getParentSeq() {
		return parentSeq;
	}

	public void setParentSeq(Long parentSeq) {
		this.parentSeq = parentSeq;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "Department [deptSeq=" + deptSeq + ", deptName=" + deptName
				+ ", parentSeq=" + parentSeq + ", regTime=" + regTime + "]";
	}

    
    private Department parent;
	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public List<Department> getChildren() {
		return children;
	}

	public void setChildren(List<Department> children) {
		this.children = children;
	}

}