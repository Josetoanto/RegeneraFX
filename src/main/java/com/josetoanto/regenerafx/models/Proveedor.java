package com.josetoanto.regenerafx.models;

import java.util.ArrayList;
import java.util.Stack;

public class Proveedor {
    String name;
    String num;
    int proveedorID;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lote> getListaLotes() {
        return listaLotes;
    }

    public void setLote(Lote newLote) {
        listaLotes.add(newLote);
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }
        public Stack<Producto> comprarLote(int loteID){
        int indexAux = 0;
        int indexBuy = 0;
        for (Lote lote: listaLotes){
                if (lote.getLoteID()==loteID){
                    indexBuy = indexAux;
                }
                indexAux++;
            }
        return listaLotes.get(indexBuy).getListaProductos();
        }
        public void eliminarLotecomprarLote(int loteID){
            int indexAux = 0;
            int indexEli = 0;
            for (Lote lote: listaLotes){
                if (lote.getLoteID()==loteID){
                    indexEli = indexAux;
                }
                indexAux++;
            }
            listaLotes.remove(indexEli);
        }
    }
