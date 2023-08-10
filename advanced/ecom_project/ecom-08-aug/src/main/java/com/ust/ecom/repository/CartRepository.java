package com.ust.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ecom.entity.Cart;
import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>
{
	List<Cart> findByUser(User user);
}
