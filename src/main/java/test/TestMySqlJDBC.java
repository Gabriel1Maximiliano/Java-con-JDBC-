
package test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestMySqlJDBC {
    public static void main(String[] args)  {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try{
        var conexion = DriverManager.getConnection(url, "root", "admin");
        Statement instruccion = conexion.createStatement();
        var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
        ResultSet resultado = instruccion.executeQuery(sql);
        while(resultado.next()){
            System.out.println("id_persona " + resultado.getInt("id_persona"));
            System.out.println("Nombre = " + resultado.getString("nombre"));
            System.out.println("Apellido = " + resultado.getString("apellido"));
            System.out.println("Email = " + resultado.getString("email"));
            System.out.println("Telefono = " + resultado.getString("telefono"));
            System.out.println("");
        }
        }catch (SQLException ex){
                ex.printStackTrace(System.out);
                }
    }
}
