package com.example.prueba.democrud.service;

import java.util.List;

import com.example.prueba.democrud.models.Motorcycle;

public interface MotorcycleService {

	public List<Motorcycle> getAllMotorcycles();
	public Motorcycle getMotorcycleById(int motorcycleId);
	public Motorcycle addOrUpdateMotorcycle(Motorcycle motorcycle);
	public Motorcycle deleteMotorcycle(int motorcycleId);
}
