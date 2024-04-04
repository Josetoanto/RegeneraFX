package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MostrarProductosController {

    @FXML
    private Text codigo_mostrarProducto1;

    @FXML
    private Text codigo_mostrarProducto2;

    @FXML
    private Text codigo_mostrarProducto3;

    @FXML
    private ImageView iconoSalir;

    @FXML
    private Text nameP_mostrarProducto1;

    @FXML
    private Text nameP_mostrarProducto2;

    @FXML
    private Text nameP_mostrarProducto3;

    @FXML
    private Text precio_mostrarProductos1;

    @FXML
    private Text precio_mostrarProductos2;

    @FXML
    private Text precio_mostrarProductos3;
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
    void onSalirClick(MouseEvent event) {

    }

}
