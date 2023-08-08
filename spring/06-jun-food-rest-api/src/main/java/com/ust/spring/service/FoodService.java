package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.Food;
import com.ust.spring.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
	private FoodRepository fr;
	
	public Food create(Food food) {
		return fr.save(food);
	}
	
	public List<Food> read() {
		return fr.findAll();
	}
	
	public Food read(Integer id) {
		Optional<Food> temp = fr.findById(id);
		Food food=null;
		if(temp.isPresent())
		{
			food=temp.get();
		}
		return food;
	}
	
	public Food update(Food food) {
		Food f=read(food.getId());
		if(f!=null)
		{
			f=food;
			fr.save(f);
		}
		return f;
	}
	public Food delete(Integer id) {
		Food f=read(id);
		if(f!=null)
		{			
			fr.delete(f);
		}
		return f;
	}
	
}
