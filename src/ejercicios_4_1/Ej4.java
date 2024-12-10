/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Leer la altura de N personas (hasta que el usuario quiera, momento en el que
 * introducir� un 0). El m�ximo que soporta el programa son 10 alturas. Al
 * finalizar, se tendr� que mostrar por pantalla la altura media, y el n�mero de
 * personas que est�n por encima de dicha media. NOTA: se entiende que una
 * altura razonable est� entre los 0,5 metros (m�nimo) y la mayor altura
 * registrada como R�cord Guiness (m�ximo).
 */
public class Ej4 {

    public static void main(String[] args) {
        float altura[] = new float[10];
        int i = 0;
        float alturaIntroducida = 0;
        float alturaMedia = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce la altura de las personas (m�x 10):");
        try {
            for (i = 0; i < altura.length; i++) {
                alturaIntroducida = reader.nextFloat();
                if (alturaIntroducida == 0) {
                    break;
                } else if (alturaIntroducida < 0.5 || alturaIntroducida > 2.72) {
                    throw new ArithmeticException("ERROR: La altura introducida no es v�lida");
                } else {
                    altura[i] = alturaIntroducida;
                    alturaMedia = alturaMedia + altura[i];
                }
            }
            System.out.println("La altura media es " + (alturaMedia / i) + " metros");
        } catch (Exception ime) {
            System.out.println("ERROR: La altura introducida no es v�lida");
        }
    }
}
