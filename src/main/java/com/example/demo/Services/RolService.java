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

    public ArrayList<RolModel> obtenerRol(){
        return (ArrayList<RolModel>)rolRepository.findAll();
    }

    public RolModel guardarRol(RolModel rol){
        return rolRepository.save(rol);
    }
}
