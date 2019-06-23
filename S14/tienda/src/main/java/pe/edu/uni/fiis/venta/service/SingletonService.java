package pe.edu.uni.fiis.venta.service;

import pe.edu.uni.fiis.venta.service.pedido.VentaService;
import pe.edu.uni.fiis.venta.service.pedido.VentaServiceImpl;

public class SingletonService {
    private static VentaService ventaService = null;

    public static VentaService getVentaService() {
        if (ventaService == null) {
            ventaService = new VentaServiceImpl();
        }
        return ventaService;
    }
}
