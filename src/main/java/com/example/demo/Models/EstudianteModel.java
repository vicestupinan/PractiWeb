package com.example.demo.Models;

import javax.persistence.*;
/*Comentario*/
@Entity
@Table(name = "estudiante")
public class EstudianteModel {

    @Id
    @Column(unique = true, nullable = false)
    private String codigo;

    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String periodoAspira;

    public EstudianteModel(){
        
    }
    
    public EstudianteModel(String codigo, String nombre, String apellido, String telefono, String correo,
            String periodoAspira) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.periodoAspira = periodoAspira;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
