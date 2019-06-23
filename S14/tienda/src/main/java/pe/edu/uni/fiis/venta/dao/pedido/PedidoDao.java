package pe.edu.uni.fiis.venta.dao.pedido;

import pe.edu.uni.fiis.venta.model.Pedido;

import java.sql.Connection;
import java.util.List;

public interface PedidoDao {
    public Pedido agregarPedido(Pedido a, Connection b);
    public List<Pedido> obtenerPedidos(Connection b);

}
