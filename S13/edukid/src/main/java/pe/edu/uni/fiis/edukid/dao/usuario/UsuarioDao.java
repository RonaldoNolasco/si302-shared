package pe.edu.uni.fiis.edukid.dao.usuario;

import pe.edu.uni.fiis.edukid.model.Usuario;
import pe.edu.uni.fiis.edukid.model.UsuarioF;

import java.sql.Connection;
import java.util.List;

public interface UsuarioDao {
    public Usuario agregarUsuario(Usuario a, Connection b);
    public UsuarioF agregarUsuarioF(UsuarioF a, Connection b);
    public List<UsuarioF> obtenerUsuariosF(Connection b);
}
