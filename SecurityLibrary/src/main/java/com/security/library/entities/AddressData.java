package com.security.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "address")
public class AddressData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private String localStreet;
	private String city;
	private String state;
	
}
