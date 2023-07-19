package com.ust.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.api.FoodApi;
import com.ust.spring.entity.Food;

@RestController
public class MyController {
	@Autowired
	private FoodApi api;
	
	@GetMapping("/home")
	public String home()
	{
		Food food = api.findFoodById(28);
		if(food!=null)
		{
			return food.getName();
		}
		return "hello world from 07-Jun";
	}
}
