module com.ites.sistemas.ejemplosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ites.sistemas.ejemplosjavafx to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx;
    exports com.ites.sistemas.ejemplosjavafx.modelos;
    opens com.ites.sistemas.ejemplosjavafx.modelos to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.controladores;
    opens com.ites.sistemas.ejemplosjavafx.controladores to javafx.fxml;
}