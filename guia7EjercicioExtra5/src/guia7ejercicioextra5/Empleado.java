/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra5;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {}

    public void crearEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        this.nombre = scanner.nextLine();
        System.out.print("Introduce la edad del empleado: ");
        this.edad = scanner.nextInt();
        System.out.print("Introduce el salario del empleado: ");
        this.salario = scanner.nextDouble();
    }

    public void calcularAumento() {
        double aumento;
        if (this.edad > 30) {
            aumento = this.salario * 0.1;
        } else {
            aumento = this.salario * 0.05;
        }
        this.salario += aumento;
        System.out.println("El nuevo salario del empleado es " + this.salario + ".");
    }
}

