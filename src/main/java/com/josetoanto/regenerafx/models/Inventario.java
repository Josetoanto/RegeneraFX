package com.josetoanto.regenerafx.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Stack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Inventario {
    private ArrayList<Producto> productList = new ArrayList<>();

    public ArrayList<Producto> mostrarProductoEnStock() {
        return productList;
    }

    public void agregarProducto(Producto nuevoProducto){
        productList.add(nuevoProducto);
    }

    //Realizacion del CRUD

    String url = "jdbc:mysql://localhost:3306/RegeneraBD?serverTimezone=UTC";
    String username = "root";
    String password = "tono1234"; //ahi estara mi contraseña

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    {
        try {
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Producto");
            while (resultSet.next()){
                System.out.println(resultSet.getString("| name") + " | " +
                        resultSet.getString("priece") + " | " +
                        resultSet.getString("quantity") + " | " +
                        resultSet.getString("codigoProductoID") + " | ");
            }
            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
