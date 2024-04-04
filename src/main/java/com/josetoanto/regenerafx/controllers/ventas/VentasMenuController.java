package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VentasMenuController {

    @FXML
    private ImageView iconoReturn;

    @FXML
    private Label usuarioLabel_menu;
    private int usuario;
    private Stage stage;
    private ArrayList<Cuenta> listaCuentas;
    public void setUsuario(int cuenta) {
        this.usuario = cuenta;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    @FXML
    void onBtnAgregarVenta_menuVenta(MouseEvent event) {

    }

    @FXML
    void onBtnBuscar_menuVenta(MouseEvent event) {

    }

    @FXML
    void onBtnCancelar_menuVenta(MouseEvent event) {

    }

    @FXML
    void onBtnEditar_menuVenta(MouseEvent event) {

    }

    @FXML
    void onBtnMostrar_menuVenta(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
