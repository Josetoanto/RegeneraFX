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

    public void addProducto(String name, double price, int quantity) {
        String sql = "INSERT INTO Producto (name, price, quantity) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, quantity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProducto(int id, String name, double price, int quantity) {
        String sql = "UPDATE Producto SET name = ?, price = ?, quantity = ? WHERE codigoProductoID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, quantity);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProducto(int id) {
        String sql = "DELETE FROM Producto WHERE codigoProductoID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
