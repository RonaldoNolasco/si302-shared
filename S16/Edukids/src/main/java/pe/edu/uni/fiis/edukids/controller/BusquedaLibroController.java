package pe.edu.uni.fiis.edukids.controller;
import pe.edu.uni.fiis.edukids.dto.BusquedaRequest;
import pe.edu.uni.fiis.edukids.dto.BusquedaResponse;
import pe.edu.uni.fiis.edukids.model.Libro;
import pe.edu.uni.fiis.edukids.service.SingletonService;
import pe.edu.uni.fiis.edukids.util.Json;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BusquedaLibroController",urlPatterns = {"/buscar-libro"})
public class BusquedaLibroController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = Json.getJson(req);
        BusquedaRequest busquedaRequest = Json.getInstance().readValue(data,BusquedaRequest.class);
        List<Libro> lista = SingletonService.getUsuarioService().getLibros(busquedaRequest.getCoGenero(),busquedaRequest.getTitulo());
        BusquedaResponse busquedaResponse = new BusquedaResponse();
        busquedaResponse.setLibros(lista);
        Json.envioJson(busquedaResponse,resp);
    }
}