package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarVentasController {

    @FXML
    private TextField cantidadProducto_agregarVenta;

    @FXML
    private ComboBox<?> cmb_Box_listaProductos;

    @FXML
    private TextField folio_agregarVenta;

    @FXML
    private ImageView iconoListo;

    @FXML
    private ImageView iconoSalir;

    @FXML
    private TextField nameCliente_agregarVenta;

    @FXML
    private TextField numeroPhone_agregarVenta;

    @FXML
    private TextField total_agregarVenta;
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
    void cancelarClick(MouseEvent event) throws IOException {
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
    void listoClick(MouseEvent event) {

    }

    @FXML
    void onComboBoxClick(MouseEvent event) {

    }

}
