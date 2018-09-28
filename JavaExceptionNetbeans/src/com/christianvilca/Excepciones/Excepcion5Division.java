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
        try {
            divide(10,1); 
        } catch (Excepcion5 edu) {
            System.out.println(edu.getMessage());
        }
        System.out.println("Terminado");
    }
    
    // si encuentra una excepcion lanzara Excepcion5
    public void divide(int a, int b) throws Excepcion5{ // "Excepcion5" es una excepcion no verificada
        if (b==1) {
            throw new Excepcion5("Dividir po uno no es un reto, ");
        } else {
            System.out.println(a/b);
        }
    }
    
    public static void main(String[] args) {
        new Excepcion5Division().dividir(); 
    }
        ////////////////////////////////////////////////
//    RESULTADO PASANDO EL PARAMENTRO A LA CLASE "Excepcion5"
//    Dividir po uno no es un reto, No voy a dividir por uno.
//    Terminado
    ////////////////////////////////////////////////
//    RESULTADO DEL TRY CATCH EN EL METODO "dividir()"
//    No voy a No voy a dividir por uno.
//    Terminado
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
