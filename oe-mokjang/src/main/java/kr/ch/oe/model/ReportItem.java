package kr.ch.oe.model;

/**
 * 목장보고서 항목
 *
 */
public class ReportItem {

	/**
	 * 이번트 항목순번
	 */
	private Long seq;
	
	/**
	 * 항목명
	 */
	private String itemName;
	
	/**
	 * 항목코드
	 */
	private String code;
	
	/**
	 * 항목점수 가중치
	 */
	private int weight;
	
	/**
	 * 항목설명
	 */
	private String itemDesc;
	
	/**
	 * 항목구분
	 */
	private String itemType;
	
	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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

	/**
	 * 항목구분설명
	 */
	private String itemTypeDesc;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
