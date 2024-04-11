package com.josetoanto.regenerafx.models;

public class Venta {
    private String folio;
    private String clienteName;
    private String clientNum;
    private int cantidadDeProducto;
    private String codigoProductoID;
    private float total;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }

    public String getClientNum() {
        return clientNum;
    }

    public void setClientNum(String clientNum) {
        this.clientNum = clientNum;
    }

    public int getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setCantidadDeProducto(int cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }


    public void setCodigoProductoID(String codigoProductoID) {
        this.codigoProductoID = codigoProductoID;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "Folio=" + folio +
                ", Nombre del cliente='" + clienteName + '\'' +
                ", Numero del cliente='" + clientNum + '\'' +
                ", ID del Producto=" + codigoProductoID +
                ", Cantidad del producto=" + cantidadDeProducto +
                ", Total=" + total +
                '}';
    }
}
