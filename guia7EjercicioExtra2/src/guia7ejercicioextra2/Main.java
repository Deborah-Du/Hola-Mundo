/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra2;

/**
 *
 * @author debor
 */
public class Main {
  
  public static void main(String[] args) {
      Puntos puntos = new Puntos();
      puntos.crearPuntos();
      System.out.println("La distancia entre los dos puntos es: " + puntos.calcularDistancia());
  }
} 

