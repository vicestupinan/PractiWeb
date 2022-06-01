package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.Models.UsuarioRolModel;
import com.example.demo.Repositories.UsuarioRolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerUsuarioRol(){
        return (ArrayList<UsuarioRolModel>)usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarUsuarioRol(UsuarioRolModel usuarioRol){
        return usuarioRolRepository.save(usuarioRol);
    }
}
