package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Map;

import com.example.demo.Models.EstudianteModel;
import com.example.demo.Services.EstudianteService;
import com.example.demo.Services.SubirExcelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/estudiante")
@CrossOrigin
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/lista")
    public ArrayList<EstudianteModel> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiante();
    }

    @PostMapping("/subir")
    public ResponseEntity<?> subirArchivo(@RequestParam("file")MultipartFile file){
        if(SubirExcelService.verificarFormato(file)){
            estudianteService.guardarEstudiantes(file);

            return ResponseEntity.ok(Map.of("message", "Archivo guardado"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Subir archivo excel");
    }

}
