package kr.ch.oe.model;

import java.util.Date;

/**
 * 권한 
 *
 */
public class Role {

	private long roleSeq;
	
	private String roleName;
	
	private Date regTime;

	public long getRoleSeq() {
		return roleSeq;
	}

	public void setRoleSeq(long roleSeq) {
		this.roleSeq = roleSeq;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
}
