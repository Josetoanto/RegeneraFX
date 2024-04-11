package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Producto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ModificarProductoController {

    @FXML
    private TextField cantidadProducto;

    @FXML
    private TextField codigoModificar_buscarProducto;

    @FXML
    private TextField codigoProducto;

    @FXML
    private Label lblAdvertencia;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField precioProducto;
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
    void buscadorDeProducto(KeyEvent event) {
        for (Producto producto:listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()){
            if (codigoModificar_buscarProducto.getText().equals(producto.getCodigoProductoID())){
                lblAdvertencia.setText("Producto encontrado,listo para modificar");
                cantidadProducto.setText(String.valueOf(producto.getQuantity()));
                nombreProducto.setText(producto.getName());
                codigoProducto.setText(producto.getCodigoProductoID());
                precioProducto.setText(String.valueOf(producto.getPriece()));
                return;
            } else {
                lblAdvertencia.setText("Producto no encontrado");
                cantidadProducto.setText("");
                nombreProducto.setText("");
                codigoProducto.setText("");
                precioProducto.setText("");
            }
        }
    }

    @FXML
    void onConfirmarClick(MouseEvent event) {
        int auxEditar = -1;
        int aux = 0;
        for (Producto producto:listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()){
            if (codigoModificar_buscarProducto.getText().equals(producto.getCodigoProductoID())){
                auxEditar = aux;
            }
            aux++;
        }
        if (auxEditar>-1){
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(auxEditar).setCodigoProductoID(codigoProducto.getText());
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(auxEditar).setName(nombreProducto.getText());
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(auxEditar).setPriece(Float.parseFloat(precioProducto.getText()));
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(auxEditar).setQuantity(Integer.parseInt(cantidadProducto.getText()));
            lblAdvertencia.setText("Producto editado con exito");
        }
    }

    @FXML
    void onSalirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inventarioMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InventarioMenuController inventarioMenuController = fxmlLoader.getController();
        inventarioMenuController.setStage(stage);
        inventarioMenuController.setListaCuentas(listaCuentas);
        inventarioMenuController.setUsuario(usuario);
    }

}
