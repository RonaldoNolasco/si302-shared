package pe.edu.uni.fiis.payFast.dao;

import pe.edu.uni.fiis.payFast.dao.usuario.UsuarioDao;
import pe.edu.uni.fiis.payFast.dao.usuario.UsuarioDaoImpl;
import pe.edu.uni.fiis.payFast.model.Usuario;

public abstract class SingletonUsuarioDao {
    private static UsuarioDao usuarioDao = null;
    public static UsuarioDao getUsuarioDao(){
        if(usuarioDao == null){
            usuarioDao = new UsuarioDaoImpl();
        }
        return usuarioDao;
    }
}
