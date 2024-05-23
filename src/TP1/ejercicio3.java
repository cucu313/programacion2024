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
public class ejercicio3 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingrese un número positivo de uno o dos dígitos:");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 9) {
                System.out.println("El número tiene un dígito.");
            } else if (numero >= 10 && numero <= 99) {
                System.out.println("El número tiene dos dígitos.");
            } else {
                System.out.println("El número ingresado no es válido.");
            }
        }
    }
}
    

