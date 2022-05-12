package com.example.demo.Controller;

import java.util.ArrayList;

import com.example.demo.Models.ProgramaModel;
import com.example.demo.Services.ProgramaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programa")
public class ProgramaController {
    @Autowired
    ProgramaService programaService;

    @GetMapping()
    public ArrayList<ProgramaModel> obtenerPrograma(){
        return programaService.obtenerPrograma();
    }

    @PostMapping
    public ProgramaModel guardarPrograma(@RequestBody ProgramaModel programa){
        return this.programaService.guardarPrograma(programa);
    }
}
