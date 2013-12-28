package kr.ch.oe.model;

public class Gyogu {

	private long id;
	private long zoId;
	private int no;
	
	private Member leader;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Member getLeader() {
		return leader;
	}

	public void setLeader(Member leader) {
		this.leader = leader;
	}

	public long getZoId() {
		return zoId;
	}

	public void setZoId(long zoId) {
		this.zoId = zoId;
	}
	
	
}
