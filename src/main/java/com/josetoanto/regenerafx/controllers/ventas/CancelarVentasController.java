package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
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
    void btmSalir(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ventasMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        VentasMenuController ventasMenuController = fxmlLoader.getController();
        ventasMenuController.setStage(stage);
        ventasMenuController.setListaCuentas(listaCuentas);
    }

    @FXML
    void btmSiguente(MouseEvent event) {

    }

}
