package com.restaurant.api.service;

import java.util.List;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;
import com.restaurant.api.bean.ResturantandLocationDTO;

public interface RestaurantService {

	Boolean saveRestauntdetail(List<RestaurantBean> al);

	Boolean saveRestauntLocdetail(List<RestaurantLocationBean> al);
	
	List<ResturantandLocationDTO> getAllResturantDetails();

}
