package kr.ch.oe.model;

import java.util.Date;

public class ReportItem {

	private Long reportItemSeq;
	
	private String itemName;
	
	private Integer weight;
	
	private String code;
	
	private String itemType;
	
	private String itemTypeDesc;
	
	private Integer priority;
	
	private String useYn;
	
	private Long reportItemMngrSeq;
	
	private String regId;
	
	private Date regTime;
	
	private String itemDesc;

	public Long getReportItemSeq() {
		return reportItemSeq;
	}

	public void setReportItemSeq(Long reportItemSeq) {
		this.reportItemSeq = reportItemSeq;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemTypeDesc() {
		return itemTypeDesc;
	}

	public void setItemTypeDesc(String itemTypeDesc) {
		this.itemTypeDesc = itemTypeDesc;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public Long getReportItemMngrSeq() {
		return reportItemMngrSeq;
	}

	public void setReportItemMngrSeq(Long reportItemMngrSeq) {
		this.reportItemMngrSeq = reportItemMngrSeq;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
}