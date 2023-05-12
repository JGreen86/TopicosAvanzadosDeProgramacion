module com.ites.proyectotemplate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.ites.proyectotemplate to javafx.fxml;
    exports com.ites.proyectotemplate;
    exports com.ites.proyectotemplate.controllers;
    exports com.ites.proyectotemplate.models;
    opens com.ites.proyectotemplate.controllers to javafx.fxml;
    opens com.ites.proyectotemplate.models to javafx.fxml, org.hibernate.orm.core;
}