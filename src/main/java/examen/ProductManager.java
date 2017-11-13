package examen;

import java.util.List;

/**
 * Created by nodet on 13/11/17.
 */
public interface ProductManager {

     List<Producto> listarProductosAsPrecio();
     boolean realizarPedido(Usuario usuario, Pedido pedido);
     boolean servirPedido();
     List<Pedido> pedidosRealizados(Usuario usuario);
     List<Producto> listarProductosDesVentas();

}
