/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author cucus
 */
import java.util.Scanner;

public class Empleado {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacionCompleta(boolean incluirSalario) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        if (incluirSalario) {
            System.out.println("Salario: " + salario);
        }
    }

    public void incrementarSalario(double incremento) {
        salario += incremento;
    }

    public void incrementarSalarioConPorcentaje(double incremento, double porcentajeDesempeno) {
        salario += salario * (incremento + porcentajeDesempeno);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del empleado:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese la edad del empleado:");
            int edad = scanner.nextInt();
            System.out.println("Ingrese el salario del empleado:");
            double salario = scanner.nextDouble();

            Empleado empleado = new Empleado(nombre, apellido, edad, salario);

            System.out.println("Información completa del empleado:");
            empleado.mostrarInformacionCompleta(true);
            
            System.out.println("Ingrese el incremento de salario:");
            double incremento = scanner.nextDouble();
            empleado.incrementarSalario(incremento);

            System.out.println("Salario actualizado después del incremento: " + empleado.salario);

            System.out.println("Ingrese el incremento adicional de salario:");
            double incrementoAdicional = scanner.nextDouble();
            System.out.println("Ingrese el porcentaje de desempeño:");
            double porcentajeDesempeno = scanner.nextDouble();
            empleado.incrementarSalarioConPorcentaje(incrementoAdicional, porcentajeDesempeno);

            System.out.println("Salario actualizado después del incremento con porcentaje de desempeño: " + empleado.salario);
        }
    }
}
    