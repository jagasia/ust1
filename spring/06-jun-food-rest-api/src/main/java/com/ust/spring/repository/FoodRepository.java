package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>
{

}
