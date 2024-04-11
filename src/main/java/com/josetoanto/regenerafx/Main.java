package com.josetoanto.regenerafx;

import com.josetoanto.regenerafx.controllers.cuentas.InicioDeSesionController;
import com.josetoanto.regenerafx.models.Regenera;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

//hola

public class Main extends Application {
    Regenera regenera = new Regenera();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("inicioDeSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Regenera");
        stage.setScene(scene);
        stage.show();
        InicioDeSesionController inicioDeSesionController = fxmlLoader.getController();
        inicioDeSesionController.setListaCuentas(regenera.obtenerListaDeUsuarios());
        inicioDeSesionController.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}