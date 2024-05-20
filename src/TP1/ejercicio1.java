/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ejercicio1 {

   
   
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char opcion = 's'; // Variable para controlar la repeticion del programa
        
        while (opcion == 's' || opcion == 'S') {
            System.out.println("Ingrese la nota del alumno:");
            double nota = scanner.nextDouble();
            
            if (nota < 4) {
                System.out.println("El alumno desaprobo la materia.");
            } else if (nota >= 4 && nota < 10) {
                System.out.println("El alumno aprobo la materia.");
            } else {
                System.out.println("El alumno es sobresaliente");
            }
            
            // Preguntar al usuario si desea ingresar otra nota
            System.out.println("Desea ingresar otra nota (s/n)");
            opcion = scanner.next().charAt(0);
        }
        
        System.out.println("Fin del programa.");
    }
}