package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name="requisito")
public class RequisitosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name="id_pensum")
    private PensumModel pensum;

    public RequisitosModel() {
    }
    
    public RequisitosModel(Long id, String descripcion, PensumModel pensum) {
        this.id = id;
        this.descripcion = descripcion;
        this.pensum = pensum;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PensumModel getPensum() {
        return this.pensum;
    }

    public void setPensum(PensumModel pensum) {
        this.pensum = pensum;
    }
  
}
