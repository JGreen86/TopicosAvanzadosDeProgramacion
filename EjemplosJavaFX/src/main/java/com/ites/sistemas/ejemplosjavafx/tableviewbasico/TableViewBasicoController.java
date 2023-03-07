package com.ites.sistemas.ejemplosjavafx.tableviewbasico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewBasicoController implements Initializable {

    @FXML
    private Button btnBorrarFila;
    @FXML
    private TableView<Usuario> tblUsuarios;
    @FXML
    private TableColumn<Usuario, String> tblColumnNombre;
    @FXML
    private TableColumn<Usuario, String> tblColumnApellidoP;
    @FXML
    private TableColumn<Usuario, String> tblColumnApellidoM;

    public void onBtnBorrarFila(ActionEvent actionEvent) {
        int fila = tblUsuarios.getSelectionModel().getSelectedIndex();
        tblUsuarios.getItems().remove(fila);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tblColumnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblColumnApellidoP.setCellValueFactory(new PropertyValueFactory<>("apellidoP"));
        tblColumnApellidoM.setCellValueFactory(new PropertyValueFactory<>("apellidoM"));

        tblUsuarios.getItems().add(new Usuario("Homero","J.","Simpson"));
        tblUsuarios.getItems().add(new Usuario("Bart","Simpson","Lopez"));
        tblUsuarios.getItems().add(new Usuario("Lisa","Simpson","Lopez"));
    }
}
