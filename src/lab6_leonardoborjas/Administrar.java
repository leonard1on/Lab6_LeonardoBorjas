/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_leonardoborjas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Borjas
 */
public class Administrar {
    File archivo = null;
    ArrayList<Producto> productos=new ArrayList();

    public Administrar() {
    }
    
    public Administrar(String path){
        this.archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void addProductos(Producto p){
        this.productos.add(p);
    }

    @Override
    public String toString() {
        return "Administrar{" + "archivo=" + archivo + ", productos=" + productos + '}';
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Producto p : productos) {
                bw.write(p.getNombre()+";");
                bw.write(p.getCategoria()+";");
                bw.write(p.getPrecio()+";");
                bw.write(p.getDescuento()+";");
            }
            bw.flush();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc=null;
        productos=new ArrayList();
        try {
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                productos.add(new Producto(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()));
            }
        } catch (Exception e) {
        }
    }
}
