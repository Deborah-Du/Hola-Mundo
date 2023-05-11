/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra2;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Puntos {
   
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la coordenada x del primer punto: ");
        this.x1 = scanner.nextDouble();
        System.out.print("Introduce la coordenada y del primer punto: ");
        this.y1 = scanner.nextDouble();
        System.out.print("Introduce la coordenada x del segundo punto: ");
        this.x2 = scanner.nextDouble();
        System.out.print("Introduce la coordenada y del segundo punto: ");
        this.y2 = scanner.nextDouble();
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }
}


