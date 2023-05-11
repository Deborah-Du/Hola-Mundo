// En la clase Main, se crea una instancia de la clase Libro y se llama //
//a los métodos cargarLibro e informarLibro//

package main;

import entidad.Libro;


   public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.cargarLibro();
        libro.informarLibro();
    }
} 
