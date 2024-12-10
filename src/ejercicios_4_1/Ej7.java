/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_4_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Enunciado: Permita ordenar fechas. El programa solicitará al usuario 5
 * fechas, y las devolverá ordenadas. Puedes usar Arrays.sort(). Ojo: las fechas
 * que entren tienen que estar en formato DD/MM/AAAA, pero piensa una forma
 * sencilla de tratarlas internamente para que se puedan ordenar sin tener que
 * recurrir a métodos específicos de fechas. Pista: pásalo a un número que
 * garantice que fechas más recientes sean mayores que fechas más antiguas.
 *
 * @author Jorge
 */
public class Ej7 {

    public static void main(String[] args) {
        int fechas[] = new int[5];
        String partes[] = new String[3];
        String fechaIntroducida = "";
        int i = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce 5 fechas (formato DD/MM/AAAA):");
        for (i = 0; i < fechas.length; i++) {
            fechaIntroducida = reader.next();
            partes = fechaIntroducida.split("/");
            fechas[i] = Integer.parseInt(partes[2] + partes[1] + partes[0]);
        }
        Arrays.sort(fechas);
        for (i = 0; i < fechas.length; i++) {
        }
    }

}
