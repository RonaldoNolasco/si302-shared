package pe.edu.uni.fiis.edukid.dao.usuario;

import pe.edu.uni.fiis.edukid.model.Cliente;

import java.sql.Connection;

public interface ClienteDao {
    public Cliente agregarUsuario(Cliente a, Connection b);
    public void mostrarDatos(Connection b);
}