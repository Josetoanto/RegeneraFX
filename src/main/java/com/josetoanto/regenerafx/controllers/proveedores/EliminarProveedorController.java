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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EliminarProveedorController {

    @FXML
    private TextField idEliminar;

    @FXML
    private Label lbl_Advertencia;

    @FXML
    private Text nameP_eliminarProveedor;

    @FXML
    private Text telefono_eliminarProveedor;
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
            if (idEliminar.getText().equals(proveedor.getIDProveedor())){
                lbl_Advertencia.setText("Proveedor encontrado");
                nameP_eliminarProveedor.setText(proveedor.getNameProveedor());
                telefono_eliminarProveedor.setText(proveedor.getNumProveedor());
            } else {
                lbl_Advertencia.setText("Proveedor no encontrado");
                nameP_eliminarProveedor.setText("");
                telefono_eliminarProveedor.setText("");
            }
        }
    }

    @FXML
    void onEliminarClick(MouseEvent event) {
        int auxEli = -1;
        int aux = 0;
        for (Proveedor proveedor: listaCuentas.get(usuario).getListaProveedores()){
            if (proveedor.getIDProveedor().equals(idEliminar.getText())){
                auxEli = aux;
            }
            aux ++;
        }
        if (auxEli > -1){
            listaCuentas.get(usuario).getListaProveedores().remove(auxEli);
            lbl_Advertencia.setText("Proveedor eliminado con exito");
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

