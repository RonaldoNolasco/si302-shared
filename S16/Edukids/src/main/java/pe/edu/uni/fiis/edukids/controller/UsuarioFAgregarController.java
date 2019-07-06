package pe.edu.uni.fiis.edukids.controller;



import pe.edu.uni.fiis.edukids.model.UsuarioF;
import pe.edu.uni.fiis.edukids.service.SingletonService;
import pe.edu.uni.fiis.edukids.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UsuarioFAgregarController",urlPatterns = {"/registro-usuariof"})
public class UsuarioFAgregarController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String profesion=req.getParameter("prof");
        String nombres=req.getParameter("nom");
        String nacimiento=req.getParameter("nac");
        String genero=req.getParameter("gen");
        String apellidos=req.getParameter("ape");
        UsuarioF usu= new UsuarioF();
        usu.setProfesion(profesion);
        usu.setNombres(nombres);
        usu.setNacimiento(nacimiento);
        usu.setGenero(genero);
        usu.setApellidos(apellidos);
        SingletonService.getUsuarioService().agregarUsuarioF(usu);
        resp.getWriter().write("Se guardo el usuario correctamente");

        List<UsuarioF> lista = SingletonService.getUsuarioService().obtenerUsuariosF();

        PrintWriter ps =  resp.getWriter();
        ps.write("<table>");
        for (int i = 0; i < lista.size(); i++) {
            ps.write("<tr><td>"+lista.get(i).getNombres()+"</td><td>"+lista.get(i).getApellidos()+"</td></tr>");
        }
        ps.write("</table>");
    }
    /*public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = Json.getJson(req);

        UsuarioF usuariof = Json.getInstance().readValue(data,UsuarioF.class);

        usuariof = SingletonService.getUsuarioService().agregarUsuarioF(usuariof);
        Json.envioJson(usuariof,resp);
    }*/

    public static void main(String[] args) {

    }

}
