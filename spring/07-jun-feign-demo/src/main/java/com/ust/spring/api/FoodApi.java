package com.ust.spring.api;

import java.io.IOException;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ust.spring.entity.Food;

@FeignClient(name = "food-api",url = "http://localhost:8080/food")
public interface FoodApi {

	@PostMapping
	public Food addFood(@RequestBody Food food);
	
	@PostMapping("/photo")
	public Food addFood1(@RequestParam("name")String name,@RequestParam("price") Double price,@RequestParam("photo") MultipartFile file) throws IOException;
	
	@GetMapping
	public List<Food> retrieveAllFoods();
	
	@GetMapping("/{id}")
	public Food findFoodById(@PathVariable("id") Integer id);
	
	@PutMapping
	public Food updateFood(@RequestBody Food food);
	
	@DeleteMapping("/{id}")
	public Food deleteFood(@PathVariable("id") Integer id);
	
	
}
