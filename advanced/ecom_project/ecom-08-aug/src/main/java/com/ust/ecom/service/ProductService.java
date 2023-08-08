package com.ust.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ecom.entity.Product;
import com.ust.ecom.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product product) {
		return pr.save(product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Long id) {
		Optional<Product> temp = pr.findById(id);
		Product product=null;
		if(temp.isPresent())
		{
			product=temp.get();
		}
		return product;
	}
	public Product update(Product product) {
		Product temp = read(product.getId());
		if(temp!=null)
		{
			temp=product;
			pr.save(temp);
		}
		return temp;
	}
	public Product delete(Long id) {
		Product product=read(id);
		if(product!=null)
		{
			pr.delete(product);
		}
		return product;
	}
	
}
