package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manfacturer")
public class Manfacturer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "manfacturerName", nullable = false, length = 20)
	private String manfacturerName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManfacturerName() {
		return manfacturerName;
	}
	public void setManfacturerName(String manfacturerName) {
		this.manfacturerName = manfacturerName;
	}
	
	

	


}
