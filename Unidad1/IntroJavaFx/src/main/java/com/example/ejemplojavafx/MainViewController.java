package com.example.ejemplojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private MenuBar menuBar;
    @FXML
    private TableView<Usuario> tableView;
    @FXML
    private TableColumn<Usuario, String> tbl_col_nombre;
    @FXML
    private TableColumn<Usuario, String> tbl_col_apellidoP;
    @FXML
    private TableColumn<Usuario, String> tbl_col_apellidoM;

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
    public void onClickBorrarSeleccion(ActionEvent actionEvent) {
        int noFila = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(noFila);
    }
    public void onEditColumnaNombre(TableColumn.CellEditEvent<Usuario, String> evento) {
        String nuevoNombre = evento.getNewValue();
        int noFila = evento.getTablePosition().getRow();
        tableView.getItems().get(noFila).setNombre(nuevoNombre);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tbl_col_nombre.setCellFactory(TextFieldTableCell.forTableColumn());

        tbl_col_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tbl_col_apellidoP.setCellValueFactory(new PropertyValueFactory<>("apellidoP"));
        tbl_col_apellidoM.setCellValueFactory(new PropertyValueFactory<>("apellidoM"));
        tableView.getItems().add(
                new Usuario(
                        "Homero",
                        "J.",
                        "Simpson",
                        "homero@simpson.com",
                        "Ingenieria en sistemas computaciones",
                        47
                )
        );
        tableView.getItems().add(
                new Usuario(
                        "Ned",
                        "Flanders",
                        "Garcia",
                        "ned@flanders.com",
                        "Gastronomia",
                        48
                )
        );
    }
}
