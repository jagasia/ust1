package com.ust.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ecom.entity.Cart;
import com.ust.ecom.entity.User;
import com.ust.ecom.repository.CartRepository;

@Service
public class CartService {
	@Autowired
	private CartRepository cr;
	
	public Cart create(Cart cart) {
		return cr.save(cart);
	}
	public List<Cart> read() {
		return cr.findAll();
	}
	public Cart read(Long id) {
		Optional<Cart> temp = cr.findById(id);
		Cart cart=null;
		if(temp.isPresent())
		{
			cart=temp.get();
		}
		return cart;
	}
	public Cart update(Cart cart) {
		Cart temp = read(cart.getId());
		if(temp!=null)
		{
			temp=cart;
			cr.save(temp);
		}
		return temp;
	}
	public Cart delete(Long id) {
		Cart cart=read(id);
		if(cart!=null)
		{
			cr.delete(cart);
		}
		return cart;
	}
	
	public List<Cart> findCartsByUser(User user)
	{
		return cr.findByUser(user);
	}
	
}
