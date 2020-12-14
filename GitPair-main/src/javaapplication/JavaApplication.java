/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * El programador A rellenará el main para hacer un programa que pregunte 
 * la edad y el nombre a una persona por teclado y calcule su tiempo de vida en
 *  dias, horas , minutos y segundos con la frase:
 * 
 * Felicidades [nombre] has vivido:
 * x dias
 * xx horas
 * xxxx minutos
 * xxxxxxxxx segundos
 * 
 * @author Pon tu nombre programador A
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Inicializamos las variables necesarias*/
 
        int edat, dies, hores, minuts, segons;
        
        
        
        System.out.println("Introdueix el teu nom");
        /* Preguntamos el nombre del usuario*/
        String nom = Teclat.llegirString();
       
        System.out.println("Introdueix la teva edat");
        /* Preguntamos la edad en años usuario*/
         edat = Teclat.llegirInt();
        
        /*Aqui calculamos los dias*/
        dies = edat * 365;
        
        /*Aqui calculamos las horas*/
        hores = dies * 24;
        
        /*Aqui calculamos los minutos*/
        minuts = hores * 60;
        
        /*Aqui calculamos los segundos*/
        segons = minuts * 60;
        
        /*Salida por pantalla*/
        System.out.println("Has viscut: " + dies + " : " + hores + " : " + minuts 
                + " : " + segons );
    }

}
