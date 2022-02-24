package com.example.ejemplojavafx.controllers;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class EditarUsuarioController implements Initializable {
    @FXML
    private TextField txt_nombre;
    @FXML
    private TextField txt_apellidoP;
    @FXML
    private TextField txt_apellidoM;
    @FXML
    private TextField txt_edad;
    @FXML
    private TextField txt_email;
    @FXML
    private Button btn_cancelar;
    @FXML
    private Button btn_guardar;
    @FXML
    private ComboBox<String> cmb_pais;

    public void onGuardarButtonClick(ActionEvent actionEvent) {
        String nombre = txt_nombre.getText();
        String apellidoP = txt_apellidoP.getText();
        String apellidoM = txt_apellidoM.getText();
        String email = txt_email.getText();
        int edad = Integer.parseInt(txt_edad.getText());
        String pais = cmb_pais.getValue();
        System.out.println(pais);
    }
    public void onCancelarButtonClick(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Cancelar confirmacion");
        alerta.setHeaderText("Deseas cerrar el programa?");
        alerta.setContentText("Guarde sus datos antes de salir,\n" +
                "de lo contrario se perderan");
        Optional<ButtonType> respuesta = alerta.showAndWait();
        if(respuesta.isPresent() && respuesta.get() == ButtonType.OK) {
            // salir del programa
            Button boton = (Button) actionEvent.getSource();
            Scene escena = boton.getScene();
            Stage stage = (Stage) escena.getWindow(); // casting
            stage.close();
        } else {
            // click en cancelar, hacemos otra cosa
            System.out.println("Cancelando ...");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmb_pais.setPromptText("Seleccione un pais");
        ObservableList<String> listaDePaises = cmb_pais.getItems();
        listaDePaises.add("Mexico");
        listaDePaises.add("Brasil");
        listaDePaises.add("Italia");
    }
}