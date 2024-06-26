package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Venta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BuscarVentasController {

    @FXML
    private Text cantidadCliente_buscarVenta;

    @FXML
    private TextField folio_buscarVenta;

    @FXML
    private Text nameCliente_BuscarVenta;

    @FXML
    private Text numeroCliente_BuscarVenta;

    @FXML
    private Text total_buscarV1;
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
    void buscarBoton(MouseEvent event) {
        for (Venta venta: listaCuentas.get(usuario).getListaVentas()){
            if (venta.getFolio().equals(folio_buscarVenta.getText())){
                nameCliente_BuscarVenta.setText(venta.getClienteName());
                cantidadCliente_buscarVenta.setText(String.valueOf(venta.getCantidadDeProducto()));
                numeroCliente_BuscarVenta.setText(venta.getClientNum());
                total_buscarV1.setText(String.valueOf(venta.getTotal()));
                return;
            } else {
                nameCliente_BuscarVenta.setText("");
                cantidadCliente_buscarVenta.setText("");
                numeroCliente_BuscarVenta.setText("");
                total_buscarV1.setText("");
            }
        }
    }

    @FXML
    void salirBoton(MouseEvent event) throws IOException {
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

}
