package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name="facultad")
public class FacultadModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
