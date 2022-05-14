package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.EstudiantesModel;
import com.example.demo.Repositories.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    
    public ArrayList<EstudiantesModel> obtenerEstudiante(){
        return (ArrayList<EstudiantesModel>)estudianteRepository.findAll();
    }

    public EstudiantesModel guardarEstudiante(EstudiantesModel facultad){
        return estudianteRepository.save(facultad);
    }
    
    public ArrayList<EstudiantesModel> obtenerPorNombre(String nombre){
        return estudianteRepository.findByNombre(nombre);
    }
}
