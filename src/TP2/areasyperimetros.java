/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author cucus
 */
public class areasyperimetros {
   
    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

  
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
       
        double ladoCuadrado = 5.0;
        System.out.println("Perimetro del cuadrado con lado " + ladoCuadrado + ": " + calcularPerimetroCuadrado(ladoCuadrado));
        System.out.println("Area del cuadrado con lado " + ladoCuadrado + ": " + calcularAreaCuadrado(ladoCuadrado));

        double baseRectangulo = 4.0;
        double alturaRectangulo = 3.0;
        System.out.println("Perimetro del rectangulo con base " + baseRectangulo + " y altura " + alturaRectangulo + ": " + calcularPerimetroRectangulo(baseRectangulo, alturaRectangulo));
        System.out.println("Area del rectangulo con base " + baseRectangulo + " y altura " + alturaRectangulo + ": " + calcularAreaRectangulo(baseRectangulo, alturaRectangulo));

        double radioCirculo = 2.0;
        System.out.println("Perimetro del circulo con radio " + radioCirculo + ": " + calcularPerimetroCirculo(radioCirculo));
        System.out.println("Area del circulo con radio " + radioCirculo + ": " + calcularAreaCirculo(radioCirculo));
    }
}