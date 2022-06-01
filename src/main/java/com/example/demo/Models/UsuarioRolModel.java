package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String usuario;
    private Long programa;
    private Long rol;

    private boolean estado;

    public UsuarioRolModel(String usuario, Long programa, Long rol, boolean estado) {
        this.usuario = usuario;
        this.programa = programa;
        this.rol = rol;
        this.estado = estado;
    }

    public Long getPrograma() {
        return programa;
    }

    public void setPrograma(Long programa) {
        this.programa = programa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getRol() {
        return rol;
    }

    public void setRol(Long rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
