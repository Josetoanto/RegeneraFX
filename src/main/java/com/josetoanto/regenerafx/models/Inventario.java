package com.josetoanto.regenerafx.models;

import java.util.ArrayList;
import java.util.Stack;

public class Inventario {
    private ArrayList<Producto> productList = new ArrayList<>();

    public ArrayList<Producto> mostrarProductoEnStock() {
        return productList;
    }

    public void setProductList(ArrayList<Producto> productList) {
        this.productList = productList;
    }

    public void agregarProducto(Producto nuevoProducto){
        productList.add(nuevoProducto);
    }

    public void eliminarProducto(String codigoProductoIDEliminar){
        int auxEliminar = -1;
        int aux = 0;
        for (Producto producto:productList){
            if (producto.getCodigoProductoID().equals(codigoProductoIDEliminar)){
                auxEliminar = aux;
            }
            aux++;
        }
        if (auxEliminar > -1){
            productList.remove(auxEliminar);
        }
    }
    public boolean editarProducto(String codigoProductoEditar,Producto productoEditado){
        int auxEditar = -1;
        int aux = 0;
        for (Producto producto:productList){
            if (producto.getCodigoProductoID().equals(codigoProductoEditar)){
                auxEditar = aux;
            }
            aux++;
        }
        if (auxEditar > -1){
            productList.set(auxEditar,productoEditado);
            return true;
        } else {
            return false;
        }
    }
}
