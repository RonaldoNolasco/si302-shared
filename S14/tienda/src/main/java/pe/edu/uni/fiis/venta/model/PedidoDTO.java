package pe.edu.uni.fiis.venta.model;

import java.util.List;

public class PedidoDTO {
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
