package pe.edu.uni.fiis.edukid.controller;

import pe.edu.uni.fiis.edukid.model.UsuarioF;
import pe.edu.uni.fiis.edukid.service.SingletonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    }

}
