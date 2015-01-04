/**
 * 
 */
package kr.ch.oe.model;

/**
 * @author gusfot
 *
 */
public class Member {
	
	private long userId;
	private String password;
	private String name;
	private String birth;
	private String job;
	private String cellPhone;
	private String homePhone;
	private String email;
	private String address;
	private long groupSeq;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(long groupSeq) {
		this.groupSeq = groupSeq;
	}
	
	
	
}
