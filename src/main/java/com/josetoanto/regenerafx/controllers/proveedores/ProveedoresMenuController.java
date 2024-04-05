package com.josetoanto.regenerafx.controllers.proveedores;

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

public class ProveedoresMenuController {

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
    void onBtnAgregar_menuProvedoor(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("agregarProveedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        AgregarProveedorController agregarProveedorController = fxmlLoader.getController();
        agregarProveedorController.setListaCuentas(listaCuentas);
        agregarProveedorController.setUsuario(usuario);
        agregarProveedorController.setStage(stage);
    }

    @FXML
    void onBtnEditar_menuProveedor(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("editarProveedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        EditarProveedorController editarProveedorController = fxmlLoader.getController();
        editarProveedorController.setListaCuentas(listaCuentas);
        editarProveedorController.setUsuario(usuario);
        editarProveedorController.setStage(stage);
    }

    @FXML
    void onBtnEliminar_menuProvedoor(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("eliminarProveedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        EliminarProveedorController eliminarProveedorController = fxmlLoader.getController();
        eliminarProveedorController.setListaCuentas(listaCuentas);
        eliminarProveedorController.setUsuario(usuario);
        eliminarProveedorController.setStage(stage);
    }

    @FXML
    void onBtnVer_menuProveedor(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("verProveedores.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        VerProveedoresController verProveedoresController = fxmlLoader.getController();
        verProveedoresController.setListaCuentas(listaCuentas);
        verProveedoresController.setUsuario(usuario);
        verProveedoresController.setStage(stage);
        verProveedoresController.mostrarProveedores();
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
        menuPrincipalController.setUsuario(usuario);
    }
}
