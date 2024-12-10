/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Scanner;

/**
 * Enunciado: Sea un lector de caracteres. El usuario introducir� una frase
 * inicial. Despu�s, podr� elegir un n�mero, y se dir� por pantalla qu� letra
 * ocupa ese lugar. Ojo: date cuenta de que lo m�s intuitivo para el usuario es
 * que la primera letra sea el n�mero 1, aunque en el c�digo interno del
 * programa se suela empezar por 0. Ten en cuenta esa conversi�n. Por ejemplo:
 * en "Mi mam� me mima", si el usuario dice 1 se devolver� una M.
 *
 * @author Jorge
 */
public class Ej5 {

    public static void main(String[] args) {
        int i = 0;
        int posicionLetra = 0;
        String fraseIntroducida = "";
        String resultado = "";
        String frase[] = null;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        fraseIntroducida = reader.nextLine();
        resultado = fraseIntroducida.replaceAll(" ", "");
        frase = new String[resultado.length() + 1];
        for (i = 0; i < resultado.length(); i++) {
            frase[i] = resultado.substring(i, i + 1);
        }
        System.out.println("Introduce un n�mero: ");
        try {
            posicionLetra = reader.nextInt();
            System.out.println("El caracter que ocupa el lugar " + posicionLetra + " es " + frase[posicionLetra - 1]);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("ERROR: el n�mero introducido no est� dentro del rango");
        }
    }

}
