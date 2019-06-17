package pe.edu.uni.fiis.edukid.dao;

import pe.edu.uni.fiis.edukid.dao.usuario.ClienteDao;
import pe.edu.uni.fiis.edukid.dao.usuario.ClienteDaoImpl;

public abstract class SingletonUsuarioDao {
    private static ClienteDao clienteDao = null;
    public static ClienteDao getClienteDao(){
        if(clienteDao == null){
            clienteDao = new ClienteDaoImpl();
        }
        return clienteDao;
    }
}