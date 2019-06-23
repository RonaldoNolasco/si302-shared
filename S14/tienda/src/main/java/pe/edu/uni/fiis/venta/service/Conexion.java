package pe.edu.uni.fiis.venta.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexion {
    public static Connection getConnection(){
        Connection conex = null;
        try {
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection("jdbc:postgresql://localhost:5432/venta","postgres","123");
            conex.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conex;
    }
   /* public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection c = con.getConnection();
        try {
            System.out.println(c.isValid(5000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}