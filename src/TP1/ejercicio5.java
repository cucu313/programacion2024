/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

/**
 *
 * @author cucus
 */
import java.util.Scanner;
public class ejercicio5 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la coordenada x del punto:");
            int x = scanner.nextInt();
            System.out.println("Ingrese la coordenada y del punto:");
            int y = scanner.nextInt();    

            if (x > 0 && y > 0) {
                System.out.println("El punto se encuentra en el primer cuadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("El punto se encuentra en el segundo cuadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("El punto se encuentra en el tercer cuadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("El punto se encuentra en el cuarto cuadrante.");
            } else {
                System.out.println("El punto se encuentra en un eje.");
            }
        }
    }
}

