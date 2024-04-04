package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BuscarVentasController {

    @FXML
    private Text cantidadCliente_buscarVenta;

    @FXML
    private TextField folio_buscarVenta;

    @FXML
    private Text nameCliente_BuscarVenta;

    @FXML
    private Text numeroCliente_BuscarVenta;

    @FXML
    private Text total_buscarV1;
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
    void buscarBoton(MouseEvent event) {

    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

}
