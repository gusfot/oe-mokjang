package kr.ch.oe.model;

/**
 * 세션 사용자 VO
 */
public class SessionUserVO {

	private String userId;
	private String userName;
	private Long deptSeq;
	private Long roleSeq;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getDeptSeq() {
		return deptSeq;
	}

	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	public Long getRoleSeq() {
		return roleSeq;
	}

	public void setRoleSeq(Long roleSeq) {
		this.roleSeq = roleSeq;
	}

}
