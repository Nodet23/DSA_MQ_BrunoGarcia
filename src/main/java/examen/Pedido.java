package examen;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by nodet on 13/11/17.
 */
public class Pedido {

    String idPedido;
    String nombreUsuario;
    List<Producto> productos;
    boolean realizado;

    public Pedido(String idPedido, String nombreUsuario, List<Producto> productos, boolean realizado) {
        this.idPedido = idPedido;
        this.nombreUsuario = nombreUsuario;
        this.productos = productos;
        this.realizado = realizado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }


    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Pedido(){

        productos = new List<Producto>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Producto> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Producto producto) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Producto> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends Producto> c) {
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

            public Producto get(int index) {
                return null;
            }

            public Producto set(int index, Producto element) {
                return null;
            }

            public void add(int index, Producto element) {

            }

            public Producto remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<Producto> listIterator() {
                return null;
            }

            public ListIterator<Producto> listIterator(int index) {
                return null;
            }

            public List<Producto> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}
