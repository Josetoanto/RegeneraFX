package com.josetoanto.regenerafx.controllers.cuentas;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.controllers.MenuPrincipalController;
import com.josetoanto.regenerafx.models.Cuenta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class InicioDeSesionController {

    @FXML
    private Label label_Advertencia;

    @FXML
    private PasswordField password_login;

    @FXML
    private TextField correoField;
    private ArrayList<Cuenta> listaCuentas;
    private Stage stage;

    @FXML
    void onBtnIngresar_Login(MouseEvent event) throws IOException {
        for (Cuenta cuenta:listaCuentas){
            if (cuenta.getGmail().equals(correoField.getText()) && cuenta.getPassword().equals(password_login.getText())){
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menuPrincipal.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("Regenera");
                stage.setScene(scene);
                stage.show();
                MenuPrincipalController menuPrincipalController = fxmlLoader.getController();
                menuPrincipalController.setUsuario(cuenta);
                menuPrincipalController.setStage(stage);
                menuPrincipalController.setListaCuentas(listaCuentas);
            } else {
                label_Advertencia.setText("Mail o Contraseña incorrecta");
            }
        }
    }

    @FXML
    void onBtnRegistrarse(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("creacionDeCuenta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        CreacionDeCuentaController creacionDeCuentaController = fxmlLoader.getController();
        creacionDeCuentaController.setListaCuentas(listaCuentas);
        creacionDeCuentaController.setStage(stage);
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas=listaCuentas;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
