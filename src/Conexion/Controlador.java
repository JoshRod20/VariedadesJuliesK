package Conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Controlador {
    private final String url="jdbc:sqlserver://localhost:1434;databaseName=VariedadesJuliesk_BD;"
            + "integratedSecurity=true;" 
            + "encrypt=true;trustServerCertificate=true;";
            
             Connection cn;
    public Connection conectar(){      
        try {
            cn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión: "+e);
        }

        return null;
    }  
}
