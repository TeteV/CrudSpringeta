package com.example.prueba.democrud.views;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.democrud.models.Motorcycle;

@Repository
public interface MotorcycleRepository extends CrudRepository<Motorcycle, Integer> {

}
