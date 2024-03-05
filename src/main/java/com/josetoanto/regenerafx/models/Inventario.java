package com.josetoanto.regenerafx.models;

import java.util.ArrayList;
import java.util.Stack;

public class Inventario {
    ArrayList<Producto> productList = new ArrayList<>();

    public ArrayList<Producto> getProductList() {
        return productList;
    }
    public boolean setProductList(Producto newProduct) {
        return productList.add(newProduct);
    }
    public void agregarLote(Stack<Producto> lote){
        while (!lote.isEmpty()){
           for (Producto iterador: productList){
               if (iterador.getName().equalsIgnoreCase(lote.peek().getName())){
                   iterador.setQuantity(iterador.getQuantity()+lote.pop().getQuantity());
               } else {
                   productList.add(lote.pop());
               }
           }
        }
    }
}
