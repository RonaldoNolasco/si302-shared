package pe.edu.uni.fiis.edukid.controller;

import pe.edu.uni.fiis.edukid.model.Cliente;
import pe.edu.uni.fiis.edukid.service.SingletonService;

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
        String apellido=req.getParameter("ape");
        String nacimiento=req.getParameter("nac");
        String genero=req.getParameter("gen");
        String profesion =req.getParameter("prof");
        Cliente cliente1 = new Cliente(nombre,apellido,nacimiento,genero,profesion);
        SingletonService.getClienteService().agregarUsuario(cliente1);
        resp.getWriter().write("Se guardo el usuario correctamente");
    }
}