package com.ites.sistemas;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/";
        String bd = "bd_usuarios";
        String usuario = "root";
        String password = "password";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection(
                    url+bd, usuario, password);
            System.out.println("Conexion exitosa");

            Statement statement = connection.createStatement();
            // Insertar
            statement.executeUpdate("INSERT INTO usuarios (`noControl`, `nombre`, `apellidoP`, `apellidoM`, `edad`, `direcciones_id_direccion`) VALUES ('A1234567', 'Homero', 'J.', 'Simpson', '45', '1')");

            // Consultar
            ResultSet resultados = statement.executeQuery(
                    "SELECT * FROM usuarios");

            while (resultados.next()) {
                String noControl = resultados.getString("noControl");
                String nombre = resultados.getString("nombre");
                String apellidoP = resultados.getString("apellidoP");
                String apellidoM = resultados.getString("apellidoM");
                int edad = resultados.getInt("edad");
                System.out.println(noControl + ", " + nombre + ", " + apellidoP + ", "
                        + apellidoM + ", " + edad);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}