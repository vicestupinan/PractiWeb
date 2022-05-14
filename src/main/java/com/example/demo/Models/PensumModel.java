package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name="pensum")
public class PensumModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private char estado;

    @ManyToOne
    @JoinColumn(name="id_programa")
    private ProgramaModel programa;
    
    public PensumModel() {
    }
    

    public PensumModel(Long id, String nombre, char estado, ProgramaModel programa) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.programa = programa;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEstado() {
        return this.estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public ProgramaModel getPrograma() {
        return this.programa;
    }

    public void setPrograma(ProgramaModel programa) {
        this.programa = programa;
    }

}
