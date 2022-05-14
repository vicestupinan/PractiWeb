package com.example.demo.Models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioModel {

    @Id
    @Column(unique = true, nullable = false)
    private String codigo;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

	@OneToMany(mappedBy = "usuario")
	Set<UsuarioRolModel> rolUsuario;

	public UsuarioModel() {
	}

	public UsuarioModel(String codigo, String nombre, String apellido, String correo, String telefono,
			Set<UsuarioRolModel> rolUsuario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.rolUsuario = rolUsuario;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}    

}
