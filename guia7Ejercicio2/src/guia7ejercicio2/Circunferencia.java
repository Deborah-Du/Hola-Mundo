/*Este código define una clase Circunferencia con el atributo privado radio.
También se definen un constructor que recibe el radio como parámetro,
los métodos get y set para el atributo radio, un método crearCircunferencia
para pedir al usuario que ingrese el valor del radio, un método area para
calcular el área de la circunferencia y un método perimetro para calcular
el perímetro de la circunferencia.
 */
package guia7ejercicio2;

import java.util.Scanner;

public class Circunferencia {
   
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        this.radio = scanner.nextDouble();
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
    

