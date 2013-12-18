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
	private int groupId;
	private int churchId;
	private int gyoguId;
	private int zoId;
	private List<Mokjang> mokjangList;
	
	public int getChurchId() {
		return churchId;
	}
	public void setChurchId(int churchId) {
		this.churchId = churchId;
	}
	public int getGyoguId() {
		return gyoguId;
	}
	public void setGyoguId(int gyoguId) {
		this.gyoguId = gyoguId;
	}
	public int getZoId() {
		return zoId;
	}
	public void setZoId(int zoId) {
		this.zoId = zoId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public List<Mokjang> getMokjangList() {
		return mokjangList;
	}
	public void setMokjangList(List<Mokjang> mokjangList) {
		this.mokjangList = mokjangList;
	}
}
