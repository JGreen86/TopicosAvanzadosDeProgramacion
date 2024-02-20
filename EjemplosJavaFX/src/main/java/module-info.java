module com.ites.sistemas.ejemplosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.ites.sistemas.milibreria;

    opens com.ites.sistemas.ejemplosjavafx to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx;
    opens com.ites.sistemas.ejemplosjavafx.formulariobasico to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.formulariobasico;
    opens com.ites.sistemas.ejemplosjavafx.tableviewbasico to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.tableviewbasico;
    opens com.ites.sistemas.ejemplosjavafx.scenedesdecodigo to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.scenedesdecodigo;
    opens com.ites.sistemas.ejemplosjavafx.componentepersonalizado to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.componentepersonalizado;
    opens com.ites.sistemas.ejemplosjavafx.styleview to javafx.fxml;
    exports com.ites.sistemas.ejemplosjavafx.styleview;
}