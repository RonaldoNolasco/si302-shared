package pe.edu.uni.fiis.payFast.dao.usuario;

import pe.edu.uni.fiis.payFast.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao {
    public Usuario agregarUsuario(Usuario a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuario (nombre,usuario,credencial,sexo,tarjeta,region,provincia,distrito,correo,telefono) values (?,?,?,?,?,?,?,?,?,?);");
            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getNombre());
            sentencia.setString(2,a.getUsuario());
            sentencia.setString(3,a.getCredencial());
            sentencia.setString(4,a.getSexo());
            sentencia.setString(5,a.getTarjeta());
            sentencia.setString(6,a.getRegion());
            sentencia.setString(7,a.getProvincia());
            sentencia.setString(8,a.getDistrito());
            sentencia.setString(9,a.getCorreo());
            sentencia.setString(10,a.getTelefono());
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    /*public Usuario iniciarSesion(Usuario a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select count(*) from usuario(id_usuario,contra)")
            .append("where id_usuario = ? and contra = ?");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getUsuario());
            sentencia.setString(2,a.getCredencial());
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }*/

}