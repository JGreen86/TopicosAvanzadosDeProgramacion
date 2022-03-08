package com.example.ejemplojavafx;

import javafx.scene.chart.PieChart;

public class DataController {

    private static DataController dataController = null;

    private DataController() {

    }
    public static DataController getInstance() {
        if(dataController == null) {
            dataController = new DataController();
        }
        return dataController;
    }
    public void AgregarUsuario() {

    }
}
