package com.ust.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.Product;
import com.ust.spring.repository.ProductRepository;

class ProductAlreadyExistException extends RuntimeException
{
	public ProductAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/product")
public class ProductController1 {
	@Autowired
	private ProductRepository pr;

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		System.out.println(product);
		if(product.getId()==null)
		{
			return pr.save(product);
		}
		Product temp=findProductById(product.getId());
		if(temp==null)
		{
			pr.save(product);
		}else
		{
			throw new ProductAlreadyExistException("Product with ID:"+product.getId()+" Already exist");
		}
		return product;
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id")Integer id) {
		Optional<Product> temp=pr.findById(id);
		Product product=null;
		if(temp.isPresent())
		{
			product=temp.get();
		}
		return product;		
	}
	
	@GetMapping
	public List<Product> retrieveAllProducts() {
		return pr.findAll();
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id") Integer id,@RequestBody  Product product) {
		Product existing = findProductById(id);
		if(existing!=null)
		{
			existing=product;
			pr.save(existing);
		}
		return existing;
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id") Integer id) {
		Product temp=findProductById(id);
		if(temp!=null)
		{
			pr.delete(temp);
		}
		return temp;
	}
	
	
	
}
