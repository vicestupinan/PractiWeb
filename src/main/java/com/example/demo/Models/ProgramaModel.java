package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "programa")
public class ProgramaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    private Long facultad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getFacultad() {
        return facultad;
    }

    public void setFacultad(Long facultad) {
        this.facultad = facultad;
    }

}
