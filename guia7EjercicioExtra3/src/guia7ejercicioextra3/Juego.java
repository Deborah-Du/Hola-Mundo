/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra3;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Juego {
   private int intentos;
    private int victoriasJugador1;
    private int victoriasJugador2;

    public Juego() {
        this.intentos = 0;
        this.victoriasJugador1 = 0;
        this.victoriasJugador2 = 0;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jugador 1, introduce un número para que el Jugador 2 lo adivine: ");
        int numero = scanner.nextInt();
        System.out.println("Jugador 2, tienes 5 intentos para adivinar el número.");
        boolean adivinado = false;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce tu " + (i + 1) + "º intento: ");
            int intento = scanner.nextInt();
            this.intentos++;
            if (intento == numero) {
                System.out.println("¡Felicidades! Has adivinado el número en " + this.intentos + " intentos.");
                this.victoriasJugador2++;
                adivinado = true;
                break;
            } else if (intento < numero) {
                System.out.println("El número es más alto.");
            } else {
                System.out.println("El número es más bajo.");
            }
        }
        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número. El número era " + numero + ".");
            this.victoriasJugador1++;
        }
    }
     public void imprimirResultados() {
        System.out.println("Número de intentos: " + this.intentos);
        System.out.println("Victorias del Jugador 1: " + this.victoriasJugador1);
        System.out.println("Victorias del Jugador 2: " + this.victoriasJugador2);
    }
}
