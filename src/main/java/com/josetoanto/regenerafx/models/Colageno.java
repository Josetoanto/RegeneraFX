package com.josetoanto.regenerafx.models;

public class Colageno extends Producto{
    private int cantidadGr;

    public void setCantidadGr(int cantidadGr) {
        this.cantidadGr = cantidadGr;
    }

    @Override
    public String toString() {
        return "Colageno{" +
                "cantidadGr=" + cantidadGr +
                ", name='" + name + '\'' +
                ", priece=" + priece +
                ", quantity=" + quantity +
                ", codigoProductoID='" + codigoProductoID + '\'' +
                '}';
    }
}
