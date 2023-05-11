/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra4;

/**
 *
 * @author debor
 */
public class Main {
  public static void main(String[] args) {
      Cuenta cuenta = new Cuenta();
      cuenta.crearCuenta();
      cuenta.retirarDinero(500);
      cuenta.retirarDinero(600);
  }
}