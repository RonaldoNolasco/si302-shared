package pe.edu.uni.fiis.edukid.service.usuario;

import pe.edu.uni.fiis.edukid.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukid.model.Cliente;
import pe.edu.uni.fiis.edukid.service.JDBC;

import java.sql.Connection;
import java.sql.SQLException;

public class ClienteServiceImpl implements ClienteService {
    public Cliente agregarUsuario(Cliente cliente) {
        Connection connection= JDBC.getConnection();
        Cliente usur =SingletonUsuarioDao.getClienteDao().agregarUsuario(cliente,connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usur;
    }

    public void mostrarDatos(Cliente cliente){
        Connection connection= JDBC.getConnection();
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}