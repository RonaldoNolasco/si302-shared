package pe.edu.uni.fiis.edukids.dao;

import pe.edu.uni.fiis.edukids.dao.libro.LibroDao;
import pe.edu.uni.fiis.edukids.dao.libro.LibroDaoImpl;
import pe.edu.uni.fiis.edukids.dao.usuario.UsuarioDao;
import pe.edu.uni.fiis.edukids.dao.usuario.UsuarioDaoImpl;

public abstract class SingletonUsuarioDao {
    private static LibroDao libroDao = null;
    public static LibroDao getLibroDao(){
        if(libroDao == null){
            libroDao = new LibroDaoImpl();
        }
        return libroDao;
    }
}