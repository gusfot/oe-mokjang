package kr.ch.oe.model;

import java.util.List;

public class Report {
	
	private long id;
	private int gyogu;
	private int zo;
	/**
	 * 목장
	 */
	private String mokjangName;					//목장명 
	
	/**
	 * 개인보고서 리스트 
	 */
	private List<PersonalReport> personalReports;	//개인보고서리스트 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getGyogu() {
		return gyogu;
	}
	
	public void setGyogu(int gyogu) {
		this.gyogu = gyogu;
	}
	
	public int getZo() {
		return zo;
	}
	
	public void setZo(int zo) {
		this.zo = zo;
	}
	
	public String getMokjangName() {
		return mokjangName;
	}
	
	public void setMokjangName(String mokjangName) {
		this.mokjangName = mokjangName;
	}

	public List<PersonalReport> getPersonalReports() {
		return personalReports;
	}

	public void setPersonalReports(List<PersonalReport> personalReports) {
		this.personalReports = personalReports;
	}
	


}
