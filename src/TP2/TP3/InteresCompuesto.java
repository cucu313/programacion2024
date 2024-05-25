/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.TP3;

/**
 *
 * @author cucus
 */
public class InteresCompuesto {
    public static void main(String[] args) {
        double inversionInicial = 10000; 
        double tasaInteresAnual = 0.06; 
        int anios = 5;

        double valorFuturo = calcularValorFuturo(inversionInicial, tasaInteresAnual, anios);
        System.out.println("El valor futuro de la inversion despues de " + anios + " anios es: $" + valorFuturo);
    }

    public static double calcularValorFuturo(double inversionInicial, double tasaInteresAnual, int anios) {
      
        double valorFuturo = inversionInicial * Math.pow(1 + tasaInteresAnual, anios);
        
        valorFuturo = Math.round(valorFuturo * 100.0) / 100.0;
        return valorFuturo;
    }
}