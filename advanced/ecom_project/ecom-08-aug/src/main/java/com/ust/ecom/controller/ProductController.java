package com.ust.ecom.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;
import com.ust.ecom.service.ProductService;
import com.ust.ecom.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
@MultipartConfig
public class ProductController {
	@Autowired
	private ProductService ps;
	@Autowired
	private UserService us;
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return ps.create(product);
	}
	
	@PostMapping("/new")
	public Product create1(@RequestParam("category") String category,@RequestParam("description") String description,@RequestParam("keywords") String keywords,@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("userId") Long userId,@RequestParam("photo") MultipartFile file) throws IOException {
		byte[] photo = file.getBytes();
		
		Product product=new Product(null, name, description, price, category, keywords, us.read(userId), photo);
		System.out.println(product);
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product read(@PathVariable("id") Long id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable("id")Long id,@RequestParam("category") String category,@RequestParam("description") String description,@RequestParam("keywords") String keywords,@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("user") User user,@RequestParam("photo") MultipartFile file) throws IOException {
		byte[] photo = file.getBytes();
		Product product=new Product(id, name, description, price, category, keywords, user, photo);
	
		return ps.update(product);
	}

	@PutMapping("/new/{id}")
	public Product update1(@PathVariable("id") Long id,@RequestBody Product product) {
		return ps.update(product);
	}

	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id") Long id) {
		return ps.delete(id);
	}
	
	@PostMapping("/user")
	public List<Product> findProductsByUser(@RequestBody User user)
	{
		return ps.findProductsByUser(user);
	}
	
	@GetMapping("/{page}/{rows}")
	public List<Product> findProductsRange(@PathVariable("page")int pageNo, @PathVariable("rows") int rows)
	{
		return ps.findProductsRange(pageNo, rows);
	}
}
