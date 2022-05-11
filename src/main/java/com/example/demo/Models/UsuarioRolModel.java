package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name="usuario_rol")
public class UsuarioRolModel {
    
    @EmbeddedId
    private UsuarioRolPk pk;
    
    @ManyToOne
    @MapsId("usuario")
    @JoinColumn(name = "codigo_usuario")
    private UsuarioModel usuario;

    @ManyToOne
    @MapsId("programa")
    @JoinColumn(name = "programa_id")
    private ProgramaModel programa;
    
    @ManyToOne
    @MapsId("rol")
    @JoinColumn(name = "rol_id")
    private RolModel rol;
    
    private boolean estado;

    public UsuarioRolPk getPk() {
        return pk;
    }

    public void setPk(UsuarioRolPk pk) {
        this.pk = pk;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public ProgramaModel getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaModel programa) {
        this.programa = programa;
    }

    public RolModel getRol() {
        return rol;
    }

    public void setRol(RolModel rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}


