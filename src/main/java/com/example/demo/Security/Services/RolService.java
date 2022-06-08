package com.example.demo.Security.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Security.Enums.RolNombre;
import com.example.demo.Security.Models.Rol;
import com.example.demo.Security.Repositories.RolRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }

    public ArrayList<Rol> obtenerRoles(){
        return (ArrayList<Rol>)rolRepository.findAll();
    }
}
