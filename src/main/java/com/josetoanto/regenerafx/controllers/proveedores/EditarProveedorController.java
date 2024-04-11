package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Proveedor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EditarProveedorController {

    @FXML
    private TextField idEditar;

    @FXML
    private Label lbl_Advertencia;

    @FXML
    private TextField newNumeroTelefono_editarProveedor;

    @FXML
    private TextField newProveedor_editarProveedor;

    @FXML
    private TextField numeroProveedor_editarProveedor;
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
    void buscadorProveedor(KeyEvent event) {
        for (Proveedor proveedor: listaCuentas.get(usuario).getListaProveedores()){
            if (proveedor.getIDProveedor().equals(idEditar.getText())){
                lbl_Advertencia.setText("Proveedor encontrado");
                newNumeroTelefono_editarProveedor.setText(proveedor.getNumProveedor());
                newProveedor_editarProveedor.setText(proveedor.getNameProveedor());
                numeroProveedor_editarProveedor.setText(proveedor.getIDProveedor());
                return;
            } else {
                lbl_Advertencia.setText("Proveedor no encontrado");
                newNumeroTelefono_editarProveedor.setText("");
                newProveedor_editarProveedor.setText("");
                numeroProveedor_editarProveedor.setText("");
            }
        }
    }

    @FXML
    void onConfirmarClick(MouseEvent event) {
        int auxEditar = -1;
        int aux = 0;
        for (Proveedor proveedor: listaCuentas.get(usuario).getListaProveedores()) {
            if (proveedor.getIDProveedor().equals(idEditar.getText())) {
                auxEditar = aux;
            }
            aux++;
        }
        if (aux != -1){
            listaCuentas.get(usuario).getListaProveedores().get(auxEditar).setNameProveedor(newProveedor_editarProveedor.getText());
            listaCuentas.get(usuario).getListaProveedores().get(auxEditar).setNumProveedor(newNumeroTelefono_editarProveedor.getText());
            listaCuentas.get(usuario).getListaProveedores().get(auxEditar).setIDProveedor(numeroProveedor_editarProveedor.getText());
            lbl_Advertencia.setText("Proveedor editado con exito");
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
