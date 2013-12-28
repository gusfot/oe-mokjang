/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;


/**
 * @author gusfot
 *
 */
public class Group {
	private long id;
	private long churchId;
	private long gyoguId;
	private long zoId;
	private long mokjangId;
	private List<Mokjang> mokjangList;
	
	public long getChurchId() {
		return churchId;
	}
	public void setChurchId(long churchId) {
		this.churchId = churchId;
	}
	public long getZoId() {
		return zoId;
	}
	public void setZoId(long zoId) {
		this.zoId = zoId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Mokjang> getMokjangList() {
		return mokjangList;
	}
	public void setMokjangList(List<Mokjang> mokjangList) {
		this.mokjangList = mokjangList;
	}
	public long getGyoguId() {
		return gyoguId;
	}
	public void setGyoguId(long gyoguId) {
		this.gyoguId = gyoguId;
	}
	public long getMokjangId() {
		return mokjangId;
	}
	public void setMokjangId(long mokjangId) {
		this.mokjangId = mokjangId;
	}
}
