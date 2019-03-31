package com.restaurant.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;

public interface RestaurantLocRepo extends JpaRepository<RestaurantLocationBean, Integer>{

}
