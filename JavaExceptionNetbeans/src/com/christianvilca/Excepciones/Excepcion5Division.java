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
    ////////////////////////////////////////////////
//    run:
//Exception in thread "main" com.christianvilca.Excepciones.Excepcion5: No voy a No voy a dividir por uno.
//	at com.christianvilca.Excepciones.Excepcion5Division.divide(Excepcion5Division.java:22)
//	at com.christianvilca.Excepciones.Excepcion5Division.dividir(Excepcion5Division.java:16)
//	at com.christianvilca.Excepciones.Excepcion5Division.main(Excepcion5Division.java:29)
//C:\Users\Christian\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)
        ////////////////////////////////////////////////
}
