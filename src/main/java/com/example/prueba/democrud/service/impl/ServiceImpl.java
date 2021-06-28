package com.example.prueba.democrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.democrud.models.Motorcycle;
import com.example.prueba.democrud.service.MotorcycleService;
import com.example.prueba.democrud.views.MotorcycleRepository;

@Service
public class ServiceImpl implements MotorcycleService {
	
	@Autowired
	private MotorcycleRepository motorcycleRepo;

	@Override
	public List<Motorcycle> getAllMotorcycles() {
		return (List<Motorcycle>) motorcycleRepo.findAll();
	}

	@Override
	public Motorcycle getMotorcycleById(int motorcycleId) {
		
		return motorcycleRepo.findById(motorcycleId).orElse(null);
	}

	@Override
	public Motorcycle addOrUpdateMotorcycle(Motorcycle motorcycle) {
		return motorcycleRepo.save(motorcycle);
	}

	@Override
	public Motorcycle deleteMotorcycle(int motorcycleId) {
		Motorcycle deteledMoto = null;
		try {
			deteledMoto = motorcycleRepo.findById(motorcycleId).orElse(null);
			if(deteledMoto == null) {
				throw new Exception("Motorcycle not found");
			}else {
				motorcycleRepo.deleteById(motorcycleId);
			}
		}catch(Exception ex) {
			System.out.println("Roto aqui en el exception");
		}
		
		return deteledMoto;
	}

}
