/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author cucus
 */
    public class OperacionesMatematicas {

    
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: division por cero.");
            return 0;
        }
    }

    
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: division por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        OperacionesMatematicas calculadora = new OperacionesMatematicas();

        
        int sumaEnteros = calculadora.sumar(5, 3);
        System.out.println("Suma de enteros: " + sumaEnteros);

        double restaDecimales = calculadora.restar(7.5, 2.3);
        System.out.println("Resta de decimales: " + restaDecimales);

        int divisionEnteros = calculadora.dividir(10, 2);
        System.out.println(divisionEnteros + "Division de enteros: ");

        double multiplicacionDecimales = calculadora.multiplicar(2.5, 4.0);
        System.out.println("Multiplicacion de decimales: " + multiplicacionDecimales);
    }
}


