package com.restaurant.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.api.bean.RestaurantBean;

public interface RestaurantRepo extends JpaRepository<RestaurantBean, Integer>{


}
