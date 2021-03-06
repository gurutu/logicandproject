package com.restaurant.api.dao;

import java.util.List;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;
import com.restaurant.api.bean.ResturantandLocationDTO;

public interface RestaurantDao {

	boolean saveRestauntdetail(List<RestaurantBean> al);

	Boolean saveRestauntLocdetail(List<RestaurantLocationBean> al);

	List<ResturantandLocationDTO> getAllResturantDetails();
	
	List<RestaurantBean> getAllRestaurant();
	
	RestaurantLocationBean getResturantLocById(Integer Id);

}
