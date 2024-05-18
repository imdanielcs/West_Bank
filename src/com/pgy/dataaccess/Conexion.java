/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.dataaccess;

import java.sql.Connection; // Cambiado el paquete de importación
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class Conexion {
    private static Connection con;
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "0903Dani.";
    private static final String url = "jdbc:mysql://localhost:3306/westbank"; 
    // Funtion to connect data base
    public void conector() throws SQLException {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexion a base de datos establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error");
            e.printStackTrace(); 
        }
    }
    public void ejecutarConsulta(String consulta) throws SQLException {
        try (PreparedStatement statement = con.prepareStatement(consulta)) {
            statement.executeUpdate();
    }
        }
    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        Conexion.con = con;
    }

    public Conexion() {
    }

    public PreparedStatement prepareStatement(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public static Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}