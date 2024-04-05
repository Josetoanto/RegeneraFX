package com.josetoanto.regenerafx.controllers;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.cuentas.InicioDeSesionController;
import com.josetoanto.regenerafx.controllers.inventario.InventarioMenuController;
import com.josetoanto.regenerafx.controllers.proveedores.ProveedoresMenuController;
import com.josetoanto.regenerafx.controllers.ventas.VentasMenuController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MenuPrincipalController {

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
    void onBtnInventario_menu(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inventarioMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InventarioMenuController inventarioMenuController = fxmlLoader.getController();
        inventarioMenuController.setListaCuentas(listaCuentas);
        inventarioMenuController.setUsuario(usuario);
        inventarioMenuController.setStage(stage);
    }

    @FXML
    void onBtnProveedores_menu(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proveedoresMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ProveedoresMenuController proveedoresMenuController = fxmlLoader.getController();
        proveedoresMenuController.setStage(stage);
        proveedoresMenuController.setListaCuentas(listaCuentas);
        proveedoresMenuController.setUsuario(usuario);
    }

    @FXML
    void onBtnVenta_menu(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ventasMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        VentasMenuController ventasMenuController = fxmlLoader.getController();
        ventasMenuController.setStage(stage);
        ventasMenuController.setListaCuentas(listaCuentas);
        ventasMenuController.setUsuario(usuario);
    }

    @FXML
    void onCerrarSesionClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inicioDeSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InicioDeSesionController inicioDeSesionController = fxmlLoader.getController();
        inicioDeSesionController.setStage(stage);
        inicioDeSesionController.setListaCuentas(listaCuentas);
    }

}
