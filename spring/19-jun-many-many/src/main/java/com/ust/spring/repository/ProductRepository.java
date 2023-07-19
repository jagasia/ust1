package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
