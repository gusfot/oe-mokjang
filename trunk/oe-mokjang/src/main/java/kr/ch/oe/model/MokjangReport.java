package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

public class MokjangReport implements Report{

	private Mokjang mokjang;
	
	private Date worshipDate;
	
	private String worshipPlace;
	
	private Person wordMember;
	
	private Person singMember;
	
	private Person prayMember;
	
	private String nextWorshipPlace;
	
	private Person writer;
	
	private String offering;
	
	private List<Person> newMember;

	public Mokjang getMokjang() {
		return mokjang;
	}

	public void setMokjang(Mokjang mokjang) {
		this.mokjang = mokjang;
	}

	public Date getWorshipDate() {
		return worshipDate;
	}

	public void setWorshipDate(Date worshipDate) {
		this.worshipDate = worshipDate;
	}

	public String getWorshipPlace() {
		return worshipPlace;
	}

	public void setWorshipPlace(String worshipPlace) {
		this.worshipPlace = worshipPlace;
	}

	public Person getWordMember() {
		return wordMember;
	}

	public void setWordMember(Person wordMember) {
		this.wordMember = wordMember;
	}

	public Person getSingMember() {
		return singMember;
	}

	public void setSingMember(Person singMember) {
		this.singMember = singMember;
	}

	public Person getPrayMember() {
		return prayMember;
	}

	public void setPrayMember(Person prayMember) {
		this.prayMember = prayMember;
	}

	public String getNextWorshipPlace() {
		return nextWorshipPlace;
	}

	public void setNextWorshipPlace(String nextWorshipPlace) {
		this.nextWorshipPlace = nextWorshipPlace;
	}

	public Person getWriter() {
		return writer;
	}

	public void setWriter(Person writer) {
		this.writer = writer;
	}

	public String getOffering() {
		return offering;
	}

	public void setOffering(String offering) {
		this.offering = offering;
	}

	public List<Person> getNewMember() {
		return newMember;
	}

	public void setNewMember(List<Person> newMember) {
		this.newMember = newMember;
	}

}
