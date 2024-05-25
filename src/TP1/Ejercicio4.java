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

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el dia:");
            System.out.println("Ingrese el mes (en formato numerico):");
            int mes = scanner.nextInt();    
            System.out.println("Ingrese el anio:");
            int anio = scanner.nextInt();
            
            String trimestre = determinarTrimestre(mes);
            
            System.out.println("La fecha ingresada corresponde al " + trimestre + " trimestre del anio " + anio + ".");
        }
    }

    public static String determinarTrimestre(int mes) {
        String trimestre;

        if (mes >= 1 && mes <= 3) {
            trimestre = "primer";
        } else if (mes >= 4 && mes <= 6) {
            trimestre = "segundo";
        } else if (mes >= 7 && mes <= 9) {
            trimestre = "tercer";
        } else if (mes >= 10 && mes <= 12) {
            trimestre = "cuarto";
        } else {
            trimestre = "invalido";
        }

        return trimestre;
    }
}
