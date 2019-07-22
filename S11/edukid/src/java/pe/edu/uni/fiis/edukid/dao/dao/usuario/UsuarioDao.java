package pe.edu.uni.fiis.edukid.dao.dao.usuario;

import pe.edu.uni.fiis.edukid.model.Usuario;

import java.sql.Connection;

public interface UsuarioDao {
    public Usuario agregarUsuario(Usuario a, Connection b);
}
