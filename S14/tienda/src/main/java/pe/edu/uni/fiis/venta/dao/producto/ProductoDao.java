package pe.edu.uni.fiis.venta.dao.producto;

import pe.edu.uni.fiis.venta.model.Producto;

import java.sql.Connection;
import java.util.List;

public interface ProductoDao {
    public List<Producto> obtenerProductos(Connection b);
}
