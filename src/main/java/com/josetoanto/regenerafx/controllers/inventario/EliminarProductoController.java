package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Producto;
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

public class EliminarProductoController {

    @FXML
    private Label advertencia;

    @FXML
    private TextField codigoEliminar_eliminarProducto;

    @FXML
    private Text codigo_eliminarProducto;

    @FXML
    private Text nameP_eliminarProducto;

    @FXML
    private Text precio_eliminarProducto;
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
    void buscadorProductos(KeyEvent event) {
        if (listaCuentas.isEmpty()){
            advertencia.setText("Inventario vacio");
        } else {
            for (Producto producto : listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()) {
                if (codigoEliminar_eliminarProducto.getText().equals(producto.getCodigoProductoID())) {
                    System.out.println(producto.toString());
                    codigo_eliminarProducto.setText(producto.getCodigoProductoID());
                    nameP_eliminarProducto.setText(producto.getName());
                    precio_eliminarProducto.setText(String.valueOf(producto.getPriece()));
                    advertencia.setText("Producto encontrado");
                    return;
                } else {
                    advertencia.setText("Producto no encontrado");
                    codigo_eliminarProducto.setText("");
                    nameP_eliminarProducto.setText("");
                    precio_eliminarProducto.setText("");
                }
            }
        }
    }

    @FXML
    void onEliminarClick(MouseEvent event){
        int auxEliminar = -1;
        int aux = 0;
        for (Producto producto:listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()){
            if (codigoEliminar_eliminarProducto.getText().equals(producto.getCodigoProductoID())){
                auxEliminar = aux;
            }
        }
        if (auxEliminar>-1){
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().remove(auxEliminar);
            advertencia.setText("Producto eliminado con exito");
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
