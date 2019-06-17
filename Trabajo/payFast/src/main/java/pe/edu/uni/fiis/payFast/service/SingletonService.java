package pe.edu.uni.fiis.payFast.service;

import pe.edu.uni.fiis.payFast.service.usuario.impl.UsuarioServiceImpl;

public class SingletonService {
    private static UsuarioServiceImpl usuarioService = null;

    public static UsuarioServiceImpl getUsuarioService() {
        if (usuarioService == null) {
            usuarioService =  new UsuarioServiceImpl();
        }
        return  usuarioService;
    }
}
