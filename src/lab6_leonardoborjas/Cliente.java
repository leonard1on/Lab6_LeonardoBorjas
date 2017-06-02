/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_leonardoborjas;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Cliente {
    ArrayList<Producto> productos=new ArrayList();
    private String nombre;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void addProductos(Producto p){
        productos.add(p);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
