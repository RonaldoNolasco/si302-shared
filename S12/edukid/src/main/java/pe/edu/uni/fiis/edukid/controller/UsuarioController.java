package pe.edu.uni.fiis.edukid.controller;

import pe.edu.uni.fiis.edukid.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukid.model.Usuario;
import pe.edu.uni.fiis.edukid.service.SingletonService;
import pe.edu.uni.fiis.edukid.service.usuario.UsuarioService;
import pe.edu.uni.fiis.edukid.service.usuario.impl.UsuarioServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsuarioController",urlPatterns = {"/registro"})
public class UsuarioController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre=req.getParameter("nom");
        String codigo=req.getParameter("cod");
        String correo=req.getParameter("cor");
        String credencial=req.getParameter("cred");
        Usuario usuario1= new Usuario(nombre,codigo,correo,credencial);
        SingletonService.getUsuarioService().agregarUsuario(usuario1);
        resp.getWriter().write("Se guardo el usuario correctamente");
    }
}