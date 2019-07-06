package pe.edu.uni.fiis.edukids.controller;


import pe.edu.uni.fiis.edukids.model.Usuario;
import pe.edu.uni.fiis.edukids.service.SingletonService;
import pe.edu.uni.fiis.edukids.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsuarioController",urlPatterns = {"/registro-usuario"})
public class UsuarioController extends HttpServlet{

   /* public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //ya no es necesario este metodo ya que el post hace lo mismo pero mas seguro

        String codigo=req.getParameter("cod");
        String nombre=req.getParameter("nom");
        String credencial=req.getParameter("cred");
        String correo=req.getParameter("cor");
        Usuario usur1= new Usuario(codigo,nombre,credencial,correo);

        SingletonService.getUsuarioService().agregarUsuario(usur1);
        resp.getWriter().write("Se guardo el usuario correctamente");
    }*/

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = Json.getJson(req);

        Usuario usuario = Json.getInstance().readValue(data,Usuario.class);

        usuario = SingletonService.getUsuarioService().agregarUsuario(usuario);
        Json.envioJson(usuario,resp);
    }
    public static void main(String[] args) {
    }
}