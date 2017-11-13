package examen;

import java.util.HashMap;

/**
 * Created by nodet on 13/11/17.
 */
public class Usuario {

    String name;
    String pass;
    HashMap<String, Pedido> mapaPedidos;

    public Usuario (String nombre, String pass){
        this.name = nombre;
        this.pass = pass;
    }

    public HashMap<String, Pedido> getMapaPedidos() {
        return mapaPedidos;
    }

    public void setMapaPedidos(HashMap<String, Pedido> mapaPedidos) {
        this.mapaPedidos = mapaPedidos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Usuario(){


    }




}
