/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio44;

import java.util.Scanner;

    public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        this.altura = scanner.nextDouble();
    }

    public double calcularSuperficie() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < (int) this.altura; i++) {
            for (int j = 0; j < (int) this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}