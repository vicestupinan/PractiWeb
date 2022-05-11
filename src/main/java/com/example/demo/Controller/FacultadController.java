package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Models.FacultadModel;
import com.example.demo.Services.FacultadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facultad")
public class FacultadController {
    @Autowired
    FacultadService facultadService;

    @GetMapping()
    public ArrayList<FacultadModel> obtenerFacultad(){
        return facultadService.obtenerFacultad();
    }

    @PostMapping
    public FacultadModel guardarFacultad(@RequestBody FacultadModel facultad){
        return this.facultadService.guardarFacultad(facultad);
    }

    @GetMapping(path = "/{nombre}")
    public ArrayList<FacultadModel> obtenerUsuarioPorId(@PathVariable("nombre") String nombre){
        return this.facultadService.obtenerPorNombre(nombre);
    }
}
