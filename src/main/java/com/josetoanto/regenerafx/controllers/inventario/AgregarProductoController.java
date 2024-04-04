package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AgregarProductoController {

    @FXML
    private TextField cantidadDependiente;

    @FXML
    private TextField cantidadProducto_agregarProducto1;

    @FXML
    private TextField codigoProducto_agregarProducto11;

    @FXML
    private TextField nombreProducto_agregarProducto;

    @FXML
    private TextField precioProducto_agregarProducto112;

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
    void confirmarClick(MouseEvent event) {

    }

    @FXML
    void onTipoDeProductoClick(MouseEvent event) {

    }

    @FXML
    void salirClick(MouseEvent event) {

    }

}
