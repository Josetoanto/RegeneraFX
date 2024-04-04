package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EditarVentasController {

    @FXML
    private TextField cantidadProducto_editarVenta;

    @FXML
    private ComboBox<?> cmb_Box_listaProductos;

    @FXML
    private TextField folio_VentaAEditar;

    @FXML
    private TextField nameCliente_editarVenta;

    @FXML
    private TextField numeroPhone_editarVenta;

    @FXML
    private TextField total_agregarVenta;
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
    void onComboBoxClick(MouseEvent event) {

    }

    @FXML
    void onGuardarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
