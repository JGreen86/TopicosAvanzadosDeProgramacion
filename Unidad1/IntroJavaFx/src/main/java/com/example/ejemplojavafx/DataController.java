package com.example.ejemplojavafx;

import com.example.ejemplojavafx.models.Usuario;

import java.util.HashMap;

public class DataController {

    private static DataController dataController = null;
    private String nombre = "";
    private HashMap<String, Usuario> hashMap;

    private DataController() {
        hashMap = new HashMap<>();
    }
    public static DataController getInstance() {
        if(dataController == null) {
            dataController = new DataController();
        }
        return dataController;
    }
    public void agregarUsuario(String noControl, Usuario usuario) {
        hashMap.put(noControl, usuario);
    }
    public Usuario consultarUsuario(String noControl) {
        return hashMap.get(noControl);
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
