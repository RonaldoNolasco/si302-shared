package pe.edu.uni.fiis.edukids.service.usuario.impl;


import pe.edu.uni.fiis.edukids.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukids.model.Libro;
import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.model.UsuarioF;
import pe.edu.uni.fiis.edukids.service.Conexion;
import pe.edu.uni.fiis.edukids.service.usuario.UsuarioService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    public List<Libro> getLibros(Integer coGenero, String titulo) {
        Connection connection= Conexion.getConnection();
        List<Libro>  lista = SingletonUsuarioDao.getLibroDao().getLibros(coGenero,titulo,connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

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

    public UsuarioF agregarUsuarioF(UsuarioF a) {
        Connection connection= Conexion.getConnection();
        UsuarioF usur =SingletonUsuarioDao.getUsuarioDao().agregarUsuarioF(a,connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usur;
    }

    public List<UsuarioF> obtenerUsuariosF() {
        Connection connection= Conexion.getConnection();
        List<UsuarioF> lista = SingletonUsuarioDao.getUsuarioDao().obtenerUsuariosF(connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
