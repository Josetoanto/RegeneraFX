package com.josetoanto.regenerafx.models;

import java.util.Date;

public class Venta {
    int folio;
    String clienteName;
    String clientNum;
    int productoID;
    int cantidadDeProducto;
    int total;
    Date fecha;

    public Venta(int folio, String clienteName, String clientNum, int productoID, int cantidadDeProducto, int total, Date fecha) {
        this.folio = folio;
        this.clienteName = clienteName;
        this.clientNum = clientNum;
        this.productoID = productoID;
        this.cantidadDeProducto = cantidadDeProducto;
        this.total = total;
        this.fecha = fecha;
    }
    public int getFolio() {
        return folio;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "Folio=" + folio +
                ", Nombre del cliente='" + clienteName + '\'' +
                ", Numero del cliente='" + clientNum + '\'' +
                ", ID del Producto=" + productoID +
                ", Cantidad del producto=" + cantidadDeProducto +
                ", Total=" + total +
                ", Fecha=" + fecha +
                '}';
    }
}
