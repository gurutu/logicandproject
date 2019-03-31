package com.restaurant.api.bean;

import java.util.List;
import java.util.Map;

public class RowPojo {

	private String message;
	private List<Object> data;
	private Map<String,Object> row;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public Map<String, Object> getRow() {
		return row;
	}
	public void setRow(Map<String, Object> row) {
		this.row = row;
	}
	
	
	
	
}
