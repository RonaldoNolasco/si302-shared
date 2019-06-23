package pe.edu.uni.fiis.venta.dao.pedido;

import pe.edu.uni.fiis.venta.model.Pedido;
import pe.edu.uni.fiis.venta.model.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDaoImpl implements PedidoDao {
    /**
     * Tabla
     * CREATE table clientef(
     *   nombres varchar(60),
     *   apellidos varchar(60),
     *   fecha_nacimiento varchar(10),
     *   genero varchar(1),
     *   profesion varchar(60)
     * );
     * @param a
     * @param b
     * @return
     */
    public Pedido agregarPedido(Pedido a, Connection b) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("insert into venta.pedido(id_producto,id_pedido,cantidad_productos,igv,monto_total) values (")
                    .append("?,?,?,?,?)");

            PreparedStatement sentencia = b.prepareStatement(sql.toString());
            sentencia.setInt(1,a.getProducto().getIdProducto());
            sentencia.setInt(2,a.getIdPedido());
            sentencia.setInt(3,a.getCantidadProductos());
            sentencia.setDouble(4,a.getIgv());
            sentencia.setDouble(5,a.getMontoTotal());

            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public List<Pedido> obtenerPedidos (Connection b) {
        List<Pedido> lista = new ArrayList<Pedido>();
        try {
            StringBuffer sql = new StringBuffer();
            sql.append(" select p.id_pedido,pr.nombre, " +
                    " p.cantidad_productos,pr.precio_unitario, " +
                    " p.monto_total*0.18 monto_igv,p.monto_total " +
                    " from venta.pedido p" +
                    " inner join venta.producto pr " +
                    " on (p.id_producto=pr.id_producto) ");

            Statement sentencia = b.createStatement();
            ResultSet rs = sentencia.executeQuery(sql.toString());
            while (rs.next()){
                Pedido u = new Pedido();
                u.setProducto(new Producto());
                u.setCantidadProductos(rs.getInt("cantidad_productos"));
                u.setIdPedido(rs.getInt("id_pedido"));
                u.getProducto().setPrecioUnitario(rs.getDouble("precio_unitario"));
                u.setIgv(rs.getDouble("monto_igv"));
                u.setMontoTotal(rs.getDouble("monto_total"));
                lista.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    /*
    create table usuario(
      codigo_usuario varchar(9) primary key,
      nombre varchar(100),
      credencial varchar(15),
      correo varchar(50)
    );
     */

}