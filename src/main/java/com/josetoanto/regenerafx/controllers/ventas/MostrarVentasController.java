package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MostrarVentasController {

    @FXML
    private Text cantidadCliente_buscarVenta1;

    @FXML
    private Text cantidadCliente_buscarVenta2;

    @FXML
    private Text cantidadCliente_buscarVenta3;

    @FXML
    private Text nameCliente_BuscarVenta1;

    @FXML
    private Text nameCliente_BuscarVenta2;

    @FXML
    private Text nameCliente_BuscarVenta3;

    @FXML
    private Text numeroCliente_BuscarVenta1;

    @FXML
    private Text numeroCliente_BuscarVenta2;

    @FXML
    private Text numeroCliente_BuscarVenta3;

    @FXML
    private Text total_buscar1;

    @FXML
    private Text total_buscarV2;

    @FXML
    private Text total_buscarV3;
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
    void btmAtras(MouseEvent event) {

    }

    @FXML
    void btmSiguente(MouseEvent event) {

    }

    @FXML
    void onSalirBotonClick(MouseEvent event) {

    }

}
