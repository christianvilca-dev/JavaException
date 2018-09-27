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
        Connection conn= null;
        Statement sentencia = null;
        ResultSet resultados = null;
        try {
            Class.forName("org.postgresql.Driver"); // https://jdbc.postgresql.org/
            String url="jdbc:postgresql://localhost:5432/test"; //5432 
            Properties props = new Properties();
//            props.setProperty("user","postgres");
            props.setProperty("user","ursprueba");
            props.setProperty("password","abcd.12345");
            conn= DriverManager.getConnection(url, props);
            sentencia = conn.createStatement();
            resultados = sentencia.executeQuery("select * from usuario");
            while(resultados.next()){
                System.out.print("id: "+resultados.getString(1));
                System.out.print("\t");
                System.out.println("Nombre: " + resultados.getString(2));
            }
        } catch (ClassNotFoundException | SQLException myException) {
            System.out.println("Excepcion encontrada: " + myException.getMessage());
        } finally { // recomendada para liberar recursos    
            if (resultados != null) try { resultados.close(); } catch (SQLException sqle) {}
            if (sentencia != null) try { sentencia.close(); } catch (SQLException sqle) {}
            if (conn != null) try { conn.close(); } catch (SQLException sqle) {}
        }
    }
    
    public static void main(String[] args) {
        Conectarse con = new Conectarse();
        con.conectar();
    }
    
}
