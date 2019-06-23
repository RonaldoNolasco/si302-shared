package pe.edu.uni.fiis.venta.dao.producto;

import pe.edu.uni.fiis.venta.model.Pedido;
import pe.edu.uni.fiis.venta.model.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl implements ProductoDao {
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


    public List<Producto> obtenerProductos (Connection b) {
        List<Producto> lista = new ArrayList<Producto>();
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("select id_producto,nombre,precio_unitario from venta.producto");

            Statement sentencia = b.createStatement();
            ResultSet rs = sentencia.executeQuery(sql.toString());
            while (rs.next()){
                Producto u = new Producto();
                u.setPrecioUnitario(rs.getDouble("precio_unitario") );
                u.setIdProducto(rs.getInt("id_producto"));
                u.setNombre(rs.getString("nombre"));

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