package com.restaurant.api.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class RestaurantBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -444951849511454113L;
	
	@Id
	@JsonProperty("Restaurant ID")
	private Integer Id;
	
	@JsonProperty("Restaurant Name")
	private String name;
	
	@JsonProperty("Cuisines")
	private String cuisines;
	
	@JsonProperty("Average Cost for two")
	private Integer average_cost_for_two;
	
	@JsonProperty("Currency")
	private String currency;
	
	@JsonProperty("Has Table booking")
	private String has_Table_Booking;
	
	@JsonProperty("Has Online delivery")
	private String has_Online_Delivery;
	
	@JsonProperty("Aggregate rating")
	private Float aggregate_Rating;
	
	@JsonProperty("Rating color")
    private String rating_Color;
	
	@JsonProperty("Rating text")
    private String rating_Text;
	
	@JsonProperty("Votes")
    private String votes;
    
    
    
    
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
	public Float getAggregate_Rating() {
		return aggregate_Rating;
	}
	public void setAggregate_Rating(Float aggregate_Rating) {
		this.aggregate_Rating = aggregate_Rating;
	}
 
    


	
	
	
}
