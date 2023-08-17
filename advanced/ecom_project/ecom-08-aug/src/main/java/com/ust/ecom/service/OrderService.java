package com.ust.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ecom.entity.Order;
import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;
import com.ust.ecom.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository or;
	
	public Order create(Order order) {
		return or.save(order);
	}
	public List<Order> read() {
		return or.findAll();
	}
	public Order read(Long id) {
		Optional<Order> temp = or.findById(id);
		Order order=null;
		if(temp.isPresent())
		{
			order=temp.get();			
		}
		return order;
	}
	public Order update(Order order) {
		Order temp = read(order.getId());
		if(temp!=null)
		{
			temp=order;
			or.save(temp);
		}
		return temp;
	}
	public Order delete(Long id) {
		Order temp=read(id);
		if(temp!=null)
		{
			or.delete(temp);
		}
		return temp;
	}
	
	public List<Order> findOrdersByOrderId(Long orderId)
	{
		return or.findByOrderId(orderId);
	}
	
	public List<Order> findOrdersByProduct(Product product)
	{
		return or.findByProduct(product);
	}
	
	public List<Order> findOrdersByUser(User user)
	{//List<Order> findByCustomer(User customer);
		return or.findByCustomer(user);
	}
	
	public Long generateOrderId()
	{
		Long id=or.generateOrderId();
		System.out.println(id);
		if(id==null)
			id=0L;
		id++;
		return id;
		
//		Long id=or.generateOrderId();
//		if(id!=null)
//		{
//			id++;
//		}
//		else
//		{
//			id=1L;
//		}
//		return id;
		
//		Long id=or.generateOrderId();
//		return (id!=null)?id++:1L;
	}

}
