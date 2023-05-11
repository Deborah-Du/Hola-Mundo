/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import Servicios.CuentaBancariaServicios.CuentaBancariaServicio;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        CuentaBancariaServicios servicios = new CuentaBancariaServicios();

        CuentaBancariaServicios.CuentaBancariaServicio servicio = servicios.new CuentaBancariaServicio();
        CuentaBancaria cuenta = servicio.crearCuenta();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidad = sc.nextDouble();
        servicio.ingresar(cuenta, cantidad);
        servicio.consultarSaldo(cuenta);

        System.out.print("Ingrese la cantidad a retirar: ");
        cantidad = sc.nextDouble();
        servicio.retirar(cuenta, cantidad);
        servicio.consultarSaldo(cuenta);

        System.out.println("Realizando extracción rápida...");
        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);

        servicio.consultarDatos(cuenta);
    }
}