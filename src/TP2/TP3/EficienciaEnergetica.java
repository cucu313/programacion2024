/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.TP3;

/**
 *
 * @author cucus
 */
    public class EficienciaEnergetica {
    
    public static double calcularAhorroEnergia(double reduccionConsumo) {
        return Math.sqrt(reduccionConsumo);
    }

    
    public static double maxConsumoEnergetico(double... consumos) {
        double max = Double.MIN_VALUE;
        for (double consumo : consumos) {
            if (consumo > max) {
                max = consumo;
            }
        }
        return max;
    }

  
    public static double minConsumoEnergetico(double... consumos) {
        double min = Double.MAX_VALUE;
        for (double consumo : consumos) {
            if (consumo < min) {
                min = consumo;
            }
        }
        return min;
    }

    public static void main(String[] args) {
    
        double reduccionConsumo = 1000; 
        double ahorroAnual = calcularAhorroEnergia(reduccionConsumo);
        System.out.println("El ahorro de energia anual en una casa inteligente es: " + ahorroAnual + " kWh");

       
        double consumoTV = 500;
        double consumoLavadora = 300; 
        double consumoNevera = 700; 

        double maxConsumo = maxConsumoEnergetico(consumoTV, consumoLavadora, consumoNevera);
        double minConsumo = minConsumoEnergetico(consumoTV, consumoLavadora, consumoNevera);

        System.out.println("El maximo consumo entre los electrodomesticos es: " + maxConsumo + " kWh");
        System.out.println("El minimo consumo entre los electrodomesticos es: " + minConsumo + " kWh");
    }
}

