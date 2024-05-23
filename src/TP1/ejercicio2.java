/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

import java.util.Scanner;

/**
 *
 * @author cucus
 */

public class ejercicio2 {
    
    public static void main(String[] args) {
       

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese la nota del primer parcial:");
            double primerParcial = scanner.nextDouble();
            
            System.out.println("Ingrese la nota del segundo parcial:");
            double segundoParcial = scanner.nextDouble();
            
            System.out.println("Ingrese la nota del tercer parcial:");
            double tercerParcial = scanner.nextDouble();
            
            
            double promedio = (primerParcial + segundoParcial + tercerParcial) / 3.0;
            
         
            if (promedio >= 8.0) {
                System.out.println("¡Felicidades! Estás promocionado con un promedio de " + promedio);
            } else {
                System.out.println("Lo siento, no estás promocionado. Tu promedio es " + promedio);
            }
        }
    }

}
    

