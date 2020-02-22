package com.example.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table
@Data
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String userid;
	private String username;
	private String gender;
	private int age;
	private String city;
}
