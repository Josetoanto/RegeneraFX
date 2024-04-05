package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class VentasMenuController {

    @FXML
    private ImageView iconoReturn;

    @FXML
    private Label usuarioLabel_menu;
    private int usuario;
    private Stage stage;
    private ArrayList<Cuenta> listaCuentas;

    public void setUsuario(int cuenta) {
        this.usuario = cuenta;
        usuarioLabel_menu.setText(listaCuentas.get(usuario).getName());
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    @FXML
    void onBtnAgregarVenta_menuVenta(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("agregarVentas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        AgregarVentasController agregarVentasController = fxmlLoader.getController();
        agregarVentasController.setStage(stage);
        agregarVentasController.setListaCuentas(listaCuentas);
        agregarVentasController.actualizarProductos();
    }

    @FXML
    void onBtnBuscar_menuVenta(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("buscarVentas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        BuscarVentasController buscarVentasController = fxmlLoader.getController();
        buscarVentasController.setStage(stage);
        buscarVentasController.setListaCuentas(listaCuentas);
    }

    @FXML
    void onBtnCancelar_menuVenta(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("cancelarVentas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        CancelarVentasController cancelarVentasController = fxmlLoader.getController();
        cancelarVentasController.setStage(stage);
        cancelarVentasController.setListaCuentas(listaCuentas);
        cancelarVentasController.mostrarVentas();
    }

    @FXML
    void onBtnMostrar_menuVenta(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mostrarVentas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        MostrarVentasController mostrarVentasController = fxmlLoader.getController();
        mostrarVentasController.setStage(stage);
        mostrarVentasController.setListaCuentas(listaCuentas);
        mostrarVentasController.mostrarVentas();
    }

    @FXML
    void onSalirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        MenuPrincipalController menuPrincipalController = fxmlLoader.getController();
        menuPrincipalController.setStage(stage);
        menuPrincipalController.setListaCuentas(listaCuentas);
    }

}
