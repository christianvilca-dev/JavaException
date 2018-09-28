/*
 * EXCEPCIONES ENCADENADAS (Desde la version 1.4 de la plataforma 2)
 * 
 * - Util en el desarrollo en capas (BD, negocio, presentacion9
 */
package com.christianvilca.Excepciones;

/**
 *
 * @author Christian
 */
public class Excepcion4 {

    public Excepcion4() {
        try {
            superior();
        } catch (Exception e) {
            // Se imprime toda la pila de todas las excepciones encontradas
            e.printStackTrace();
//            e.getMessage() // Solo devuelve la excepcion del metodo "superior"
        }
    }
    
    public void superior() throws Exception {
        try {
            intermedio();
        } catch (Exception e) {
            throw new Exception("Excepcion superior", e);
        }
    }
    
    public void intermedio() throws Exception{
        try {
            inferior();
        } catch (Exception e) { // Atrapa la excepcion del metodo "inferior"
            throw new Exception("Excepcion intermedia", e);
        }
    }
    public void inferior() throws Exception {
        throw  new Exception("Excepcion inferior");
    }
    
    public static void main(String[] args) {
        new Excepcion4();
    }
    /////////////////////////////////////////////////////////////
//    java.lang.Exception: Excepcion superior
//	at com.christianvilca.Excepciones.Excepcion4.superior(Excepcion4.java:27)
//	at com.christianvilca.Excepciones.Excepcion4.<init>(Excepcion4.java:15)
//	at com.christianvilca.Excepciones.Excepcion4.main(Excepcion4.java:43)
//Caused by: java.lang.Exception: Excepcion intermedia
//	at com.christianvilca.Excepciones.Excepcion4.intermedio(Excepcion4.java:35)
//	at com.christianvilca.Excepciones.Excepcion4.superior(Excepcion4.java:25)
//	... 2 more
//Caused by: java.lang.Exception: Excepcion inferior
//	at com.christianvilca.Excepciones.Excepcion4.inferior(Excepcion4.java:39)
//	at com.christianvilca.Excepciones.Excepcion4.intermedio(Excepcion4.java:33)
//	... 3 more
//BUILD SUCCESSFUL (total time: 0 seconds)
    /////////////////////////////////////////////////////////////
    // Lanzara una excepcion al metodo que llame a este metodo en especifico
    void metodo() throws Exception {
        try {
            // Hacer algo
        } catch (Exception e) {
            System.out.println("Se maneja la excepcion");
            // Lanzamos una nueva excepcion para que sea atrapada por el bloque try catch que atrapo al metodo 
            throw new Exception("Estoy lanzando", e);
        }
    }
}
