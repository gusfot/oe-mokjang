package kr.ch.oe.model;

import java.util.List;

public class Mokjang {
	private long mokjangId;
	private Group group;
	private Member leader;
	private List<Member> members;
	
	public Member getLeader() {
		return leader;
	}
	public void setLeader(Member leader) {
		this.leader = leader;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public long getMokjangId() {
		return mokjangId;
	}
	public void setMokjangId(long mokjangId) {
		this.mokjangId = mokjangId;
	}
	
}
