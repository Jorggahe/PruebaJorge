/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Scanner;

/**
 * Enunciado: Dé pistas para adivinar el nombre de una ciudad, haciéndolo con un
 * array de Char: a) El programador fija en un String el nombre secreto a
 * adivinar (ejemplo: Valladolid). b) El usuario tiene 3 oportunidades para
 * elegir letras. En cada intento, el programa contará cuántas veces está
 * repetida esa letra en el nombre. (en nuestro ejemplo: si el usuario quiere
 * saber cuántas ?a? hay, se responderá que la ciudad secreta tiene 2). c) Al
 * final, tras obtener las pistas de las 3 letras, el usuario tiene que
 * introducir un nombre de ciudad definitivo como respuesta final. El programa
 * lo comparará con la ciudad secreta (sin distinguir mayúsculas y minúsculas),
 * y dirá si el usuario ha ganado o no. Capturar excepciones.
 *
 * @author Jorge
 */
public class Ej6 {

    public static void main(String[] args) {
        String ciudadSecreta = "Valladolid";
        String respuesta = " ";
        char letraIntroducida = ' ';
        char ciudad[] = new char[ciudadSecreta.length()];
        int i = 0, j = 0;
        int contadorLetras = 0;
        int tamanioLetra = 0;

        for (i = 0; i < ciudadSecreta.length(); i++) {
            ciudad[i] = (ciudadSecreta.substring(i, i + 1)).toLowerCase().charAt(0);
        }
        Scanner reader = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            contadorLetras = 0;
            boolean letraValida = false;
            while (!letraValida) {
                System.out.println("Introduce una letra:");
                String input = reader.nextLine().toLowerCase();
                if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    letraIntroducida = input.charAt(0);
                    letraValida = true;
                } else {
                    System.out.println("Introduce solo una letra (sin números).");
                }
            }
            for (j = 0; j < ciudad.length; j++) {
                if (ciudad[j] == letraIntroducida) {
                    contadorLetras++;
                }
            }
            System.out.println("La ciudad secreta tiene " + contadorLetras + " " + letraIntroducida);
        }
        boolean ciudadValida = false;
        while (!ciudadValida) {
            System.out.println("Introduce la ciudad: ");
            respuesta = reader.nextLine().toLowerCase();
            boolean contieneNumero = false;
            for (int k = 0; k < respuesta.length(); k++) {
                if (Character.isDigit(respuesta.charAt(k))) {
                    contieneNumero = true;
                    break;
                }
            }
            if (contieneNumero) {
                System.out.println("La ciudad no puede contener números.");
            } else {
                ciudadValida = true;
            }
        }
        if (respuesta.equals(ciudadSecreta.toLowerCase())) {
            System.out.println("¡ENHORABUENA! HAS GANADO");
        } else {
            System.out.println("Lo siento, has perdido");
        }
    }

}
