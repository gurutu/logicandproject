package com.restaurant.api.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class RestaurantLocationBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -658737988117873571L;
	
	@Id
	@JsonProperty("Restaurant ID")
	private Integer Id;
	
	@JsonProperty("Country Code")
	private Integer country_Code;
	
	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Address")
	private String address;
	
	@JsonProperty("Locality")
	private String locality;
	
	@JsonProperty("Locality Verbose")
	private String locality_Verbose;
	
	@JsonProperty("Longitude")
	private Double longitude;
	
	@JsonProperty("Latitude")
    private Double latitude;
    
    
    
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getCountry_Code() {
		return country_Code;
	}
	public void setCountry_Code(Integer country_Code) {
		this.country_Code = country_Code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getLocality_Verbose() {
		return locality_Verbose;
	}
	public void setLocality_Verbose(String locality_Verbose) {
		this.locality_Verbose = locality_Verbose;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	

	
	
}
