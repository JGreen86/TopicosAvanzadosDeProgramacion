package com.ites.proyectotemplate.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;
import java.util.Date;

@Entity
@Table( name = "usuarios" )
public class Usuario {

    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private Direccion direccion;
    private Instant fechaUltimoInicio;

    public Usuario() {

    }

    public Usuario(String nombre, String apellidoP, String apellidoM, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @OneToOne
    @JoinColumn(name = "direcciones_id_direccion", referencedColumnName = "id_direccion")
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Instant getFechaUltimoInicio() {
        return fechaUltimoInicio;
    }

    public void setFechaUltimoInicio(Instant fechaUltimoInicio) {
        this.fechaUltimoInicio = fechaUltimoInicio;
    }
}