package pe.edu.uni.fiis.payFast.dao.usuario;

import pe.edu.uni.fiis.payFast.model.Usuario;

import java.sql.Connection;

public interface UsuarioDao {
    public Usuario agregarUsuario(Usuario a, Connection b);
    public Usuario iniciarSesion(Usuario a, Connection b);
}
