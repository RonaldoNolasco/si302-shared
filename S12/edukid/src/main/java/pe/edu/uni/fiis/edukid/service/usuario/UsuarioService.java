package pe.edu.uni.fiis.edukid.service.usuario;

import pe.edu.uni.fiis.edukid.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukid.model.Usuario;

public interface UsuarioService {
    public Usuario agregarUsuario(Usuario usuario);
}