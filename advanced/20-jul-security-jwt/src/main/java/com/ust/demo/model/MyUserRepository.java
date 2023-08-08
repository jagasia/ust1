package com.ust.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String>
{

}
