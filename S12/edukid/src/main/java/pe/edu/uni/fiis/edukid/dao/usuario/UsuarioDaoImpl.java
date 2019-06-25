package pe.edu.uni.fiis.edukid.dao.usuario;

import pe.edu.uni.fiis.edukid.service.Conexion;
import pe.edu.uni.fiis.edukid.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao{
/*
create table usuario(
  codigo_usuario varchar(9) primary key,
  nombre varchar(100),
  credencial varchar(15),
  correo varchar(50)
);
 */
    public Usuario agregarUsuario(Usuario a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuario(codigo_usuario,nombre,credencial,correo) values (")
                    .append("?,?,?,?)");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getCodigo());
            sentencia.setString(2,a.getNombre());
            sentencia.setString(3,a.getCredencial());
            sentencia.setString(4,a.getCorreo());

            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        //Conexion con = new Conexion();
        Connection c = Conexion.getConnection();
        try {
            System.out.println(c.isValid(5000));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UsuarioDaoImpl usuariodao = new UsuarioDaoImpl();
        Usuario usuario = new Usuario("20120125F","Juan","456","rnolascoc@uni.pe");
        usuariodao.agregarUsuario(usuario,c);
        try {
            //c.commit();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}