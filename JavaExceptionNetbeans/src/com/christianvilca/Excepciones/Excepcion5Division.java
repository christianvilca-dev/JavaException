/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christianvilca.Excepciones;

/**
 *
 * @author Christian
 */
public class Excepcion5Division {
    public void dividir(){
        // No tiene try catch porque "Excepcion5" es una excepcion no verificada
        // No es obligatorio, pero es necesario para atrapar la excepcion y que no se detenga el programa
        divide(10,1); 
    }
    
    // si encuentra una excepcion lanzara Excepcion5
    public void divide(int a, int b) throws Excepcion5{ // "Excepcion5" es una excepcion no verificada
        if (b==1) {
            throw new Excepcion5();
        } else {
            System.out.println(a/b);
        }
    }
    
    public static void main(String[] args) {
        new Excepcion5Division().dividir();
    }
}
