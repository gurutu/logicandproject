package com.restaurant.api.bean;

import java.io.Serializable;

import javax.persistence.Id;

public class ResturantandLocationDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer Id;
	
	private String name;
	
	private String cuisines;
	
	private Integer average_cost_for_two;
	
	private String currency;
	
	private String has_Table_Booking;
	
	private String has_Online_Delivery;
	
	private Float aggregate_Rating;
	
    private String rating_Color;
	
    private String rating_Text;
	
    private String votes;
    
	private Integer country_Code;
	
	private String city;
	
	private String address;
	
	private String locality;
	
	private String locality_Verbose;
	
	private Double longitude;
	
    private Double latitude;
    
    
    public ResturantandLocationDTO() {
		// TODO Auto-generated constructor stub
	}
    
    public ResturantandLocationDTO(RestaurantBean r,RestaurantLocationBean rlb) {
  		this.Id=r.getId();
  		this.name=r.getName();
  		this.cuisines=r.getCuisines();
  		this.average_cost_for_two=r.getAverage_cost_for_two();
  		this.currency=r.getCurrency();
  		this.has_Table_Booking=r.getHas_Table_Booking();
  		this.has_Online_Delivery=r.getHas_Online_Delivery();
  		this.aggregate_Rating=r.getAggregate_Rating();
  	    this.rating_Color=r.getRating_Color();
  	    this.rating_Text=r.getRating_Text();
  	    this.votes=r.getVotes();
  		this.country_Code=rlb.getCountry_Code();
  		this.city=rlb.getCity();
  		this.address=rlb.getAddress();
  		this.locality=rlb.getLocality();
  		this.locality_Verbose=rlb.getLocality_Verbose();
  		this.longitude=rlb.getLongitude();
  	    this.latitude=rlb.getLatitude();
  	}
    

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisines() {
		return cuisines;
	}

	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}

	public Integer getAverage_cost_for_two() {
		return average_cost_for_two;
	}

	public void setAverage_cost_for_two(Integer average_cost_for_two) {
		this.average_cost_for_two = average_cost_for_two;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getHas_Table_Booking() {
		return has_Table_Booking;
	}

	public void setHas_Table_Booking(String has_Table_Booking) {
		this.has_Table_Booking = has_Table_Booking;
	}

	public String getHas_Online_Delivery() {
		return has_Online_Delivery;
	}

	public void setHas_Online_Delivery(String has_Online_Delivery) {
		this.has_Online_Delivery = has_Online_Delivery;
	}

	public Float getAggregate_Rating() {
		return aggregate_Rating;
	}

	public void setAggregate_Rating(Float aggregate_Rating) {
		this.aggregate_Rating = aggregate_Rating;
	}

	public String getRating_Color() {
		return rating_Color;
	}

	public void setRating_Color(String rating_Color) {
		this.rating_Color = rating_Color;
	}

	public String getRating_Text() {
		return rating_Text;
	}

	public void setRating_Text(String rating_Text) {
		this.rating_Text = rating_Text;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
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
