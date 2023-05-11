/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private final Scanner sc = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int tamanioTaza) {
        if (cafetera.getCantidadActual() >= tamanioTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
            System.out.println("Se llenó la taza.");
        } else {
            System.out.println("No se pudo llenar la taza. Quedó con " + cafetera.getCantidadActual() + " ml de café.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
    }
}
