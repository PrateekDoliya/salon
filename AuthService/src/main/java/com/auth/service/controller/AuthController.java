package com.auth.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.service.requestDto.LoginRequest;
import com.auth.service.service.EmployeeAuthenticationService;

@RestController
@RequestMapping("/api/v1/authenticate")
public class AuthController<T> {

	@Autowired
	private EmployeeAuthenticationService<T> employeeAuthenticationService;

	@PostMapping("/signin")
	public T doLogin( @RequestBody LoginRequest request ) {
		
		Object login = this.employeeAuthenticationService.doLogin(request);
		return (T) login;
	}
	
	
}
