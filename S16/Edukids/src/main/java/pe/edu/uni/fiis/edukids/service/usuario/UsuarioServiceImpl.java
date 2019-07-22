package pe.edu.uni.fiis.edukids.service.usuario;


import pe.edu.uni.fiis.edukids.dao.SingletonDao;
import pe.edu.uni.fiis.edukids.model.Libro;
import pe.edu.uni.fiis.edukids.service.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
    public List<Libro> getLibros(Integer coGenero, String titulo) {
        Connection connection = Conexion.getConnection();
        List<Libro> lista = SingletonDao.getLibroDao().getLibros(coGenero, titulo, connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}