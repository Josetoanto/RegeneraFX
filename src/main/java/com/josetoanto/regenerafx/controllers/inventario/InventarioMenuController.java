package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class InventarioMenuController {

    @FXML
    private Label usuarioLabel_menu;
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
    void onBtnAgregar_menuInventario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("agregarProducto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        AgregarProductoController agregarProductoController = fxmlLoader.getController();
        agregarProductoController.setListaCuentas(listaCuentas);
        agregarProductoController.setUsuario(usuario);
        agregarProductoController.setStage(stage);
        agregarProductoController.actualizarTiposDeProductos();
    }

    @FXML
    void onBtnEliminar_menuInventario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("eliminarProducto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        EliminarProductoController eliminarProductoController = fxmlLoader.getController();
        eliminarProductoController.setListaCuentas(listaCuentas);
        eliminarProductoController.setUsuario(usuario);
        eliminarProductoController.setStage(stage);
    }

    @FXML
    void onBtnModificar_menuInventario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("modificarProducto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ModificarProductoController modificarProductoController = fxmlLoader.getController();
        modificarProductoController.setListaCuentas(listaCuentas);
        modificarProductoController.setUsuario(usuario);
        modificarProductoController.setStage(stage);
    }

    @FXML
    void onBtnMostrar_menuInventario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mostrarProductos.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        MostrarProductosController mostrarProductosController = fxmlLoader.getController();
        mostrarProductosController.setListaCuentas(listaCuentas);
        mostrarProductosController.setUsuario(usuario);
        mostrarProductosController.setStage(stage);
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
