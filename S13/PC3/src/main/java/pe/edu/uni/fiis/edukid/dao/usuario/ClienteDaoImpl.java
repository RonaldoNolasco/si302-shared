package pe.edu.uni.fiis.edukid.dao.usuario;

import pe.edu.uni.fiis.edukid.service.JDBC;
import pe.edu.uni.fiis.edukid.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDaoImpl implements ClienteDao {
    public Cliente agregarUsuario(Cliente a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into cliente(nombre,apellido,nacimiento,genero,profesion) values (?,?,?,?,?);");
            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getNombre());
            sentencia.setString(2,a.getApellido());
            sentencia.setString(3,a.getNacimiento());
            sentencia.setString(4,a.getGenero());
            sentencia.setString(5,a.getProfesion());
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public void mostrarDatos(Connection b){
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select * from cliente;");
            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.execute();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection c = JDBC.getConnection();
        try {
            System.out.println(c.isValid(5000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ClienteDaoImpl usuariodao = new ClienteDaoImpl();
        Cliente cliente = new Cliente("Ronaldo","Nolasco","06/12/2000","Masculino","Ingenieria de sistemas");
        usuariodao.agregarUsuario(cliente,c);
        try {
            c.commit();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}