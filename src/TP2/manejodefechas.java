/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author cucus
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class manejodefechas {

 
    public static int calcularDiasTranscurridos(int dia, int mes, int anio) {
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return (int) (fechaActual.toEpochDay() - fechaIngresada.toEpochDay());
    }

    public static int calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return (int) (fechaActual.toEpochDay() - fechaIngresada.toEpochDay());
    }

    public static boolean esBisiesto(int anio) {
 
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        
        int diasTranscurridos1 = calcularDiasTranscurridos(15, 5, 2023);
        System.out.println("Días transcurridos desde el 15/05/2023 hasta hoy: " + diasTranscurridos1);

        int diasTranscurridos2 = calcularDiasTranscurridos("25/12/2021");
        System.out.println("Días transcurridos desde el 25/12/2021 hasta hoy: " + diasTranscurridos2);

        int anio = 2024;
        if (esBisiesto(anio)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
}

