package com.example.ejemplojavafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
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

    public void onGuardarButtonClick(ActionEvent actionEvent) {
        String nombre = txt_nombre.getText();
        String apellidoP = txt_apellidoP.getText();
        String apellidoM = txt_apellidoM.getText();
        String email = txt_email.getText();
        int edad = Integer.parseInt(txt_edad.getText());
    }
}