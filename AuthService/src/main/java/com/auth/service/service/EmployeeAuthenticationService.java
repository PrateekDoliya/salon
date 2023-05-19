package com.auth.service.service;

import com.auth.service.requestDto.LoginRequest;
import com.auth.service.responseDto.LoginResponse;

public interface EmployeeAuthenticationService<T> {

	
	// LOGIN
	T doLogin(LoginRequest loginRequest);
	
}
