package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ProveedoresMenuController {

    @FXML
    private Label usuarioLabel_menu;
    private Cuenta usuario;
    private Stage stage;
    private ArrayList<Cuenta> listaCuentas;
    public void setUsuario(Cuenta cuenta) {
        this.usuario = cuenta;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @FXML
    void onBtnAgregar_menuProvedoor(MouseEvent event) {

    }

    @FXML
    void onBtnEditar_menuProveedor(MouseEvent event) {

    }

    @FXML
    void onBtnEliminar_menuProvedoor(MouseEvent event) {

    }

    @FXML
    void onBtnVer_menuProveedor(MouseEvent event) {

    }

}
