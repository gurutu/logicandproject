package com.restaurant.api.dto;

import java.io.Serializable;

public class CreditCardDTO implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String education;
	private Integer limit_Balance;
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Integer getLimit_Balance() {
		return limit_Balance;
	}
	public void setLimit_Balance(Integer limit_Balance) {
		this.limit_Balance = limit_Balance;
	}
	
	
}
