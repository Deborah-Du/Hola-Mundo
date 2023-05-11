/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra1;

/**
 *
 * @author debor
 */
public class Main {
 
  public static void main(String[] args) {
      Cancion cancion1 = new Cancion();
      System.out.println("Canción 1: ");
      cancion1.imprimirInformacion();

      Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen");
      System.out.println("Canción 2: ");
      cancion2.imprimirInformacion();
  }
}

