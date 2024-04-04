package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EditarProveedorController {

    @FXML
    private TextField folioEditar_editarVenta;

    @FXML
    private Label lbl_Advertencia;

    @FXML
    private TextField newNumeroTelefono_editarProveedor;

    @FXML
    private TextField newProveedor_editarProveedor;

    @FXML
    private TextField numeroProveedor_editarProveedor;
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
    void buscadorProveedor(KeyEvent event) {

    }

    @FXML
    void onConfirmarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
