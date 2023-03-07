package com.ites.sistemas.ejemplosjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private MenuBar menuBarMain;

    public void onMenuItemFrmBasicoClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) menuBarMain.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/formulario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Formulario básico");
        stage.setScene(scene);
    }
}