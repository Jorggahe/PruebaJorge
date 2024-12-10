/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Scanner;

/**
 * Pida 10 números por teclado y saque lo siguiente por pantalla: - Suma de esos
 * 10 números. - Cuántos números positivos hay. - Cuántos números negativos hay.
 */
public class Ej1 {

    public static void main(String[] args) {
        int numerosIntroducidos[] = new int[10];
        int i = 0, contPostivos = 0, contNegativos = 0, suma = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce 10 números:");
        for (i = 0; i < numerosIntroducidos.length; i++) {
            numerosIntroducidos[i] = reader.nextInt();
            suma = suma + numerosIntroducidos[i];
            if (numerosIntroducidos[i] > 0) {
                contPostivos++;
            } else {
                contNegativos++;
            }
        }
        System.out.println("La suma total es " + suma);
        System.out.println("Hay " + contPostivos + " números positivos");
        System.out.println("Hay " + contNegativos + " números negativos");
    }
}
