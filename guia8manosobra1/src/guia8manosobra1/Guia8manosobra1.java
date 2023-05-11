/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8manosobra1;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Guia8manosobra1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        Persona persona = new Persona(nombre, edad);
        mostrarAtributos(persona);
    }

    public static void mostrarAtributos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}