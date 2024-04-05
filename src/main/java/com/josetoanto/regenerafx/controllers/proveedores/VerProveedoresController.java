package com.josetoanto.regenerafx.controllers.proveedores;

import com.josetoanto.regenerafx.Main;
import com.josetoanto.regenerafx.models.Cuenta;
import com.josetoanto.regenerafx.models.Proveedor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class VerProveedoresController {

    @FXML
    private Text nameProveedor_verProveedores;

    @FXML
    private Text nameProveedor_verProveedores1;

    @FXML
    private Text nameProveedor_verProveedores2;


    @FXML
    private Text numeroProveedor_verProveedores;

    @FXML
    private Text numeroProveedor_verProveedores1;

    @FXML
    private Text numeroProveedor_verProveedores2;


    @FXML
    private Text numero_verProveedores;

    @FXML
    private Text numero_verProveedores1;

    @FXML
    private Text numero_verProveedores2;

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

    private int aux = 0;
    private int aux1 = 1;
    private int aux2 = 2;
    @FXML
    void btmAtras(MouseEvent event) {
        if (aux >= 3) {
            aux = aux - 3;
            aux1 = aux1 - 3;
            aux2 = aux2 - 3;
            mostrarProveedores();
        }
    }

    @FXML
    void btmSiguente(MouseEvent event) {
        int tamañoListaProveedores = listaCuentas.get(usuario).getListaProveedores().size();
        if (aux + 3 < tamañoListaProveedores) {
            aux = aux + 3;
            aux1 = aux1 + 3;
            aux2 = aux2 + 3;
            mostrarProveedores();
        }
    }

    @FXML
    void onConfirmarClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proveedoresMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ProveedoresMenuController proveedoresMenuController = fxmlLoader.getController();
        proveedoresMenuController.setListaCuentas(listaCuentas);
        proveedoresMenuController.setUsuario(usuario);
        proveedoresMenuController.setStage(stage);
    }

    @FXML
    void onSalirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("proveedoresMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        ProveedoresMenuController proveedoresMenuController = fxmlLoader.getController();
        proveedoresMenuController.setListaCuentas(listaCuentas);
        proveedoresMenuController.setUsuario(usuario);
        proveedoresMenuController.setStage(stage);
    }
    public void mostrarProveedores() {
        ArrayList<Proveedor> listaProveedores = listaCuentas.get(usuario).getListaProveedores();
        int tamañoListaProveedores = listaProveedores.size();

        if (tamañoListaProveedores > 0) {
            if (aux < tamañoListaProveedores) {
                nameProveedor_verProveedores.setText(listaProveedores.get(aux).getNameProveedor());
                numero_verProveedores.setText(listaProveedores.get(aux).getNumProveedor());
                numeroProveedor_verProveedores.setText(listaProveedores.get(aux).getIDProveedor());
            } else {
                nameProveedor_verProveedores.setText("");
                numero_verProveedores.setText("");
                numeroProveedor_verProveedores.setText("");
            }

            if (aux1 < tamañoListaProveedores) {
                nameProveedor_verProveedores1.setText(listaProveedores.get(aux1).getNameProveedor());
                numero_verProveedores1.setText(listaProveedores.get(aux1).getNumProveedor());
                numeroProveedor_verProveedores1.setText(listaProveedores.get(aux1).getIDProveedor());
            } else {
                nameProveedor_verProveedores1.setText("");
                numero_verProveedores1.setText("");
                numeroProveedor_verProveedores1.setText("");
            }

            if (aux2 < tamañoListaProveedores) {
                nameProveedor_verProveedores2.setText(listaProveedores.get(aux2).getNameProveedor());
                numero_verProveedores2.setText(listaProveedores.get(aux2).getNumProveedor());
                numeroProveedor_verProveedores2.setText(listaProveedores.get(aux2).getIDProveedor());
            } else {
                nameProveedor_verProveedores2.setText("");
                numero_verProveedores2.setText("");
                numeroProveedor_verProveedores2.setText("");
            }
        } else {
            nameProveedor_verProveedores.setText("");
            numero_verProveedores.setText("");
            numeroProveedor_verProveedores.setText("");
            nameProveedor_verProveedores1.setText("");
            numero_verProveedores1.setText("");
            numeroProveedor_verProveedores1.setText("");
            nameProveedor_verProveedores2.setText("");
            numero_verProveedores2.setText("");
            numeroProveedor_verProveedores2.setText("");
        }
    }
}
