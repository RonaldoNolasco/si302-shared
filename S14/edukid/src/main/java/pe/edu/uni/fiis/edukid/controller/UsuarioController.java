package pe.edu.uni.fiis.edukid.controller;

import pe.edu.uni.fiis.edukid.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.edukid.model.Usuario;
import pe.edu.uni.fiis.edukid.service.SingletonService;
import pe.edu.uni.fiis.edukid.service.usuario.UsuarioService;
import pe.edu.uni.fiis.edukid.service.usuario.impl.UsuarioServiceImpl;
import pe.edu.uni.fiis.edukid.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsuarioController",urlPatterns = {"/registro-usuario"})
public class UsuarioController extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String codigo=req.getParameter("cod");
        String nombre=req.getParameter("nom");
        String credencial=req.getParameter("cred");
        String correo=req.getParameter("cor");
        Usuario usur1= new Usuario(codigo,nombre,credencial,correo);

        SingletonService.getUsuarioService().agregarUsuario(usur1);
        resp.getWriter().write("Se guardo el usuario correctamente");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = Json.getJson(req);

        Usuario usuario = Json.getInstance().readValue(data,Usuario.class);

        usuario = SingletonService.getUsuarioService().agregarUsuario(usuario);
        Json.envioJson(usuario,resp);
    }
    public static void main(String[] args) {
    }
}
