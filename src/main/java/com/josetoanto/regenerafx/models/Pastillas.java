package com.josetoanto.regenerafx.models;

public class Pastillas extends Producto{

    private int cantidadPastillas;

    public void setCantidadPastillas(int cantidadPastillas) {
        this.cantidadPastillas = cantidadPastillas;
    }

    @Override
    public String toString() {
        return "Pastillas{" +
                "cantidadPastillas=" + cantidadPastillas +
                ", name='" + name + '\'' +
                ", priece=" + priece +
                ", quantity=" + quantity +
                ", codigoProductoID='" + codigoProductoID + '\'' +
                '}';
    }
}
