package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
