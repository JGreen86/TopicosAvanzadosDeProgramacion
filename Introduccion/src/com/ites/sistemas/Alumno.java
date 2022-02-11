package com.ites.sistemas;

public class Alumno {
    private final String noControl;
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Alumno(String noControl) {
        this.noControl = noControl;
    }
    public Alumno(String noControl, String nombre, String apellidoP, String apellidoM){
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }
    // setters - metodos para asignar valor a los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    // getters - metodos para recuperar el valor de los atributos
    public String getNoControl() {
        return noControl;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
}