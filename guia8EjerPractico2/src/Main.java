
import Entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

public class Main {
    public static void main(String[] args) {
        CafeteraServicio servicio;
        servicio = new CafeteraServicio();
        Cafetera cafetera;
        cafetera = new Cafetera(1000, 0);
        Scanner sc = new Scanner(System.in);
        
        servicio.llenarCafetera(cafetera);
        
        System.out.print("Ingrese el tamaño de la taza: ");
        int tamanioTaza = sc.nextInt();
        servicio.servirTaza(cafetera, tamanioTaza);
        
        servicio.vaciarCafetera(cafetera);
        
        System.out.print("Ingrese la cantidad de café a agregar: ");
        int cantidad = sc.nextInt();
        servicio.agregarCafe(cafetera, cantidad);
    }
}