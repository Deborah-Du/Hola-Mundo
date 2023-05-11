/*
Este código define una clase Libro con los atributos ISBN, titulo, autor y
numPaginas. También se definen dos constructores: uno que recibe todos los 
atributos como parámetros y otro vacío. Además, se definen dos métodos: 
cargarLibro para pedir al usuario que ingrese los datos del libro y informarLibro 
para mostrar los datos del libro.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author debor
 */
public class Libro {
     private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro() {}

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el título: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.numPaginas = scanner.nextInt();
    }

    public void informarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}

