/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.TP3;

/**
 *
 * @author cucus
 */
public class ProcesamientoTweets {
    public static void main(String[] args) {
     
        String tweet1 = "¡Hola, mundo!";
        String tweet2 = "Este es un tweet con más de 280 caracteres, por lo que debe ser recortado para cumplir con el límite de caracteres.";
        String tweet3 = "Un tweet con un hashtag al final.";
        String tweet4 = "Mencionando a @usuario en un tweet.";

        int longitudTweet1 = calcularLongitudTweet(tweet1);
        System.out.println("Longitud del tweet 1: " + longitudTweet1 + " caracteres.");

        boolean cumpleLimiteTweet1 = cumpleLimiteCaracteres(tweet1);
        System.out.println("El tweet 1 cumple con el limite de caracteres: " + cumpleLimiteTweet1);

        String tweet3ConHashtag = agregarHashtag(tweet3, "ejemplo");
        System.out.println("Tweet 3 con hashtag: " + tweet3ConHashtag);

        String usuarioMencionado = extraerUsuario(tweet4);
        System.out.println("Usuario mencionado en el tweet 4: " + usuarioMencionado);
    }

    public static int calcularLongitudTweet(String tweet) {
        return tweet.length();
    }

    public static boolean cumpleLimiteCaracteres(String tweet) {
        return tweet.length() <= 280;
    }

    public static String agregarHashtag(String tweet, String hashtag) {
        return tweet + " #" + hashtag;
    }

    public static String extraerUsuario(String tweet) {
        int indiceArroba = tweet.indexOf('@');
        if (indiceArroba != -1) {
            int indiceEspacio = tweet.indexOf(' ', indiceArroba);
            if (indiceEspacio != -1) {
                return tweet.substring(indiceArroba, indiceEspacio);
            } else {
                return tweet.substring(indiceArroba);
            }
        }
        return "";
    }
}
