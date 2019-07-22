package pe.edu.uni.fiis.edukids.dao.libro;
import pe.edu.uni.fiis.edukids.model.Autor;
import pe.edu.uni.fiis.edukids.model.Genero;
import pe.edu.uni.fiis.edukids.model.Libro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibroDaoImpl implements LibroDao {
    public List<Libro> getLibros(Integer coGenero, String titulo, Connection b) {
        List<Libro> lista = new ArrayList<Libro>();
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select isbn,titulo,cod_autor,cod_genero from libro");
            Statement sentencia = b.createStatement();
            ResultSet rs = sentencia.executeQuery(sql.toString());
            while (rs.next()){
                Libro u = new Libro();
                u.setIsbn(rs.getInt("isbn"));
                u.setTitulo(rs.getString("titulo"));
                u.setAutor(new Autor());
                u.getAutor().setCoAutor(rs.getInt("cod_autor"));
                u.setGenero(new Genero());
                u.getGenero().setCoGenero(rs.getInt("cod_genero"));
                lista.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
