package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.RolModel;
import com.example.demo.Repositories.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    
    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> obtenerFacultad(){
        return (ArrayList<RolModel>)rolRepository.findAll();
    }

    public RolModel guardarFacultad(RolModel rol){
        return rolRepository.save(rol);
    }
}
