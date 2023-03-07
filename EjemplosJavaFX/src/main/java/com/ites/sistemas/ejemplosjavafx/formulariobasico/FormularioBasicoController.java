package com.ites.sistemas.ejemplosjavafx.formulariobasico;

import com.ites.sistemas.ejemplosjavafx.MainApplication;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FormularioBasicoController implements Initializable {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoP;
    @FXML
    private TextField txtApellidoM;
    @FXML
    private TextField txtEdad;
    @FXML
    private ComboBox<String> cmbCarreras;

    @FXML
    private void onBtnAceptarClick(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        String apellidoP = txtApellidoP.getText();
        String apellidoM = txtApellidoM.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String carrera = cmbCarreras.getValue();

        String mensaje = nombre + " " + apellidoP + " " + apellidoM + ", " + edad + " años, " + carrera;

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmacion de registro");
        alerta.setHeaderText("¿Desea registrar el siguiente usuario?");
        alerta.setContentText(mensaje);
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.isPresent() && resultado.get().equals(ButtonType.OK)) {
            Alert alerta2 = new Alert(Alert.AlertType.INFORMATION);
            alerta2.setTitle("Registro exitoso");
            alerta2.setHeaderText("Usuario registrado con éxito!!!");
            alerta2.setContentText(mensaje);
            alerta2.show();
        } else {
            System.out.println("El usuario dió click en cancelar");
        }
    }

    @FXML
    private void onBtnCancelarClick(ActionEvent actionEvent) throws IOException {
        Scene scene = ((Button) actionEvent.getSource()).getScene();
           Stage stage = (Stage) scene.getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/main-view.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());
        stage.setTitle("Tópicos avanzados de programación");
        stage.setScene(mainScene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listaDeElementos = cmbCarreras.getItems();
        listaDeElementos.add("Ing. en Sistemas Computacionales");
        listaDeElementos.add("Turismo");
        listaDeElementos.add("Gastronomía");
    }
}
