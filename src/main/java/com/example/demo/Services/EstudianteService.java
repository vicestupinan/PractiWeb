package com.example.demo.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Models.EstudianteModel;
import com.example.demo.Repositories.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public void guardarEstudiantes(MultipartFile file){
        try {
            List<EstudianteModel> estudiantes = SubirExcelService.excelLista(file.getInputStream());
            estudianteRepository.saveAll(estudiantes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<EstudianteModel> obtenerEstudiante(){
        return (ArrayList<EstudianteModel>)estudianteRepository.findAll();
    }

    public EstudianteModel guardarEstudiante(EstudianteModel estudiante) {
        return estudianteRepository.save(estudiante);
    }
    
}
