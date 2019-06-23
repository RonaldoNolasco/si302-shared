package pe.edu.uni.fiis.venta.service.pedido;


import pe.edu.uni.fiis.venta.dao.SingletonDao;
import pe.edu.uni.fiis.venta.model.Pedido;
import pe.edu.uni.fiis.venta.model.Producto;
import pe.edu.uni.fiis.venta.service.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VentaServiceImpl implements VentaService {
    public List<Pedido> agregarPedido(Pedido pedido) {
        Connection connection= Conexion.getConnection();
        SingletonDao.getPedidoDao().agregarPedido(pedido,connection);
        List<Pedido> list=SingletonDao.getPedidoDao().obtenerPedidos(connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Producto> obtenerProductos() {
        Connection connection= Conexion.getConnection();
        List<Producto> list =SingletonDao.getProductoDao().obtenerProductos(connection);
        try {
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
