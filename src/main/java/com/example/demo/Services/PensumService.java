package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.PensumModel;
import com.example.demo.Repositories.PensumRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensumService {
    
    @Autowired
    PensumRepository pensumRepository;

    public ArrayList<PensumModel> obtenerFacultad(){
        return (ArrayList<PensumModel>)pensumRepository.findAll();
    }

    public PensumModel guardarFacultad(PensumModel pensum){
        return pensumRepository.save(pensum);
    }
}
