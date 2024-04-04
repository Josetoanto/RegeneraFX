package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AgregarProveedorController {

    @FXML
    private TextField nameProveedor_agregarProveedor;

    @FXML
    private TextField numeroProveedor_agregarProveedor;

    @FXML
    private TextField numeroTelefono_agregarProveedor;
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
    void onConfirmarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
