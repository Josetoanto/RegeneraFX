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

}
