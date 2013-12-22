package kr.ch.oe.model;

public class Gyogu {

	private long gyoguId;
	private long zoId;
	private int no;
	
	private Member leader;

	public long getGyoguId() {
		return gyoguId;
	}

	public void setGyoguId(long gyoguId) {
		this.gyoguId = gyoguId;
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
