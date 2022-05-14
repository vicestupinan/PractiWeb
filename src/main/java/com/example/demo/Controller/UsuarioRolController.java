package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Models.UsuarioRolModel;
import com.example.demo.Services.UsuarioRolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuariorol")
public class UsuarioRolController {
    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping
    public ArrayList<UsuarioRolModel> obtenerUsuarioRol(){
        return usuarioRolService.obtenerUsuarioRol();
    }

    @PostMapping
    public UsuarioRolModel guardarUsuarioRol(@RequestBody UsuarioRolModel usuarioRol){
        return this.usuarioRolService.guardarPrograma(usuarioRol);
    }
    
}
