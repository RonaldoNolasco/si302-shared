package pe.edu.uni.fiis.edukids.dao.libro;

import pe.edu.uni.fiis.edukids.model.Libro;

import java.sql.Connection;
import java.util.List;

public interface LibroDao {
    public abstract List<Libro> getLibros(Integer coGenero,String titulo, Connection connection);
}