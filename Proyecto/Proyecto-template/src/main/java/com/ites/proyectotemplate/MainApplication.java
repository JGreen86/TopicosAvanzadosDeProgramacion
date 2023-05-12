package com.ites.proyectotemplate;

import com.ites.proyectotemplate.models.Usuario;
import com.ites.proyectotemplate.services.UsuarioService;
import com.ites.proyectotemplate.utils.HibernateUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Ejemplo Hibernate");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();

        usuarioService.addUser(new Usuario("Homero","2","",48));
        usuarioService.addUser(new Usuario("Lisa","2","",48));
        usuarioService.addUser(new Usuario("Bart","2","",48));

        List<Usuario> result = usuarioService.getAllUsers();
        for ( Usuario usuario : result ) {
            System.out.println(usuario.getNombre());
        }

        HibernateUtils.closeEntityManagerFactory();

        //launch();
    }
}