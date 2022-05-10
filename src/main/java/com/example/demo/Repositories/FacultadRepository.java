package com.example.demo.Repositories;

import java.util.ArrayList;

import com.example.demo.Models.FacultadModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultadRepository extends CrudRepository<FacultadModel, Long> {   
    public abstract ArrayList<FacultadModel> findByNombre(String nombre);
}
