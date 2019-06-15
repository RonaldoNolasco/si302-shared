package pe.edu.uni.fiis.edukid.service.usuario;

import pe.edu.uni.fiis.edukid.model.Cliente;

public interface ClienteService {
    public Cliente agregarUsuario(Cliente cliente);
    public void mostrarDatos(Cliente cliente);
}