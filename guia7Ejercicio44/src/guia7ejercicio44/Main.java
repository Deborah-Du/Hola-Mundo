/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio44;

/**
 *
 * @author debor
 */
public class Main {
    public static void main(String[] args) {
      Rectangulo rectangulo = new Rectangulo();
      rectangulo.crearRectangulo();
      System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
      System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
      System.out.println("El dibujo del rectángulo es:");
      rectangulo.dibujarRectangulo();
  }
}

