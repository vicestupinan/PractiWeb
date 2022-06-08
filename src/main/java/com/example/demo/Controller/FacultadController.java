package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Models.FacultadModel;
import com.example.demo.Models.ProgramaModel;
import com.example.demo.Services.FacultadService;
import com.example.demo.Services.ProgramaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facultadadmin")
@CrossOrigin
@PreAuthorize("hasRole('ADMIN')")
public class FacultadController {
    @Autowired
    FacultadService facultadService;

    @Autowired
    ProgramaService programaService;

    @GetMapping("/facultades")
    public ArrayList<FacultadModel> obtenerFacultades() {
        return facultadService.obtenerFacultad();
    }

    @PostMapping("/nuevafacultad")
    public FacultadModel guardarFacultad(@RequestBody FacultadModel facultad) {
        return this.facultadService.guardarFacultad(facultad);
    }

    @GetMapping("/programas")
    public ArrayList<ProgramaModel> obtenerProgramas() {
        return programaService.obtenerPrograma();
    }

    @PostMapping("/nuevoprograma")
    public ProgramaModel guardarPrograma(@RequestBody ProgramaModel programa) {
        return this.programaService.guardarPrograma(programa);
    }

}
