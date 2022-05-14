package com.example.demo.Repositories;

import java.util.ArrayList;

import com.example.demo.Models.EstudiantesModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudiantesModel,Long>{
    public abstract ArrayList<EstudiantesModel> findByNombre(String nombre);
    
}
