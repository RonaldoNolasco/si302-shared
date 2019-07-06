package pe.edu.uni.fiis.edukids.dto;

import pe.edu.uni.fiis.edukids.model.Libro;

import java.util.List;

public class BusquedaResponse {
    private List<Libro> libros;

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
