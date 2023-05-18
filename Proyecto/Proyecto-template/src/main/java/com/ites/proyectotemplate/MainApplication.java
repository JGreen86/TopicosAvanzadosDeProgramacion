package com.ites.proyectotemplate;

import com.ites.proyectotemplate.models.Direccion;
import com.ites.proyectotemplate.models.Usuario;
import com.ites.proyectotemplate.services.DireccionService;
import com.ites.proyectotemplate.services.UsuarioService;
import com.ites.proyectotemplate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
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
        DireccionService direccionService = new DireccionService();

        Direccion direccion = new Direccion("Calle 1","Colonia 1",23400,"Los Cabos","BCS");
        Direccion direccion2 = new Direccion("Calle 2","Colonia 2",23400,"Los Cabos","BCS");
        direccionService.addDireccion(direccion);
        direccionService.addDireccion(direccion2);

        Usuario homero = new Usuario("Homero","J.","Simpson",48);
        homero.setDireccion(direccion);
        usuarioService.addUser(homero);

        Usuario lisa = new Usuario("Lisa","Simpson","Lopez",10);
        lisa.setDireccion(direccion2);
        usuarioService.addUser(lisa);
        //usuarioService.addUser(new Usuario("Bart","Simpson","Lopez",11));

        List<Usuario> result = usuarioService.getAllUsers();
        for ( Usuario usuario : result ) {
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getDireccion().toString());
        }

        System.out.println("=========================");
        Usuario lisa2 = usuarioService.getUserByID(2);
        System.out.println(lisa2.getNombre());
        System.out.println(lisa2.getDireccion().toString());
        /*lisa.setEdad(11);
        usuarioService.updateUser(lisa);
        usuarioService.removeUser(lisa);*/


        HibernateUtils.closeEntityManagerFactory();

        //launch();
    }
}