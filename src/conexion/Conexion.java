
package conexion;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {
        
        try {
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/videojuegos", "root", "");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return (null);
    }
    
     
    public static void main (String [] args){
        conectar();
    }
}
