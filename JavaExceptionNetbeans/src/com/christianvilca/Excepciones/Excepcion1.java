/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christianvilca.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class Excepcion1 {
//    try{} 
//    catch{}   ->  Recibe un argumento del tipo de excepcion que se genera
//                  Parametro que identifica la excepcion a manejar
//                  Se realiza algun proceso
//                  Opcional si no esta "finaly{}"
//                  Pueden haber varios catch
//                  Entre paramentros puede estar la condicional or(|)
//    finaly{}  ->  Va despues del ultimo "catch{}"
//                  Se ejecuta siempre (exista o no excepcion)
//    
//    throws    ->  "eleva" una excepcion a un metodo de un nivel superior
//                  (envia la excepcion para que sea manejada por el metodo
//                  que solicito un proceso especifico)
//    throw     ->  Lanza una excepcion para que sea manejada en un bloque
//                  try catch
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa para dividir");
        System.out.println();
        try {
            int n, d, r,s;
            System.out.print("Ingrese numero: ");
            n= sc.nextInt();
            System.out.print("Ingrese numero: ");
            d= sc.nextInt();
            r= n/d;
            System.out.println("Resultado: "+r);
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir entre cero");
        } catch (InputMismatchException ime){
            System.out.println("Solo se pueden ingresar numeros");
        } finally { // Util para cerrar conexiones a BD
            System.out.println("Muchas gracias, hasta luego.");
        }
        
    }
}
