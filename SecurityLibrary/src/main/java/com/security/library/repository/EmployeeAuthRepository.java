package com.security.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.library.entities.EmployeeData;

public interface EmployeeAuthRepository extends JpaRepository<EmployeeData, Integer> {

//	@Query(nativeQuery = true, value = "select * from employeeservice_salonapp.employee e where e.email= :email")
//	Optional<Employee> findByEmail(String email);

	@Query(nativeQuery = true, value = "select * from employeeservice_salonapp.employee e " + "inner join "
			+ "employeeservice_salonapp.role r on r.rid=e.role_rid " + "inner join "
			+ "employeeservice_salonapp.address a on a.aid=e.address_aid " + "where e.email= :email")

	Optional<EmployeeData> findByEmail(String email);

}
