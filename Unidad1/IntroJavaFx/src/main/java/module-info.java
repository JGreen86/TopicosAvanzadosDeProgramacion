module com.example.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejemplojavafx to javafx.fxml;
    exports com.example.ejemplojavafx;
}