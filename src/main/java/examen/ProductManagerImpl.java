package examen;

import java.util.*;

import org.apache.log4j.Logger;

/**
 * Created by nodet on 13/11/17.
 */
public class ProductManagerImpl implements ProductManager{


    private static ProductManagerImpl instance=null;
    final static Logger logger= Logger.getLogger(ProductManagerImpl.class);

    HashMap<String, Producto> mapaProductos;
    List<Pedido> listaPedidosPendientes;
    HashMap<String, Usuario> mapaUsuarios;

    private ProductManagerImpl() {

        mapaProductos = new HashMap<String, Producto>();
        listaPedidosPendientes = new List<Pedido>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Pedido> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Pedido pedido) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Pedido> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends Pedido> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }

            public Pedido get(int index) {
                return null;
            }

            public Pedido set(int index, Pedido element) {
                return null;
            }

            public void add(int index, Pedido element) {

            }

            public Pedido remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<Pedido> listIterator() {
                return null;
            }

            public ListIterator<Pedido> listIterator(int index) {
                return null;
            }

            public List<Pedido> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        mapaUsuarios = new HashMap<String, Usuario>();

    }
    public static ProductManagerImpl getInstance(){
        if(instance==null){
            instance=new ProductManagerImpl();
            logger.info("Se ha creado la tabla");

        }
        return instance;
    }



    public List<Producto> listarProductosAsPrecio() {

        List<Producto> todosProductos = (List<Producto>) mapaProductos.values();

        Collections.sort(todosProductos, new Comparator<Producto>() {
            public int compare(Producto product1, Producto product2) {
                Integer idea1 = new Integer(product1.getPrecio());
                Integer idea2 = new Integer(product2.getPrecio());
                return idea1.compareTo(idea2);
            }
        });

        return todosProductos;
    }

    public boolean realizarPedido (Usuario usuario, Pedido pedido) {

        pedido.setNombreUsuario(usuario.getName());
        mapaUsuarios.get(usuario.getName()).getMapaPedidos().put(pedido.getIdPedido(), pedido);
        listaPedidosPendientes.add(pedido);

        return false;
    }

    public boolean servirPedido() {

        mapaUsuarios.get(listaPedidosPendientes.get(0).getNombreUsuario()).getMapaPedidos().get(listaPedidosPendientes.get(0).getIdPedido()).setRealizado(true);
        listaPedidosPendientes.remove(0);
        return true;
    }

    public List<Pedido> pedidosRealizados(Usuario usuario) {

        List<Pedido> todosPedidos;
        List<Pedido> pedidosRealizados = new List<Pedido>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Pedido> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Pedido pedido) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Pedido> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends Pedido> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }

            public Pedido get(int index) {
                return null;
            }

            public Pedido set(int index, Pedido element) {
                return null;
            }

            public void add(int index, Pedido element) {

            }

            public Pedido remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<Pedido> listIterator() {
                return null;
            }

            public ListIterator<Pedido> listIterator(int index) {
                return null;
            }

            public List<Pedido> subList(int fromIndex, int toIndex) {
                return null;
            }
        } ;

        todosPedidos = (List<Pedido>) mapaUsuarios.get(usuario.getName()).getMapaPedidos().values();

        for (int x = 0; x < todosPedidos.size(); x++){
            if (todosPedidos.get(x).isRealizado()){
                pedidosRealizados.add(todosPedidos.get(x));
            }
        }

        return pedidosRealizados;

    }

    public List<Producto> listarProductosDesVentas() {

        List<Producto> todosProductos = (List<Producto>) mapaProductos.values();

        Collections.sort(todosProductos, new Comparator<Producto>() {
            public int compare(Producto product1, Producto product2) {
                Integer idea1 = new Integer(product1.getVentas());
                Integer idea2 = new Integer(product2.getVentas());
                return idea2.compareTo(idea1);
            }
        });

        return todosProductos;
    }

    public HashMap<String, Producto> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(HashMap<String, Producto> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }

    public List<Pedido> getListaPedidosPendientes() {
        return listaPedidosPendientes;
    }

    public void setListaPedidosPendientes(List<Pedido> listaPedidosPendientes) {
        this.listaPedidosPendientes = listaPedidosPendientes;
    }

    public HashMap<String, Usuario> getMapaUsuarios() {
        return mapaUsuarios;
    }

    public void setMapaUsuarios(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
    }
}
