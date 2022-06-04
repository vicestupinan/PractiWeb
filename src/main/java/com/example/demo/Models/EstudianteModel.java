package com.example.demo.Models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String periodoAspira;

    private String pensum;
    private boolean aprobacion;
    private String motivo;
    private String observaciones;
    private String encargado;
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPeriodoAspira() {
        return periodoAspira;
    }

    public void setPeriodoAspira(String periodoAspira) {
        this.periodoAspira = periodoAspira;
    }

    public String getPensum() {
        return pensum;
    }

    public void setPensum(String pensum) {
        this.pensum = pensum;
    }

    public boolean isAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(boolean aprobacion) {
        this.aprobacion = aprobacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
