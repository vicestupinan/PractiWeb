package com.example.demo.Models;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class UsuarioRolPk implements Serializable{

    @Column(name = "codigo_usuario")
    public String usuario; 

    @Column(name = "programa_id")
    public Long programa;

    @Column(name = "rol_id")
    public Long rol;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getPrograma() {
        return programa;
    }

    public void setPrograma(Long programa) {
        this.programa = programa;
    }

    public Long getRol() {
        return rol;
    }

    public void setRol(Long rol) {
        this.rol = rol;
    }

}
