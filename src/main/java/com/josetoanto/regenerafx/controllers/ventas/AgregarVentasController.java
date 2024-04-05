package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Producto;
import com.josetoanto.regenerafx.models.Venta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarVentasController {

    @FXML
    private TextField cantidadProducto_agregarVenta;

    @FXML
    private ComboBox<String> cmb_Box_listaProductos;

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
    private int productoSeleccionado;

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
    void onCantidadPuesta(KeyEvent event) {
    int cantidad = Integer.parseInt(cantidadProducto_agregarVenta.getText());
    float total = cantidad * listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(productoSeleccionado).getPriece();
    total_agregarVenta.setText(String.valueOf(total));
    }

    @FXML
    void listoClick(MouseEvent event) throws IOException {
        int cantidad = Integer.parseInt(cantidadProducto_agregarVenta.getText());
        if (cantidad <= listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(productoSeleccionado).getQuantity()){
            Venta venta = new Venta();
            venta.setFolio(folio_agregarVenta.getText());
            venta.setClienteName(nameCliente_agregarVenta.getText());
            venta.setClientNum(numeroPhone_agregarVenta.getText());
            venta.setCodigoProductoID(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(productoSeleccionado).getCodigoProductoID());
            venta.setCantidadDeProducto(Integer.parseInt(cantidadProducto_agregarVenta.getText()));
            float total = cantidad * listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(productoSeleccionado).getPriece();
            venta.setTotal(total);
            listaCuentas.get(usuario).getListaVentas().add(venta);
            listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(productoSeleccionado).restarProducto(cantidad);
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ventasMenu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Regenera");
            stage.setScene(scene);
            stage.show();
            VentasMenuController ventasMenuController = fxmlLoader.getController();
            ventasMenuController.setStage(stage);
            ventasMenuController.setListaCuentas(listaCuentas);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Cantidad de producto insuficiente");
            alert.showAndWait();
        }
    }

    @FXML
    void onComboBoxClick(ActionEvent event) {
        String productoSeleccionadoName = cmb_Box_listaProductos.getSelectionModel().getSelectedItem();
        int aux = 0;
        int productoSeleccionadoAux = -1;
        for (Producto producto: listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()){
            if (producto.getName().equals(productoSeleccionadoName)){
              productoSeleccionadoAux = aux;
            }
            aux++;
        }
        if (productoSeleccionadoAux>-1){
            this.productoSeleccionado=productoSeleccionadoAux;
        }
    }
    public void actualizarProductos(){
        for (Producto producto: listaCuentas.get(usuario).getInventario().mostrarProductoEnStock()){
            cmb_Box_listaProductos.getItems().add(producto.getName());
        }
    }

}
