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
public class ejercicio6 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de triangulos:");
            int cantidadTriangulos = scanner.nextInt();
            
            int equilateros = 0;
            int isosceles = 0;
            int escalenos = 0;

            for (int i = 0; i < cantidadTriangulos; i++) {
                System.out.println("Triángulo #" + (i + 1) + ":");
                System.out.println("Ingrese el lado 1:");
                int lado1 = scanner.nextInt();
                System.out.println("Ingrese el lado 2:");
                int lado2 = scanner.nextInt();
                System.out.println("Ingrese el lado 3:");
                int lado3 = scanner.nextInt();

                if (lado1 == lado2 && lado2 == lado3) {
                    equilateros++;
                    System.out.println("Tipo: Equilatero");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    isosceles++;
                    System.out.println("Tipo: Isosceles");
                } else {
                    escalenos++;
                    System.out.println("Tipo: Escaleno");
                }
            }

            System.out.println("Cantidad de triangulos equiláteros: " + equilateros);
            System.out.println("Cantidad de triangulos isósceles: " + isosceles);
            System.out.println("Cantidad de triangulos escalenos: " + escalenos);

            // Determinar el tipo de triángulo con menor cantidad
            String tipoMenorCantidad;
            int menorCantidad = Math.min(Math.min(equilateros, isosceles), escalenos);
            if (menorCantidad == equilateros) {
                tipoMenorCantidad = "equilatero";
            } else if (menorCantidad == isosceles) {
                tipoMenorCantidad = "isosceles";
            } else {
                tipoMenorCantidad = "escaleno";
            }

            System.out.println("El tipo de triangulo con menor cantidad es: " + tipoMenorCantidad);
        }
    }
}


