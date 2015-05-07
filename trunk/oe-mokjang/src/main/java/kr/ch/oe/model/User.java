package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

/**
 * 사용자(담임목사, 대교구장, 교구장, 목자, 목장원, 새신자 등)
 * 
 * @author gusfot
 *
 */
public class User {

	/**
	 * 금주 점수
	 */
	private int thisWeekPoint;

	/**
	 * 누적 점수
	 */
	private int allPoint;
	/**
	 * 권한정보
	 */
	private Role role;
	/**
	 * 소속 정보
	 */
	private Department department;

	/**
	 * 전도현황 목록
	 */
	private List<MissionWorkStatus> missionWorkStatusList;

	/**
	 * 양육현황 목록
	 */
	private List<EduStatus> eduStatusList;
	
	private String userId;
	
	private Long userSeq;
	
	private String userName;
	
	private String regDt;
	
	private String password;
	
	private String addr;
	
	private String cellPhone;
	
	private String homePhone;
	
	private String job;
	
	private String gender;
	
	private String birth;
	
	private String email;
	
	private Long deptSeq;
	
	private Date regTime;
	
	/**
	 * 직분 번호
	 */
	private Long roleSeq;

	/**
	 * 해당직분
	 */
	private String roleName;
	/**
	 * 재적상태
	 */
	private String flag;

	/**
	 * 최종학력
	 */
	private String academic;
	/**
	 * 전공
	 */
	private String major;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDeptSeq() {
		return deptSeq;
	}

	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public Long getRoleSeq() {
		return roleSeq;
	}

	public void setRoleSeq(Long roleSeq) {
		this.roleSeq = roleSeq;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getFlag() {
		return flag;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic(String academic) {
		this.academic = academic;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<MissionWorkStatus> getMissionWorkStatusList() {
		return missionWorkStatusList;
	}

	public void setMissionWorkList(List<MissionWorkStatus> missionWorkStatusList) {
		this.missionWorkStatusList = missionWorkStatusList;
	}

	public List<EduStatus> getEduStatusList() {
		return eduStatusList;
	}

	public void setEduStatusListList(List<EduStatus> eduStatusList) {
		this.eduStatusList = eduStatusList;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getThisWeekPoint() {
		return thisWeekPoint;
	}

	public void setThisWeekPoint(int thisWeekPoint) {
		this.thisWeekPoint = thisWeekPoint;
	}

	public int getAllPoint() {
		return allPoint;
	}

	public void setAllPoint(int allPoint) {
		this.allPoint = allPoint;
	}

}