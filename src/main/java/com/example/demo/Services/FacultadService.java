package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.FacultadModel;
import com.example.demo.Repositories.FacultadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultadService {
    @Autowired
    FacultadRepository facultadRepository;

    public ArrayList<FacultadModel>obtenerFacultad(){
        return (ArrayList<FacultadModel>)facultadRepository.findAll();
    }
    
}
