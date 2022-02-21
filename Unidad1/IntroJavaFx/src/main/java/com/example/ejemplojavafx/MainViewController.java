package com.example.ejemplojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    @FXML
    private MenuBar menuBar;

    public void onClickMenuArchivoCerrar(ActionEvent actionEvent) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        stage.close();
    }
    public void onClickMenuEditarUsuario(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene escena = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Editar usuario");
            stage.setScene(escena);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error al construir la escena.");
        }
    }
}