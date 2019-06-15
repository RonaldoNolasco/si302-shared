package pe.edu.uni.fiis.edukid.dao.usuario;

import pe.edu.uni.fiis.edukid.service.JDBC;
import pe.edu.uni.fiis.edukid.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao{
    public Usuario agregarUsuario(Usuario a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuario(nombre,codigo,correo,credencial) values (?,?,?,?)");
            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getNombre());
            sentencia.setString(2,a.getCodigo());
            sentencia.setString(3,a.getCorreo());
            sentencia.setString(4,a.getCredencial());
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        Connection c = JDBC.getConnection();
        try {
            System.out.println(c.isValid(5000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UsuarioDaoImpl usuariodao = new UsuarioDaoImpl();
        Usuario usuario = new Usuario("20180125F","Ronaldo","rofanoch1234","rnolascoc@uni.pe");
        usuariodao.agregarUsuario(usuario,c);
        try {
            c.commit();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}