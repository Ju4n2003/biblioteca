package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Estudiante> estudiantes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante getEstudianteConMasPrestamos() {
        Estudiante maxEstudiante = null;
        int maxPrestamos = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamosRealizados() > maxPrestamos) {
                maxEstudiante = estudiante;
                maxPrestamos = estudiante.getPrestamosRealizados();
            }
        }
        return maxEstudiante;
    }

    public Libro getCantidadLibroIncluidoEnPrestamos() {
        Libro maxLibro = null;
        int maxPrestamos = 0;
        for (Libro libro : libros) {
            if (libro.getPrestamosIncluidos() > maxPrestamos) {
                maxLibro = libro;
                maxPrestamos = libro.getPrestamosIncluidos();
            }
        }
        return maxLibro;
    }

    public void mostrarPrestamosPorBibliotecario() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int prestamosRealizados = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getBibliotecario().equals(bibliotecario)) {
                    prestamosRealizados++;
                }
            }
            System.out.println("Bibliotecario: " + bibliotecario.getNombre() + ", Préstamos realizados: " + prestamosRealizados);
        }
    }

    public double calcularTotalPagarBibliotecario(Bibliotecario bibliotecario) {
        int prestamosRealizados = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getBibliotecario().equals(bibliotecario)) {
                prestamosRealizados++;
            }
        }
        return bibliotecario.calcularSalario(prestamosRealizados);
    }
}
