package com.example.demo.Repositories;

import com.example.demo.Models.EstudianteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel,String>{
    
}