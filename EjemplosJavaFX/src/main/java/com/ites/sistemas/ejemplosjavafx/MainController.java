package com.ites.sistemas.ejemplosjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;
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

    public void onMenuItemTableViewClick(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Table view básico");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void onMenuItemCPClick(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/componente-personalizado-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Componente personalizado");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        /*Stage stage = new Stage();
        stage.setTitle("Mi escena");
        stage.setResizable(false);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(0);
        grid.setVgap(20);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setStyle("-fx-background-color:white;-fx-border-radius:10 10 10 10;-fx-border-color:red;");

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(20);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(80);
        grid.getColumnConstraints().addAll(column1, column2);


        Label nombre = new Label("Nombre:");
        nombre.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        grid.add(nombre, 0, 0);

        TextField txtNombre = new TextField();
        grid.add(txtNombre, 1, 0);

        Label correo = new Label("Correo:");
        correo.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        grid.add(correo, 0, 1);

        TextField txtCorreo = new TextField();
        grid.add(txtCorreo, 1, 1);

        Button button = new Button("Iniciar");
        button.setStyle("-fx-font-weight:bold;-fx-font-size:16px;");
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(button);
        button.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(button, Priority.ALWAYS);
        grid.add(hBox, 1, 3);

        Scene scene = new Scene(grid,480,240);
        stage.setScene(scene);
        stage.show();*/
    }

    public void onMenuItemStyleClick(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/style-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Style view");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.showAndWait();
    }
}