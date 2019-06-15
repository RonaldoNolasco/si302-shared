package pe.edu.uni.fiis.edukid.service;

import pe.edu.uni.fiis.edukid.service.usuario.ClienteService;
import pe.edu.uni.fiis.edukid.service.usuario.ClienteServiceImpl;

public class SingletonService {
    private static ClienteService clienteService = null;

    public static ClienteService getClienteService() {
        if (clienteService == null) {
            clienteService = new ClienteServiceImpl();
        }
        return clienteService;
    }
}
