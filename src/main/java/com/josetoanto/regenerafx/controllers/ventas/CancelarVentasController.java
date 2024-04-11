package com.josetoanto.regenerafx.controllers.ventas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Venta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CancelarVentasController {

    @FXML
    private Text folioCliente_cancelar1;

    @FXML
    private Text folioCliente_cancelar2;

    @FXML
    private Text folioCliente_cancelar3;

    @FXML
    private Text nameCliente_cancelar1;

    @FXML
    private Text nameCliente_cancelar2;

    @FXML
    private Text nameCliente_cancelar3;

    @FXML
    private Text numeroCliente_cancelar1;

    @FXML
    private Text numeroCliente_cancelar2;

    @FXML
    private Text numeroCliente_cancelar3;
    private int usuario;
    private int aux = 0;
    private int aux1 = 1;
    private int aux2 = 2;
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
    void btmAtras(MouseEvent event) {
        if (aux>=3){
            aux = aux-3;
            aux1 = aux1-3;
            aux2 = aux2-3;
            mostrarVentas();
        }
    }

    @FXML
    void btmConfirmar(MouseEvent event) throws IOException {
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

    @FXML
    void btmElimianrVenta3(MouseEvent event) {
        listaCuentas.get(usuario).getListaVentas().remove(aux2);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Borrada");
        alert.setHeaderText("Venta borrada con exito");
        alert.showAndWait();
        mostrarVentas();
    }

    @FXML
    void btmEliminarVenta1(MouseEvent event) {
        listaCuentas.get(usuario).getListaVentas().remove(aux);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Borrada");
        alert.setHeaderText("Venta borrada con exito");
        alert.showAndWait();
        mostrarVentas();
    }

    @FXML
    void btmEliminarVenta2(MouseEvent event) {
        listaCuentas.get(usuario).getListaVentas().remove(aux1);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Borrada");
        alert.setHeaderText("Venta borrada con exito");
        alert.showAndWait();
        mostrarVentas();
    }

    @FXML
    void btmSalir(MouseEvent event)throws IOException {
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

    @FXML
    void btmSiguente(MouseEvent event) {
        if (aux<=listaCuentas.size()) {
            aux = aux + 3;
            aux1 = aux1 + 3;
            aux2 = aux2 + 3;
            mostrarVentas();
        }
    }
    public void mostrarVentas(){
        ArrayList<Venta> listaVentas = listaCuentas.get(usuario).getListaVentas();
        int tamañoListaVentas = listaVentas.size();
        if (tamañoListaVentas > 0) {
            if (aux < tamañoListaVentas) {
                folioCliente_cancelar1.setText(listaVentas.get(aux).getFolio());
                nameCliente_cancelar1.setText(listaVentas.get(aux).getClienteName());
                numeroCliente_cancelar1.setText(listaVentas.get(aux).getClientNum());
            } else {
                folioCliente_cancelar1.setText("");
                nameCliente_cancelar1.setText("");
                numeroCliente_cancelar1.setText("");
            }

            if (aux1 < tamañoListaVentas) {
                folioCliente_cancelar2.setText(listaVentas.get(aux1).getFolio());
                nameCliente_cancelar2.setText(listaVentas.get(aux1).getClienteName());
                numeroCliente_cancelar2.setText(listaVentas.get(aux1).getClientNum());
            } else {
                folioCliente_cancelar2.setText("");
                nameCliente_cancelar2.setText("");
                numeroCliente_cancelar2.setText("");
            }
            if (aux2 < tamañoListaVentas) {
                folioCliente_cancelar3.setText(listaVentas.get(aux2).getFolio());
                nameCliente_cancelar3.setText(listaVentas.get(aux2).getClienteName());
                numeroCliente_cancelar3.setText(listaVentas.get(aux2).getClientNum());
            } else {
                folioCliente_cancelar3.setText("");
                nameCliente_cancelar3.setText("");
                numeroCliente_cancelar3.setText("");
            }
        } else {
            folioCliente_cancelar1.setText("");
            nameCliente_cancelar1.setText("");
            numeroCliente_cancelar1.setText("");
            folioCliente_cancelar2.setText("");
            nameCliente_cancelar2.setText("");
            numeroCliente_cancelar2.setText("");
            folioCliente_cancelar3.setText("");
            nameCliente_cancelar3.setText("");
            numeroCliente_cancelar3.setText("");
        }
    }
}
