package com.josetoanto.regenerafx.models;

import java.util.Stack;

public class Lote {
    int loteID;
    float lotePrecio;
    String productoName;
    Stack<Producto> listaProductos = new Stack<>();
    public Lote(int loteID, float lotePrecio, String productoName) {
        this.loteID = loteID;
        this.lotePrecio = lotePrecio;
        this.productoName = productoName;
    }

    public int getLoteID() {
        return loteID;
    }

    public float getLotePrecio() {
        return lotePrecio;
    }

    public String getProductoName() {
        return productoName;
    }

    public Stack<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setProducto(Producto newProductos) {
        listaProductos.add(newProductos);
    }
}
