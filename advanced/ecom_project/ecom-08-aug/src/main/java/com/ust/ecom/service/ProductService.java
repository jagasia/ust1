package com.ust.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;
import com.ust.ecom.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product Product) {
		return pr.save(Product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Long id) {
		Optional<Product> temp = pr.findById(id);
		Product Product=null;
		if(temp.isPresent())
		{
			Product=temp.get();
		}
		return Product;
	}
	public Product update(Product Product) {
		Product temp = read(Product.getId());
		if(temp!=null)
		{
			temp=Product;
			pr.save(temp);
		}
		return temp;
	}
	public Product delete(Long id) {
		Product Product=read(id);
		if(Product!=null)
		{
			pr.delete(Product);
		}
		return Product;
	}
	
	public List<Product> findProductsByUser(User user)
	{
		return pr.findByUser(user);
	}
	
	public List<Product> findProductsRange(int pageNo, int pageSize)
	{
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		Page<Product> page = pr.findAll(pageable);
		return page.getContent();
	}
	
}
