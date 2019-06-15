package pe.edu.uni.fiis.payFast.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexion {
    public static Connection getConnection(){
        Connection conex = null;
        try {
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
            conex.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conex;
    }
}
