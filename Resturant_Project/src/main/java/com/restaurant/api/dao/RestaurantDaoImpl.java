package com.restaurant.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;
import com.restaurant.api.bean.ResturantandLocationDTO;
import com.restaurant.api.repo.RestaurantLocRepo;
import com.restaurant.api.repo.RestaurantRepo;

@Repository
public class RestaurantDaoImpl implements RestaurantDao{

	@Autowired
	private RestaurantRepo restRepo;
	
	@Autowired
	private RestaurantLocRepo restLocRepo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean saveRestauntdetail(List<RestaurantBean> al) {
		return restRepo.saveAll(al)!=null;
	}


	@Override
	public Boolean saveRestauntLocdetail(List<RestaurantLocationBean> al) {
		return restLocRepo.saveAll(al)!=null;
	}


	@Override
	public List<ResturantandLocationDTO> getAllResturantDetails() {
		List<ResturantandLocationDTO> list1=new ArrayList<ResturantandLocationDTO>();
		List<RestaurantBean> list=getAllRestaurant();
		for (RestaurantBean restaurantBean : list) {
			list1.add(new ResturantandLocationDTO(restaurantBean,getResturantLocById(restaurantBean.getId())));
		}
		return list1;
	}


	@Override
	public List<RestaurantBean> getAllRestaurant() {
		return restRepo.findAll();
	}


	@Override
	public RestaurantLocationBean getResturantLocById(Integer Id) {
		return restLocRepo.findById(Id).get();
	}

}
