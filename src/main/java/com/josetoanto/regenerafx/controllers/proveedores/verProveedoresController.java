package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class verProveedoresController {

    @FXML
    private Text nameProveedor_verProveedores;

    @FXML
    private Text nameProveedor_verProveedores1;

    @FXML
    private Text nameProveedor_verProveedores2;

    @FXML
    private Text nameProveedor_verProveedores3;

    @FXML
    private Text numeroProveedor_verProveedores;

    @FXML
    private Text numeroProveedor_verProveedores1;

    @FXML
    private Text numeroProveedor_verProveedores2;

    @FXML
    private Text numeroProveedor_verProveedores3;

    @FXML
    private Text numero_verProveedores;

    @FXML
    private Text numero_verProveedores1;

    @FXML
    private Text numero_verProveedores2;

    @FXML
    private Text numero_verProveedores3;

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
    void btmAtras(MouseEvent event) {

    }

    @FXML
    void btmSiguente(MouseEvent event) {

    }

    @FXML
    void onConfirmarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
