package com.example.prueba.democrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motorcycle")
public class Motorcycle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;

	@Column(name="cc")
	private String cc;

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(int id, String brand, String model, String cc) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cc = cc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", brand=" + brand + ", model=" + model + ", cc=" + cc + "]";
	}

	
}
