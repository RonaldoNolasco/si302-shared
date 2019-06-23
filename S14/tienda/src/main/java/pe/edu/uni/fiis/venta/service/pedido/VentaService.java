package pe.edu.uni.fiis.venta.service.pedido;

import pe.edu.uni.fiis.venta.model.Pedido;
import pe.edu.uni.fiis.venta.model.Producto;

import java.util.List;

public interface VentaService {
    public List<Pedido> agregarPedido(Pedido pedido);
    public List<Producto> obtenerProductos();
}
