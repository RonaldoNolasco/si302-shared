package pe.edu.uni.fiis.edukids.controller;

import pe.edu.uni.fiis.edukids.model.UsuarioF;
import pe.edu.uni.fiis.edukids.service.SingletonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UsuarioFObtenerController",urlPatterns = {"/obtener-cliente"})
public class UsuarioFObtenerController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<UsuarioF> lista = SingletonService.getUsuarioService().obtenerUsuariosF();

        PrintWriter ps =  resp.getWriter();
        ps.write("<table>");
        for (int i = 0; i < lista.size(); i++) {
            ps.write("<tr><td>"+lista.get(i).getNombres()+"</td><td>"+lista.get(i).getApellidos()+"</td></tr>");
        }
        ps.write("</table>");
    }
}
