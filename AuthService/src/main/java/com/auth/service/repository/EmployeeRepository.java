package com.auth.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.security.library.entities.EmployeeData;


public interface EmployeeRepository extends JpaRepository<EmployeeData, Integer> {

	@Query(nativeQuery = true, value = "select * from employee e where e.email= :email")
	EmployeeData findByEmail(String email);
}
