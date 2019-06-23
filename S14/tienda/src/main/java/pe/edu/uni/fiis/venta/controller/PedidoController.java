package pe.edu.uni.fiis.venta.controller;


import pe.edu.uni.fiis.venta.model.Pedido;
import pe.edu.uni.fiis.venta.model.PedidoDTO;
import pe.edu.uni.fiis.venta.service.SingletonService;
import pe.edu.uni.fiis.venta.util.Json;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PedidoController",urlPatterns = {"/agregar-pedido"})
public class PedidoController extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = Json.getJson(req);

        Pedido pedido = Json.getInstance().readValue(data,Pedido.class);

        List<Pedido> pedidos = SingletonService.getVentaService().agregarPedido(pedido);

        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setPedidos(pedidos);
        Json.envioJson(pedidoDTO,resp);
    }

}
