package com.josetoanto.regenerafx.models;

import java.util.ArrayList;

public class Cuenta {
    private String name;
    private String password;
    private String gmail;
    private Inventario inventario = new Inventario();
    private ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private ArrayList<Venta> listaVentas = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(Proveedor newProveedor) {
        this.listaProveedores.add(newProveedor);
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(Venta newVenta) {
        this.listaVentas.add(newVenta);
    }
}
