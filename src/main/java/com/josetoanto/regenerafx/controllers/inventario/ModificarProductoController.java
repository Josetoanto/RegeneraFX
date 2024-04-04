package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ModificarProductoController {

    @FXML
    private TextField cantidadProducto;

    @FXML
    private TextField codigoModificar_buscarventa;

    @FXML
    private TextField codigoProducto;

    @FXML
    private Label lblAdvertencia;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField precioProducto;

    @FXML
    private ComboBox<?> tipoDeProducto;
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
    void buscadorDeProducto(KeyEvent event) {

    }

    @FXML
    void onConfirmarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

    @FXML
    void onTipoDeProductoClick(MouseEvent event) {

    }

}
