package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear una lista de libros
        List<Libro> libros = new ArrayList<>();

        // Añadir libros a la lista
        libros.add(new Libro("Título 1", "Autor 1", 2022));
        libros.add(new Libro("Título 2", "Autor 2", 2021));
        libros.add(new Libro("Título 3", "Autor 3", 2023));

        // Imprimir la lista de libros
        System.out.println("Listado de libros:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAñoPublicacion() + ")");
        }

        // Buscar un libro por título
        String tituloABuscar = "Título 2";
        Libro libroEncontrado = buscarLibroPorTitulo(libros, tituloABuscar);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo() + " - " + libroEncontrado.getAutor() + " (" + libroEncontrado.getAñoPublicacion() + ")");
        } else {
            System.out.println("No se encontró el libro con el título: " + tituloABuscar);
        }

        // Crear un prestamo
        Prestamo prestamo = new Prestamo(libros.get(0), "Cliente 1", 5);
        System.out.println("Préstamo creado: " + prestamo.getLibro().getTitulo() + " - " + prestamo.getCliente() + " - " + prestamo.getDiasPrestamo());

        // Crear un bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "Perez", 30, "123456789", "Licenciatura en Informática", "2023-01");
        System.out.println("Bibliotecario creado: " + bibliotecario.getNombre() + " - " + bibliotecario.getApellido() + " - " + bibliotecario.getEdad() + " - " + bibliotecario.getCedula() + " - " + bibliotecario.getTitulo() + " - " + bibliotecario.getAnioIngreso());
    }

    // Método para buscar un libro por título
    private static Libro buscarLibroPorTitulo(List<Libro> libros, String tituloABuscar) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloABuscar)) {
                return libro;
            }
        }
        return null;
    }

    // Clase Libro
    static class Libro {
        private String titulo;
        private String autor;
        private int añoPublicacion;

        public Libro(String titulo, String autor, int añoPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.añoPublicacion = añoPublicacion;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAñoPublicacion() {
            return añoPublicacion;
        }
    }

    // Clase Prestamo
    static class Prestamo {
        private Libro libro;
        private String cliente;
        private int diasPrestamo;

        public Prestamo(Libro libro, String cliente, int diasPrestamo) {
            this.libro = libro;
            this.cliente = cliente;
            this.diasPrestamo = diasPrestamo;
        }

        public Libro getLibro() {
            return libro;
        }

        public String getCliente() {
            return cliente;
        }

        public int getDiasPrestamo() {
            return diasPrestamo;
        }
    }

    // Clase Bibliotecario
    static class Bibliotecario extends Empleado {
        private String titulo;
        private String anioIngreso;

        public Bibliotecario(String nombre, String apellido, int edad, String cedula, String titulo, String anioIngreso) {
            super(nombre, apellido, edad, cedula);
            this.titulo = titulo;
            this.anioIngreso = anioIngreso;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAnioIngreso() {
            return anioIngreso;
        }
    }

    // Clase Empleado
    static class Empleado {
        private String nombre;
        private String apellido;
        private int edad;
        private String cedula;

        public Empleado(String nombre, String apellido, int edad, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public String getCedula() {
            return cedula;
        }
    }
}