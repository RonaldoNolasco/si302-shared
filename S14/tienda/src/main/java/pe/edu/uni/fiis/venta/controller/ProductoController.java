package pe.edu.uni.fiis.venta.controller;


import pe.edu.uni.fiis.venta.model.ProductoDTO;
import pe.edu.uni.fiis.venta.service.SingletonService;
import pe.edu.uni.fiis.venta.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductoController",urlPatterns = {"/obtener-producto"})
public class ProductoController extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {

        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setProductos(SingletonService.getVentaService().obtenerProductos());

        Json.envioJson(productoDTO,resp);
    }
    public static void main(String[] args) {
    }
}
