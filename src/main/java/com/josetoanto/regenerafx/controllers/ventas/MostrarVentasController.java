package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Proveedor;
import com.josetoanto.regenerafx.models.Venta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MostrarVentasController {

    @FXML
    private Text cantidadCliente_buscarVenta1;

    @FXML
    private Text cantidadCliente_buscarVenta2;

    @FXML
    private Text cantidadCliente_buscarVenta3;

    @FXML
    private Text nameCliente_BuscarVenta1;

    @FXML
    private Text nameCliente_BuscarVenta2;

    @FXML
    private Text nameCliente_BuscarVenta3;

    @FXML
    private Text numeroCliente_BuscarVenta1;

    @FXML
    private Text numeroCliente_BuscarVenta2;

    @FXML
    private Text numeroCliente_BuscarVenta3;

    @FXML
    private Text total_buscar1;

    @FXML
    private Text total_buscarV2;

    @FXML
    private Text total_buscarV3;
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
            mostrarVentas();
        }
    }

    @FXML
    void btmSiguente(MouseEvent event) {
        if (aux<=listaCuentas.size()) {
            aux = aux + 3;
            aux1 = aux1 + 3;
            aux2 = aux2 + 3;
            mostrarVentas();
        }
    }

    @FXML
    void onSalirBotonClick(MouseEvent event)throws IOException {
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
    public void mostrarVentas(){
            ArrayList<Venta> listaVentas = listaCuentas.get(usuario).getListaVentas();
            int tamañoListaVentas = listaVentas.size();
            if (tamañoListaVentas > 0) {
                if (aux < tamañoListaVentas) {
                    nameCliente_BuscarVenta1.setText(listaCuentas.get(usuario).getListaVentas().get(aux).getClienteName());
                    cantidadCliente_buscarVenta1.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux).getCantidadDeProducto()));
                    numeroCliente_BuscarVenta1.setText(listaCuentas.get(usuario).getListaVentas().get(aux).getClientNum());
                    total_buscar1.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux).getTotal()));
                } else {
                    nameCliente_BuscarVenta1.setText("");
                    cantidadCliente_buscarVenta1.setText("");
                    numeroCliente_BuscarVenta1.setText("");
                    total_buscar1.setText("");
                }

                if (aux1 < tamañoListaVentas) {
                    nameCliente_BuscarVenta2.setText(listaCuentas.get(usuario).getListaVentas().get(aux1).getClienteName());
                    cantidadCliente_buscarVenta2.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux1).getCantidadDeProducto()));
                    numeroCliente_BuscarVenta2.setText(listaCuentas.get(usuario).getListaVentas().get(aux1).getClientNum());
                    total_buscarV2.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux1).getTotal()));
                } else {
                    nameCliente_BuscarVenta2.setText("");
                    cantidadCliente_buscarVenta2.setText("");
                    numeroCliente_BuscarVenta2.setText("");
                    total_buscarV2.setText("");
                }

                if (aux2 < tamañoListaVentas) {
                    nameCliente_BuscarVenta3.setText(listaCuentas.get(usuario).getListaVentas().get(aux2).getClienteName());
                    cantidadCliente_buscarVenta3.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux2).getCantidadDeProducto()));
                    numeroCliente_BuscarVenta3.setText(listaCuentas.get(usuario).getListaVentas().get(aux2).getClientNum());
                    total_buscarV3.setText(String.valueOf(listaCuentas.get(usuario).getListaVentas().get(aux2).getTotal()));
                } else {
                    nameCliente_BuscarVenta3.setText("");
                    cantidadCliente_buscarVenta3.setText("");
                    numeroCliente_BuscarVenta3.setText("");
                    total_buscarV3.setText("");
                }
            } else {
                nameCliente_BuscarVenta1.setText("");
                cantidadCliente_buscarVenta1.setText("");
                numeroCliente_BuscarVenta1.setText("");
                total_buscar1.setText("");
                nameCliente_BuscarVenta2.setText("");
                cantidadCliente_buscarVenta2.setText("");
                numeroCliente_BuscarVenta2.setText("");
                total_buscarV2.setText("");
                nameCliente_BuscarVenta3.setText("");
                cantidadCliente_buscarVenta3.setText("");
                numeroCliente_BuscarVenta3.setText("");
                total_buscarV3.setText("");
            }
    }
}
