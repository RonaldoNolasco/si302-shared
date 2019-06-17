package pe.edu.uni.fiis.edukid.service.usuario;

import pe.edu.uni.fiis.edukid.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukid.model.Usuario;
import pe.edu.uni.fiis.edukid.model.UsuarioF;

import java.util.List;

public interface UsuarioService {
    public Usuario agregarUsuario(Usuario usuario);
    public UsuarioF agregarUsuarioF(UsuarioF a);
    public List<UsuarioF> obtenerUsuariosF();
}
