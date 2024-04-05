package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Proveedor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarProveedorController {

    @FXML
    private TextField nameProveedor_agregarProveedor;

    @FXML
    private TextField numeroProveedor_agregarProveedor;

    @FXML
    private TextField numeroTelefono_agregarProveedor;
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
    void onConfirmarClick(MouseEvent event) throws IOException {
        boolean proveedorExistente = false;
        for (Proveedor proveedor: listaCuentas.get(usuario).getListaProveedores()){
            if (proveedor.getIDProveedor().equals(numeroProveedor_agregarProveedor.getText())){
                proveedorExistente = true;
            }
        }
        if (!proveedorExistente){
        Proveedor proveedor = new Proveedor();
        proveedor.setIDProveedor(numeroProveedor_agregarProveedor.getText());
        proveedor.setNameProveedor(nameProveedor_agregarProveedor.getText());
        proveedor.setNumProveedor(numeroTelefono_agregarProveedor.getText());
        listaCuentas.get(usuario).getListaProveedores().add(proveedor);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proveedoresMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ProveedoresMenuController proveedoresMenuController = fxmlLoader.getController();
        proveedoresMenuController.setListaCuentas(listaCuentas);
        proveedoresMenuController.setUsuario(usuario);
        proveedoresMenuController.setStage(stage);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("ID ya existente, intente denuevo");
            alert.setTitle("Error");
            alert.showAndWait();
        }
    }
    @FXML
    void onSalirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proveedoresMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ProveedoresMenuController proveedoresMenuController = fxmlLoader.getController();
        proveedoresMenuController.setListaCuentas(listaCuentas);
        proveedoresMenuController.setUsuario(usuario);
        proveedoresMenuController.setStage(stage);
    }

}
