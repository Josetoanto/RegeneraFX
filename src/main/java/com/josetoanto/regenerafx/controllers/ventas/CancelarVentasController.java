package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CancelarVentasController {

    @FXML
    private Text folioCliente_cancelar1;

    @FXML
    private Text folioCliente_cancelar2;

    @FXML
    private Text folioCliente_cancelar3;

    @FXML
    private Text nameCliente_cancelar1;

    @FXML
    private Text nameCliente_cancelar2;

    @FXML
    private Text nameCliente_cancelar3;

    @FXML
    private Text numeroCliente_cancelar1;

    @FXML
    private Text numeroCliente_cancelar2;

    @FXML
    private Text numeroCliente_cancelar3;
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
    void btmConfirmar(MouseEvent event) {

    }

    @FXML
    void btmElimianrVenta3(MouseEvent event) {

    }

    @FXML
    void btmEliminarVenta1(MouseEvent event) {

    }

    @FXML
    void btmEliminarVenta2(MouseEvent event) {

    }

    @FXML
    void btmSalir(MouseEvent event) {

    }

    @FXML
    void btmSiguente(MouseEvent event) {

    }

}
