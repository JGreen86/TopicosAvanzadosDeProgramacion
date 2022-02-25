module com.example.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejemplojavafx to javafx.fxml;
    exports com.example.ejemplojavafx;
    exports com.example.ejemplojavafx.models;
    opens com.example.ejemplojavafx.models to javafx.fxml;
    exports com.example.ejemplojavafx.controllers;
    opens com.example.ejemplojavafx.controllers to javafx.fxml;
}