package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EliminarProductoController {

    @FXML
    private Label advertencia;

    @FXML
    private TextField codigoEliminar_eliminarProducto;

    @FXML
    private Text codigo_eliminarProducto;

    @FXML
    private Text nameP_eliminarProducto;

    @FXML
    private Text precio_eliminarProducto;
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
    void buscadorProductos(MouseEvent event) {

    }

    @FXML
    void onEliminarClick(MouseEvent event) {

    }

    @FXML
    void onSalirClick(MouseEvent event) {

    }

}
