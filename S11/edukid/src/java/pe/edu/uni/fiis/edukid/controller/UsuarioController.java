package pe.edu.uni.fiis.edukid.controller;

import pe.edu.uni.fiis.edukid.model.Usuario;
import pe.edu.uni.fiis.edukid.service.SingletonService;

public class UsuarioController {
    public static void main(String[] args) {
        Usuario usur1=new Usuario("xd","Ronaldo","123","gaaaa");
        SingletonService.getUsuarioService().agregarUsuario(usur1);
    }
}