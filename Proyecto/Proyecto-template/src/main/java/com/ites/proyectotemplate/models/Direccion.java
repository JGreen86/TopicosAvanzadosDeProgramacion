package com.ites.proyectotemplate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "direcciones" )
public class Direccion {

    private int id_direccion;
    private String calle;
    private String colonia;
    private int cp;
    private String municipio;
    private String estado;

    public Direccion() {

    }

    public Direccion(String calle, String colonia, int cp, String municipio, String estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipio;
        this.estado = estado;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %s, %s",
                calle, colonia, cp, municipio, estado);
    }
}
