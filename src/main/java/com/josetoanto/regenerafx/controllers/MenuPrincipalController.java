package com.josetoanto.regenerafx.controllers;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.cuentas.InicioDeSesionController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MenuPrincipalController {

    @FXML
    private Label usuarioLabel_menu;
    private Cuenta usuario;
    private Stage stage;
    private ArrayList<Cuenta> listaCuentas;
    public void setUsuario(Cuenta cuenta) {
        this.usuario = cuenta;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @FXML
    void onBtnInventario_menu(MouseEvent event) {

    }

    @FXML
    void onBtnProveedores_menu(MouseEvent event) {

    }

    @FXML
    void onBtnVenta_menu(MouseEvent event) {

    }

    @FXML
    void onCerrarSesionClick(MouseEvent event) throws IOException {
        for (Cuenta cuenta:listaCuentas){
            if (cuenta.getPassword().equals(usuario.getPassword())&&cuenta.getGmail().equals(usuario.getGmail())){
                cuenta = usuario;
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inicioDeSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InicioDeSesionController inicioDeSesionController = fxmlLoader.getController();
        inicioDeSesionController.setStage(stage);
        inicioDeSesionController.setListaCuentas(listaCuentas);
    }


}
