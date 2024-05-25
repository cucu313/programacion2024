/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.TP3;

import java.util.Scanner;

/**
 *
 * @author cucus
 */
public class TP3validacion_de_contraseñas {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su contrasenia: ");
        String contraseña = scanner.nextLine();

        if (validarFortalezaContraseña(contraseña)) {
            System.out.println("La contrasenia es segura.");
        } else {
            System.out.println("La contrasenia no cumple con los requisitos mínimos de seguridad.");
        }
    }

    public static boolean validarFortalezaContraseña(String contraseña) {
        return tieneAlMenos8Caracteres(contraseña) &&
               contieneAlMenosUnDigito(contraseña) &&
               contieneAlMenosUnCaracterEspecial(contraseña);
    }

    public static boolean tieneAlMenos8Caracteres(String contraseña) {
        return contraseña.length() >= 8;
    }
    public static boolean contieneAlMenosUnDigito(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneAlMenosUnCaracterEspecial(String contrasenia) {
        for (char c : contraseña.toCharArray()) {
            if ("!@#$%^&*()-+=".indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static String construirContraseñaSegura(String[] componentes) {
        StringBuilder contraseñaSegura = new StringBuilder();
        for (String componente : componentes) {
            contraseñaSegura.append(componente);
        }
        return contraseñaSegura.toString();
    }
}

   
    


