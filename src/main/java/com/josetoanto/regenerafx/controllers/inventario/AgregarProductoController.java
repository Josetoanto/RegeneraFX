package com.josetoanto.regenerafx.controllers.inventario;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.controllers.cuentas.InicioDeSesionController;
import com.josetoanto.regenerafx.models.Colageno;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Pastillas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AgregarProductoController {

    @FXML
    private TextField cantidadDependiente;

    @FXML
    private TextField cantidadProducto_agregarProducto1;

    @FXML
    private Label lbl_CantidadDependiente;

    @FXML
    private TextField codigoProducto_agregarProducto11;

    @FXML
    private TextField nombreProducto_agregarProducto;

    @FXML
    private TextField precioProducto_agregarProducto112;

    @FXML
    private ComboBox<String> tipoDeProducto;
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
    void confirmarClick(MouseEvent event) throws IOException {
        String tipo = tipoDeProducto.getSelectionModel().getSelectedItem();
        if (tipo != null){
            if (tipo.equals("Pastillas")){
                Pastillas pastillas = new Pastillas();
                pastillas.setName(nombreProducto_agregarProducto.getText());
                pastillas.setCantidadPastillas(Integer.parseInt(cantidadDependiente.getText()));
                pastillas.setCodigoProductoID(codigoProducto_agregarProducto11.getText());
                pastillas.setPriece(Float.parseFloat(precioProducto_agregarProducto112.getText()));
                pastillas.setQuantity(Integer.parseInt(cantidadProducto_agregarProducto1.getText()));
                listaCuentas.get(usuario).getInventario().agregarProducto(pastillas);
            } else if (tipo.equals("Colageno")){
                Colageno colageno = new Colageno();
                colageno.setName(nombreProducto_agregarProducto.getText());
                colageno.setCantidadGr(Integer.parseInt(cantidadDependiente.getText()));
                colageno.setCodigoProductoID(codigoProducto_agregarProducto11.getText());
                colageno.setPriece(Float.parseFloat(precioProducto_agregarProducto112.getText()));
                colageno.setQuantity(Integer.parseInt(cantidadProducto_agregarProducto1.getText()));
                listaCuentas.get(usuario).getInventario().agregarProducto(colageno);
            }
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inventarioMenu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Regenera");
            stage.setScene(scene);
            stage.show();
            InventarioMenuController inventarioMenuController = fxmlLoader.getController();
            inventarioMenuController.setStage(stage);
            inventarioMenuController.setListaCuentas(listaCuentas);
            inventarioMenuController.setUsuario(usuario);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirmacion");
            alert.setHeaderText("Accion realizada con exito");
            alert.showAndWait();
        }
    }

    @FXML
    void onTipoDeProductoClick(ActionEvent event) {
        String tipo = tipoDeProducto.getSelectionModel().getSelectedItem();
        if (tipo != null){
            if (tipo.equals("Colageno")){
                lbl_CantidadDependiente.setText("CANTIDAD DE GR:");
            } else if (tipo.equals("Pastillas")){
                lbl_CantidadDependiente.setText("CANTIDAD DE PASTILLAS:");
            }
        }
    }

    @FXML
    void salirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        MenuPrincipalController menuPrincipalController = fxmlLoader.getController();
        menuPrincipalController.setStage(stage);
        menuPrincipalController.setListaCuentas(listaCuentas);
        menuPrincipalController.setUsuario(usuario);
    }
    public void actualizarTiposDeProductos(){
        tipoDeProducto.getItems().addAll("Pastillas","Colageno");
    }
}
