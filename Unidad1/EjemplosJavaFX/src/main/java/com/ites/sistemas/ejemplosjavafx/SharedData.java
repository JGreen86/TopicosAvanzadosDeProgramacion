package com.ites.sistemas.ejemplosjavafx;

import com.ites.sistemas.ejemplosjavafx.modelos.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SharedData {

    private static SharedData sharedData = null;
    private ObservableList<Usuario> usuarios;

    private SharedData() {
        usuarios = FXCollections.observableArrayList();
    }

    public static SharedData getInstance() {
        if (sharedData == null)
            sharedData = new SharedData();
        return sharedData;
    }

    public ObservableList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ObservableList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
