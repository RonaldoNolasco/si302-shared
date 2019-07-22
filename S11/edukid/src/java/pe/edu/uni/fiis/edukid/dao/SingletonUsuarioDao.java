package pe.edu.uni.fiis.edukid.dao;

import pe.edu.uni.fiis.edukid.dao.dao.usuario.UsuarioDao;
import pe.edu.uni.fiis.edukid.dao.dao.usuario.UsuarioDaoImpl;

public abstract class SingletonUsuarioDao {
    private static UsuarioDao usuarioDao = null;
    public static UsuarioDao getUsuarioDao(){
        if(usuarioDao == null) {
            usuarioDao = new UsuarioDaoImpl();
        }
        return usuarioDao;
    }
}