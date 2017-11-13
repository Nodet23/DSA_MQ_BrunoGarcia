import examen.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Por falta de tiempo, he preferido pasar a la SEGUNDA PARTE antes que acabar el test
/**
 * Created by nodet on 13/11/17.
 */
public class TestProductManagerImpl {
    ProductManagerImpl productManager;


    @Before
    public void setUp(){
        productManager.getInstance();
        Usuario usuario1 = new Usuario("Bruno", "jaja" );
        Usuario usuario2 = new Usuario("Juan", "jeje");
        productManager.getMapaUsuarios().put(usuario1.getName(), usuario1);
        productManager.getMapaUsuarios().put(usuario2.getName(), usuario2);

        Producto producto1 = new Producto("Tele", "hola", 3, 3,3);
        Producto producto2 = new Producto(" Ordenador", " adios", 4, 4,4);
        productManager.getMapaProductos().put("hola" , producto1);
        productManager.getMapaProductos().put("adios", producto2);

    }

    @Test
    public void realizarPedido(){
        Pedido pedido = new Pedido( );

        productManager.realizarPedido(productManager.getMapaUsuarios().get("Bruno"), pedido);
    }



}
