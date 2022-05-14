package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class EstudiantesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private long codigoEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String periodoAspira;

    public EstudiantesModel() {
    }
    

    public EstudiantesModel(Long id, long codigoEstudiante, String nombre, String apellido, String telefono,
            String correo, String periodoAspira) {
        this.id = id;
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.periodoAspira = periodoAspira;
    }


    public Long getId() {
        return id;
    }

    public long getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(long codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getPeriodoAspira() {
        return periodoAspira;
    }


    public void setPeriodoAspira(String periodoAspira) {
        this.periodoAspira = periodoAspira;
    }

   
    
}
