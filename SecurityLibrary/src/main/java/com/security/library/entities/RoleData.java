package com.security.library.entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "role")
@Table(name = "role")
public class RoleData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private String name;
	private List<String> authorities = new ArrayList<>();
	
	
	public RoleData(String name) {
		super();
		this.name = name;
	}
	
	public RoleData(String name, List<String> authorities) {
		super();
		this.name = name;
		this.authorities = authorities;
	}
}
