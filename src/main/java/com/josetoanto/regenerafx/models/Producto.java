package com.josetoanto.regenerafx.models;

public class Producto {
    protected String name;
    protected float priece;
    protected int quantity;
    protected String codigoProductoID;

    public String getCodigoProductoID() {
        return codigoProductoID;
    }

    public void setCodigoProductoID(String codigoProductoID) {
        this.codigoProductoID = codigoProductoID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPriece() {
        return priece;
    }

    public void setPriece(float priece) {
        this.priece = priece;
    }

    @Override
    public String toString() {
        return  name +" "+
                "{ Precio=" + priece +
                ", Cantidad=" + quantity +
                " }";
    }

    public void restarProducto (int quantityRestar){
        quantity = quantity - quantityRestar;
    }

}