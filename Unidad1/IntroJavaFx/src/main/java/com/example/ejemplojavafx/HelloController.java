package com.example.ejemplojavafx;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
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
    }
    public void onCancelarButtonClick(ActionEvent actionEvent) {
        Button boton = (Button) actionEvent.getSource();
        Scene escena = boton.getScene();
        Stage stage = (Stage) escena.getWindow(); // casting
        stage.close();
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