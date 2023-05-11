/*En la clase Main, se crea una instancia de la clase Circunferencia,
se llama al método crearCircunferencia y se muestran los valores del área 
y el perímetro calculados con los métodos area y perimetro.
*/
package main;

import guia7ejercicio2.Circunferencia;

public class Main {
     public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(0);
        circunferencia.crearCircunferencia();
        System.out.println("Área: " + circunferencia.area());
        System.out.println("Perímetro: " + circunferencia.perimetro());
    }
}
    

