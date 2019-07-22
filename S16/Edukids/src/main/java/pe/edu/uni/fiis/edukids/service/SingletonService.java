package pe.edu.uni.fiis.edukids.service;


import pe.edu.uni.fiis.edukids.service.usuario.UsuarioService;
import pe.edu.uni.fiis.edukids.service.usuario.UsuarioServiceImpl;

public class SingletonService {
    private static UsuarioService usuarioService = null;

    public static UsuarioService getUsuarioService() {
        if (usuarioService == null) {
            usuarioService = new UsuarioServiceImpl();
        }
        return usuarioService;
    }
}
