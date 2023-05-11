/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {}

    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del primer lado del rectángulo: ");
        this.lado1 = scanner.nextDouble();
        System.out.print("Introduce el valor del segundo lado del rectángulo: ");
        this.lado2 = scanner.nextDouble();
    }

    public double calcularArea() {
        return this.lado1 * this.lado2;
    }
}
    