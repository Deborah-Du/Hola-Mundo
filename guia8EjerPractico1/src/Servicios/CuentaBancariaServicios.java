/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author debor
 */
public class CuentaBancariaServicios {

    

    public class CuentaBancariaServicio {

        private final Scanner sc = new Scanner(System.in);

        public CuentaBancaria crearCuenta() {
            System.out.print("Ingrese el número de cuenta: ");
            int numeroCuenta = sc.nextInt();
            System.out.print("Ingrese el DNI del cliente: ");
            long dniCliente = sc.nextLong();
            System.out.print("Ingrese el saldo actual: ");
            double saldoActual = sc.nextDouble();
            return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        }

        public void ingresar(CuentaBancaria cuenta, double cantidad) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        }

        public void retirar(CuentaBancaria cuenta, double cantidad) {
            if (cuenta.getSaldoActual() < cantidad) {
                cuenta.setSaldoActual(0);
            } else {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            }
        }

        public void extraccionRapida(CuentaBancaria cuenta) {
            double maximoExtraccion = cuenta.getSaldoActual() * 0.2;
            retirar(cuenta, maximoExtraccion);
        }

        public void consultarSaldo(CuentaBancaria cuenta) {
            System.out.println("El saldo actual es: " + cuenta.getSaldoActual());
        }

        public void consultarDatos(CuentaBancaria cuenta) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("DNI del cliente: " + cuenta.getDniCliente());
            System.out.println("Saldo actual: " + cuenta.getSaldoActual());
        }
    }
}
