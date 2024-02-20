package com.ites.sistemas.intro_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Optional;

public class HelloController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoP;
    @FXML
    private TextField txtApellidoM;
    @FXML
    private TextField txtDomicilio;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtCarrera;

    public void onBtnAceptarClick(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        String apellidoP = txtApellidoP.getText();
        String apellidoM = txtApellidoM.getText();
        String domicilio = txtDomicilio.getText();
        String carrera = txtCarrera.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String datosDelAlumno = nombre + " " + apellidoP + " " + apellidoM
                + ", domicilio: " + domicilio + ", edad: " + edad + " años"
                + ", carrera: " + carrera;
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Informacion");
        alerta.setHeaderText("Datos ingresados:");
        alerta.setContentText(datosDelAlumno);
        alerta.show();
    }

    public void onBtnCancelarClick(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmación");
        alerta.setHeaderText("¿Desea descartar los cambios y salir?");
        alerta.setContentText("Los cambios se perderán si continua.");
        Optional<ButtonType> respuesta = alerta.showAndWait();
        if(respuesta.isPresent() && respuesta.get() == ButtonType.OK) {
            // usuario dio click en OK
            Button btnCancelar = (Button) actionEvent.getSource();
            Scene escena = btnCancelar.getScene();
            Stage stage = (Stage) escena.getWindow();
            stage.close();
        } else {
            // usuario dio click en cancelar
            System.out.println("Click en Cancelar");
        }
    }
}