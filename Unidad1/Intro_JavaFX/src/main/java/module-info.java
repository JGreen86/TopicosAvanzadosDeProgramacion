module com.ites.sistemas.intro_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.ites.sistemas.intro_javafx to javafx.fxml;
    exports com.ites.sistemas.intro_javafx;
}