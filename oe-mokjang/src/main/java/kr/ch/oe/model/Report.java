package kr.ch.oe.model;

import java.util.List;

public class Report {
	
	private long id;

	private Group group;
	
	private int weeks;
	/**
	 * 목장
	 */
	private Mokjang mokjang;					//목장명 
	
	/**
	 * 목장집회일
	 */
	private String meetingDate;
	
	private String meetingPlace;
	
	private String welcomeMember;
	
	private String worshipMember;
	
	private String wordMember;
	
	private String workMember;
	
	private String nextMeetingPlace;
	
	private int offering;
	
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

	public int getWeeks() {
		return weeks;
	}

	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}

	public List<PersonalReport> getPersonalReports() {
		return personalReports;
	}

	public void setPersonalReports(List<PersonalReport> personalReports) {
		this.personalReports = personalReports;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getMeetingPlace() {
		return meetingPlace;
	}

	public void setMeetingPlace(String meetingPlace) {
		this.meetingPlace = meetingPlace;
	}

	public String getWelcomeMember() {
		return welcomeMember;
	}

	public void setWelcomeMember(String welcomeMember) {
		this.welcomeMember = welcomeMember;
	}

	public String getWorshipMember() {
		return worshipMember;
	}

	public void setWorshipMember(String worshipMember) {
		this.worshipMember = worshipMember;
	}

	public String getWordMember() {
		return wordMember;
	}

	public void setWordMember(String wordMember) {
		this.wordMember = wordMember;
	}

	public String getWorkMember() {
		return workMember;
	}

	public void setWorkMember(String workMember) {
		this.workMember = workMember;
	}

	public String getNextMeetingPlace() {
		return nextMeetingPlace;
	}

	public void setNextMeetingPlace(String nextMeetingPlace) {
		this.nextMeetingPlace = nextMeetingPlace;
	}

	public int getOffering() {
		return offering;
	}

	public void setOffering(int offering) {
		this.offering = offering;
	}

	public Mokjang getMokjang() {
		return mokjang;
	}

	public void setMokjang(Mokjang mokjang) {
		this.mokjang = mokjang;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	


}
