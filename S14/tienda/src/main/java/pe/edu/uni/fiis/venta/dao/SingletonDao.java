package pe.edu.uni.fiis.venta.dao;

import pe.edu.uni.fiis.venta.dao.pedido.PedidoDao;
import pe.edu.uni.fiis.venta.dao.pedido.PedidoDaoImpl;
import pe.edu.uni.fiis.venta.dao.producto.ProductoDao;
import pe.edu.uni.fiis.venta.dao.producto.ProductoDaoImpl;


public abstract class SingletonDao {
    private static ProductoDao productoDao = null;
    private static PedidoDao pedidoDao = null;
    public static ProductoDao getProductoDao(){
        if(productoDao == null){
            productoDao = new ProductoDaoImpl();
        }
        return productoDao;
    }
    public static PedidoDao getPedidoDao(){
        if(pedidoDao == null){
            pedidoDao = new PedidoDaoImpl();
        }
        return pedidoDao;
    }
}