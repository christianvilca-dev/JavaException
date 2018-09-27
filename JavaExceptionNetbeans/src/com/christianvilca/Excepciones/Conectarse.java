/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christianvilca.Excepciones;


import java.sql.*;
import java.util.Properties;
/**
 *
 * @author Christian
 */
public class Conectarse {

    public Conectarse() {
    
    }
    
    public void conectar() {
        try {
            Class.forName("org.una.Driver"); // https://jdbc.postgresql.org/
            String url="jdbc:postgresql://localhost:5432/test"; //5432 
            Properties props = new Properties();
//            props.setProperty("user","postgres");
            props.setProperty("user","ursprueba");
            props.setProperty("password","abcd.1234");
            Connection conn= DriverManager.getConnection(url, props);
            Statement sentencia = conn.createStatement();
            ResultSet resultados = sentencia.executeQuery("select * from usuario");
            while(resultados.next()){
                System.out.print("id: "+resultados.getString(1));
                System.out.print("\t");
                System.out.println("Nombre: " + resultados.getString(2));
            }
        } catch (ClassNotFoundException | SQLException myException) {
            System.out.println("Excepcion encontrada: " + myException.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conectarse con = new Conectarse();
        con.conectar();
    }
    
}
