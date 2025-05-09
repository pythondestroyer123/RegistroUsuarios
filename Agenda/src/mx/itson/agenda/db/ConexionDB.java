/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.agenda.db;
import java.sql.Connection;

/**
 *
 * @author emili
 */
public class ConexionDB {
    private static final String URL = "";
    private static final String USER = "root";
    private static final String PASSWORD = "guaymas";
    
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConecction(URL, USER, PASSWORD);
            if (connection !+ null) {
                System.out.println("Conexion exitosa");
        }
            catch(Exception e) {
                    System.out.println("Error en conexion " + e.toString());
        }
        }
    }
}
