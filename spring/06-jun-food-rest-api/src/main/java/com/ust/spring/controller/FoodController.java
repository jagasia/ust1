package com.ust.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ust.spring.entity.Food;
import com.ust.spring.service.FoodService;

@MultipartConfig
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodService fs;
	
//	@RequestMapping(method = RequestMethod.POST, value = "/food", params = "add")
	@PostMapping
	public Food addFood(@RequestBody Food food) {
		return fs.create(food);
	}
	
	@PostMapping("/photo")
	public Food addFood1(@RequestParam("name")String name,@RequestParam("price") Double price,@RequestParam("photo") MultipartFile file) throws IOException
	{
		Food food=new Food();
		food.setName(name);
		food.setPrice(price);
		byte []photo=file.getBytes();
		food.setPhoto(photo);
		return fs.create(food);
	}
	
	@GetMapping
	public List<Food> retrieveAllFoods() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Food findFoodById(@PathVariable("id") Integer id) {
		return fs.read(id);
	}
	
	@PutMapping
	public Food updateFood(@RequestBody Food food) {
		return fs.update(food);
	}
	
	@DeleteMapping("/{id}")
	public Food deleteFood(@PathVariable("id") Integer id) {
		return fs.delete(id);
	}
	
}
