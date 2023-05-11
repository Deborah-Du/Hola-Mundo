/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejerextra1;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Main {
   
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mes = scanner.nextLine();

        while (!mes.equals(mesSecreto)) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mes = scanner.nextLine();
        }

        System.out.println("¡Ha acertado!");
    }
}

