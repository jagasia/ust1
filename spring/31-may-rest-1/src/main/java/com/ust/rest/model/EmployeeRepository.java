package com.ust.rest.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByName(String name);
	List<Employee> findByDepartment(String department);
	
	@Query("from Employee e where e.name=:name and e.department=:department")
	List<Employee> findByNameAndDepartment(@Param("name")String name,@Param("department") String department);
}
