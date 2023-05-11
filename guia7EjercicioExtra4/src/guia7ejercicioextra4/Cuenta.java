/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra4;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {}

    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el saldo inicial de la cuenta: ");
        this.saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Introduce el titular de la cuenta: ");
        this.titular = scanner.nextLine();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("No se puede retirar más dinero del que hay en la cuenta.");
        } else {
            this.saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de la cuenta. El nuevo saldo es " + this.saldo + ".");
        }
    }
}
