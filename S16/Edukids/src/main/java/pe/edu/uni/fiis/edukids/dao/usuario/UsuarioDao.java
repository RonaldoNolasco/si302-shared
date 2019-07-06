package pe.edu.uni.fiis.edukids.dao.usuario;


import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.model.UsuarioF;

import java.sql.Connection;
import java.util.List;

public interface UsuarioDao {
    public Usuario agregarUsuario(Usuario a, Connection b);
    public UsuarioF agregarUsuarioF(UsuarioF a, Connection b);
    public List<UsuarioF> obtenerUsuariosF(Connection b);
}
