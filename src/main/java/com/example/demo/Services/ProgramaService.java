package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.ProgramaModel;
import com.example.demo.Repositories.ProgramaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {
    @Autowired
    ProgramaRepository programaRepository;

    public ArrayList<ProgramaModel> obtenerPrograma(){
        return (ArrayList<ProgramaModel>)programaRepository.findAll();
    }

    public ProgramaModel guardarPrograma(ProgramaModel programa){
        return programaRepository.save(programa);
    }
}
