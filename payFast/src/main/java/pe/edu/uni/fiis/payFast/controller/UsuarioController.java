package pe.edu.uni.fiis.payFast.controller;
import pe.edu.uni.fiis.payFast.dao.SingletonUsuarioDao;
import pe.edu.uni.fiis.payFast.model.Usuario;
import pe.edu.uni.fiis.payFast.service.SingletonService;
import pe.edu.uni.fiis.payFast.service.usuario.UsuarioService;
import pe.edu.uni.fiis.payFast.service.usuario.impl.UsuarioServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsuarioController",urlPatterns = {"/registro"})
public class UsuarioController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre=req.getParameter("nombre");
        String usuario=req.getParameter("usuario");
        String credencial=req.getParameter("credencial");
        String sexo=req.getParameter("sexo");
        String tarjeta=req.getParameter("tarjeta");
        String region=req.getParameter("region");
        String provincia=req.getParameter("provincia");
        String distrito=req.getParameter("distrito");
        String correo=req.getParameter("correo");
        String telefono=req.getParameter("telefono");
        Usuario usuario1= new Usuario(nombre,usuario,credencial,sexo,tarjeta,region,provincia,distrito,correo,telefono);
        SingletonService.getUsuarioService().agregarUsuario(usuario1);
        //resp.setContentType("text/html");
        resp.getWriter().write("Se guardo el usuario correctamente");
    }
}