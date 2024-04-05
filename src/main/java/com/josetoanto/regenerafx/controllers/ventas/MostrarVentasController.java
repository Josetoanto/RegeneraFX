package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
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
    void btmSiguente(MouseEvent event) {

    }

    @FXML
    void onSalirBotonClick(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ventasMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        VentasMenuController ventasMenuController = fxmlLoader.getController();
        ventasMenuController.setStage(stage);
        ventasMenuController.setListaCuentas(listaCuentas);
    }

}
