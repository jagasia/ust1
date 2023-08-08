package com.ust.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ecom.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

}
