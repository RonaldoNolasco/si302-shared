package pe.edu.uni.fiis.edukids.service.usuario;


import pe.edu.uni.fiis.edukids.model.Libro;
import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.model.UsuarioF;

import java.util.List;

public interface UsuarioService {
    public List<Libro> getLibros(Integer coGenero, String titulo);
}
