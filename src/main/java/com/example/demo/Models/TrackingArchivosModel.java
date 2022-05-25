package com.example.demo.Models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="control_archivos")
public class TrackingArchivosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre_archivo;

    @Temporal(TemporalType.DATE)
    private Date fecha_subida = new Date();

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private UsuarioModel usuario;

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Date getFecha_subida() {
        return fecha_subida;
    }

    public void setFecha_subida(Date fecha_subida) {
        this.fecha_subida = fecha_subida;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

}
