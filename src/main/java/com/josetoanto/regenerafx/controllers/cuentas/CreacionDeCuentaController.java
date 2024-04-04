package com.josetoanto.regenerafx.controllers.cuentas;

import com.josetoanto.regenerafx.Main;
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

public class CreacionDeCuentaController {

    @FXML
    private TextField createUsername_newCuenta;

    @FXML
    private Label labelError;

    @FXML
    private TextField newEmail_newCuenta;

    @FXML
    private PasswordField newPassword_newCuenta;

    @FXML
    private PasswordField repeatPassword_newCuenta;
    private ArrayList<Cuenta> listaCuentas;
    private Stage stage;

    @FXML
    void ingresaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inicioDeSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InicioDeSesionController inicioDeSesionController = fxmlLoader.getController();
        inicioDeSesionController.setStage(stage);
        inicioDeSesionController.setListaCuentas(listaCuentas);
    }

    @FXML
    void onBtnIngresar_newCuenta(MouseEvent event) throws IOException {
        if (newPassword_newCuenta.getText().equals(repeatPassword_newCuenta.getText())){
            Cuenta cuenta = new Cuenta();
            cuenta.setName(createUsername_newCuenta.getText());
            cuenta.setGmail(newEmail_newCuenta.getText());
            cuenta.setPassword(newPassword_newCuenta.getText());
            listaCuentas.add(cuenta);
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inicioDeSesion.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Regenera");
            stage.setScene(scene);
            stage.show();
            InicioDeSesionController inicioDeSesionController = fxmlLoader.getController();
            inicioDeSesionController.setListaCuentas(listaCuentas);
            inicioDeSesionController.setStage(stage);
        } else {
            labelError.setText("Contraseña no iguales");
        }
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
