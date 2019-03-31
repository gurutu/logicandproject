package com.restaurant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;
import com.restaurant.api.bean.ResturantandLocationDTO;
import com.restaurant.api.dao.RestaurantDao;

@Service
public class RestaurantServiceImp implements RestaurantService{

	@Autowired
	private RestaurantDao restaurantDao; 
	
	@Override
	public Boolean saveRestauntdetail(List<RestaurantBean> al) {
		boolean b=restaurantDao.saveRestauntdetail(al);
		return b;
	}

	@Override
	public Boolean saveRestauntLocdetail(List<RestaurantLocationBean> al) {
		return restaurantDao.saveRestauntLocdetail(al);
	}

	@Override
	public List<ResturantandLocationDTO> getAllResturantDetails() {
		
		return restaurantDao.getAllResturantDetails();
	}
      
	
	
}
