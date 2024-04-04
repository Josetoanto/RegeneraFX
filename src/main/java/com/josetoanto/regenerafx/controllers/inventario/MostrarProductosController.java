package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MostrarProductosController {

    @FXML
    private Text codigo_mostrarProducto1;

    @FXML
    private Text codigo_mostrarProducto2;

    @FXML
    private Text codigo_mostrarProducto3;

    @FXML
    private ImageView iconoSalir;

    @FXML
    private Text nameP_mostrarProducto1;

    @FXML
    private Text nameP_mostrarProducto2;

    @FXML
    private Text nameP_mostrarProducto3;

    @FXML
    private Text precio_mostrarProductos1;

    @FXML
    private Text precio_mostrarProductos2;

    @FXML
    private Text precio_mostrarProductos3;
    private int usuario;
    private Stage stage;
    private ArrayList<Cuenta> listaCuentas;

    private int aux = 0;
    private int aux1 = 1;
    private int aux2 = 2;

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
    void btmAtras(MouseEvent event) {
        if (aux>=3){
            aux = aux-3;
            aux1 = aux1-3;
            aux2 = aux2-3;
        }
        mostrarProductos();
    }

    @FXML
    void btmSiguente(MouseEvent event) {
        if (aux<=listaCuentas.size()) {
            aux = aux + 3;
            aux1 = aux1 + 3;
            aux2 = aux2 + 3;
            mostrarProductos();
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

    void mostrarProductos(){
        int tamañoInventario = listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().size();

        if (aux < tamañoInventario) {
            nameP_mostrarProducto1.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux).getName() +
            "("+listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux).getClass().getSimpleName() +")");
            precio_mostrarProductos1.setText(String.valueOf(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux).getPriece()));
            codigo_mostrarProducto1.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux).getCodigoProductoID());
        } else {
            nameP_mostrarProducto1.setText("");
            precio_mostrarProductos1.setText("");
            codigo_mostrarProducto1.setText("");
        }

        if (aux1 < tamañoInventario) {
            precio_mostrarProductos2.setText(String.valueOf(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux1).getPriece()));
            nameP_mostrarProducto2.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux1).getName() +
                    "("+listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux1).getClass().getSimpleName() +")");
            codigo_mostrarProducto2.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux1).getCodigoProductoID());
        } else {
            nameP_mostrarProducto2.setText("");
            precio_mostrarProductos2.setText("");
            codigo_mostrarProducto2.setText("");
        }

        if (aux2 < tamañoInventario) {
            precio_mostrarProductos3.setText(String.valueOf(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux2).getPriece()));
            nameP_mostrarProducto3.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux2).getName() +
                    "("+listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux2).getClass().getSimpleName() +")");
            codigo_mostrarProducto3.setText(listaCuentas.get(usuario).getInventario().mostrarProductoEnStock().get(aux2).getCodigoProductoID());
        } else {
            nameP_mostrarProducto3.setText("");
            precio_mostrarProductos3.setText("");
            codigo_mostrarProducto3.setText("");
        }
    }
}
