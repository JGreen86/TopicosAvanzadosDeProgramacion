package com.example.ejemplojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    @FXML
    private MenuBar menuBar;

    public void onClickMenuArchivoCerrar(ActionEvent actionEvent) {
        Scene escena = menuBar.getScene();
        Stage stage = (Stage) escena.getWindow();
        stage.close();
    }
    public void onClickMenuEditarUsuario(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Editar usuario");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Error inesperado.");
            alerta.show();
        }
    }
}
