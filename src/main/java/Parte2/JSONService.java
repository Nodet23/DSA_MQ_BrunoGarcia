package Parte2;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import examen.*;

import examen.ProductManagerImpl;

/**
 * Created by nodet on 13/11/17.
 */
public class JSONService {

    private ProductManagerImpl service = ProductManagerImpl.getInstance();
    List<Producto> milista = new List<Producto>();

    public JSONService() {


    }

    @GET
    Pedido pedido = new Pedido("primerID", "Bruno", milista, true);

    @Path("/realizarPedido/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean realizarPedido(@PathParam("name") String name) {
        return service.realizarPedido(name, pedido);
    }

    @POST
    @Path("/servirPedido")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public boolean servirPedido() {
        service.servirPedido();
        return true;
    }

    @GET
    @Path("/{usuario}/pedidosRealizados")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> pedidosRealizados(@PathParam("usuario") String usuario) {
        List<Pedido> list = service.pedidosRealizados(usuario);
        return list;

    }

    @GET
    @Path("/listarProductosDesVentas")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> listarProductosDesVentas() {
        List<Pedido> list = service.listarProductosDesVentas();
        return list;

    }
}