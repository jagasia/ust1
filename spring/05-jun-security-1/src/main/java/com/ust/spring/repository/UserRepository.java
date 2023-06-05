package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.entity.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, String>
{

}
