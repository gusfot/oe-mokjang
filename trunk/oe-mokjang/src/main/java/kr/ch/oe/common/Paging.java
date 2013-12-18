package kr.ch.oe.common;

import java.util.List;

public class Paging<T> {
	private int page;
	private int pageSize;
	private int totalNumOfItems;
	private List<T> items;
	
	public Paging(int page, int pageSize, int totalNumOfItems, List<T> items) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.totalNumOfItems = totalNumOfItems;
		this.items = items;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalNumOfItems() {
		return totalNumOfItems;
	}

	public void setTotalNumOfItems(int totalNumOfItems) {
		this.totalNumOfItems = totalNumOfItems;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
	
	
}
