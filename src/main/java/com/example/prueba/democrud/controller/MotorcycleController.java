package com.example.prueba.democrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.democrud.models.Motorcycle;
import com.example.prueba.democrud.service.MotorcycleService;

@RestController
@RequestMapping("/motorcycles")
public class MotorcycleController {

	@Autowired
	private MotorcycleService motorcycleService;
	
	@GetMapping("/allMotorcycles")
	public ResponseEntity<List<Motorcycle>> getAllMotorcycles(){
		List<Motorcycle> motorcycles = null;
		try {
			motorcycles = motorcycleService.getAllMotorcycles();
		}catch(Exception ex){
			ex.getMessage();
		}
		
		return new ResponseEntity<List<Motorcycle>>(motorcycles,HttpStatus.OK);
		
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Motorcycle> getMotorcycleById(@PathVariable("id") int motorcycleId){
		Motorcycle motorcycles = null;
		try {
			motorcycles = motorcycleService.getMotorcycleById(motorcycleId);
		}catch(Exception ex){
			ex.getMessage();
		}
		
		return new ResponseEntity<Motorcycle>(motorcycles,HttpStatus.OK);
		
	}
	
	@PostMapping("/addOrUpdate")
	public ResponseEntity<Motorcycle> addOrUpdate(@RequestBody Motorcycle motorcycle){
		Motorcycle motorcycles = null;
		try {
			motorcycles = motorcycleService.addOrUpdateMotorcycle(motorcycle);
		}catch(Exception ex){
			ex.getMessage();
		}
		
		return new ResponseEntity<Motorcycle>(motorcycles,HttpStatus.OK);
		
	}
	

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Motorcycle> deleteMotorcycle(@PathVariable("id") int motorcycleId){
		Motorcycle motorcycles = null;
		try {
			motorcycles = motorcycleService.deleteMotorcycle(motorcycleId);
		}catch(Exception ex){
			ex.getMessage();
		}
		
		return new ResponseEntity<Motorcycle>(motorcycles,HttpStatus.OK);
		
	}
	
	
}
