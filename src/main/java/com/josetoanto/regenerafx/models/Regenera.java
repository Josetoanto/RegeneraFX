package com.josetoanto.regenerafx.models;

import java.util.ArrayList;

public class Regenera {
    private ArrayList<Cuenta> listaDeUsuarios = new ArrayList<>();

    public ArrayList<Cuenta> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(ArrayList<Cuenta> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public void addUsuario (Cuenta nuevoUsuario){
        listaDeUsuarios.add(nuevoUsuario);
    }
}