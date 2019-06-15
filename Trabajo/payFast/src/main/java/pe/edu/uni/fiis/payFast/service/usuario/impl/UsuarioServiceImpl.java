package pe.edu.uni.fiis.payFast.service.usuario.impl;

import pe.edu.uni.fiis.payFast.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.payFast.model.Usuario;
import pe.edu.uni.fiis.payFast.service.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioServiceImpl {
    public Usuario agregarUsuario(Usuario usuario) {
        Connection connection= Conexion.getConnection();
        Usuario usur = SingletonUsuarioDao.getUsuarioDao().agregarUsuario(usuario,connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usur;
    }
}