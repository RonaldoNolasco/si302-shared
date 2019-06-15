package pe.edu.uni.fiis.payFast.dao.usuario;

import pe.edu.uni.fiis.payFast.dao.usuario.UsuarioDao;
import pe.edu.uni.fiis.payFast.model.Usuario;
import pe.edu.uni.fiis.payFast.service.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao {

    public Usuario agregarUsuario(Usuario a, Connection b) {

        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into usuario (nombres,id_usuario,contra,sexo,region,provincia,distrito,correo,num_tarjeta,telefono)")
                    .append("values (?,?,?,?,?,?,?,?,?,?)");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getNombres());
            sentencia.setString(2,a.getIdUsuario());
            sentencia.setString(3,a.getContra());
            sentencia.setString(4,a.getSexo());
            sentencia.setString(5,a.getRegion());
            sentencia.setString(6,a.getProvincia());
            sentencia.setString(7,a.getDistrito());
            sentencia.setString(8,a.getCorreo());
            sentencia.setString(9,a.getNumTarjeta());
            sentencia.setString(10,a.getTelefono());

            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public Usuario iniciarSesion(Usuario a, Connection b) {

        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select count(*) from usuario(id_usuario,contra)")
            .append("where id_usuario = ? and contra = ?");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setString(1,a.getIdUsuario());
            sentencia.setString(2,a.getContra());
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
