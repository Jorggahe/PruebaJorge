/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

/**
 * Genere un boleto de loter�a primitiva que dar� una combinaci�n al azar. La
 * loter�a est� compuesta por 6 n�meros entre 1 y 49. Adem�s, hay un reintegro
 * del 0 al 9. Ahora ser� realista: NO se pueden repetir n�meros.
 */
public class Ej2 {

    public static void main(String[] args) {
        int numerosLoteria[] = new int[6];
        int reintegro = 0;
        int i = 0, j = 0;
        int comprobarNumero = 0;

        for (i = 0; i < numerosLoteria.length; i++) {
            comprobarNumero = (int) (Math.floor(Math.random() * 49 + 1));
            for (j = 0; j < i; j++) {
                if (comprobarNumero == numerosLoteria[j]) {
                    break;
                }
            }
            numerosLoteria[i] = comprobarNumero;
        }
        reintegro = (int) (Math.floor(Math.random() * 10));
        System.out.println("Los n�meros del boleto son:");
        for (i = 0; i < numerosLoteria.length; i++) {
            System.out.print(numerosLoteria[i] + " ");
        }
        System.out.println("\nReintegro: " + reintegro);
    }

}
