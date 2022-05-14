package com.example.demo.Models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolModel {
    
    @Id
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "rol")
	Set<UsuarioRolModel> rolUsuario;

    public RolModel() {
    }

    public RolModel(Long id, String nombre, Set<UsuarioRolModel> rolUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.rolUsuario = rolUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
