/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Pida al usuario 5 números enteros (pueden ser positivos y negativos). Después
 * deberá decir cuáles de ellos son PARES O IMPARES. Al final dejar inicializado
 * el array (con todos los valores igual a 0). Capturar excepciones.
 */
public class Ej3 {

    public static void main(String[] args) {
        int numerosIntroducidos[] = new int[5];
        int i = 0;
        int numero = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce 5 números (positivos o negativos):");
        try {
            for (i = 0; i < numerosIntroducidos.length; i++) {
                numero = reader.nextInt();
                numerosIntroducidos[i] = numero;
            }
            for (i = 0; i < numerosIntroducidos.length; i++) {
                if (numerosIntroducidos[i] % 2 == 0) {
                    System.out.println("El número " + numerosIntroducidos[i] + " es PAR");
                } else {
                    System.out.println("El número " + numerosIntroducidos[i] + " es IMPAR");
                }
            }
        } catch (Exception ime) {
            System.out.println("El valor introducido no es válido");
        }
        Arrays.fill(numerosIntroducidos, 0);
    }

}
