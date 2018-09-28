/*
 * EXCEPCIONES PROPIAS
 * 
 * - Excepcion verificada -> Excepcion
 * - Excepcion no verificada -> RunTimeExcepction
 */
package com.christianvilca.Excepciones;

/**
 *
 * @author Christian
 */
public class Excepcion5 extends RuntimeException {
    // Las Excepciones debe terner dos constructores (con argumentos, sin argumentos9
    public Excepcion5(){
        this("No voy a "); // retorna el valor
    }
    public Excepcion5(String str) {
        super(str + "No voy a dividir por uno.");
    }
}
