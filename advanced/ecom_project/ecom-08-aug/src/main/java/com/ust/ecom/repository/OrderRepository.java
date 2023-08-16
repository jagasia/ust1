package com.ust.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ust.ecom.entity.Order;
import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>
{
	List<Order> findByOrderId(Long orderId);
	List<Order> findByCustomer(User customer);
	List<Order> findByProduct(Product product);
	@Query("select max(o.orderId) from Order o")
	public Long generateOrderId();
}
