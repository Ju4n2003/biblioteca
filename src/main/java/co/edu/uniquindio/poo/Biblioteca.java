package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.prestamos = new LinkedList<>();
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

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }
    
    public int cantidadPrestamos() {
        return prestamos.size();
    }
    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + "]";
    }
    
}

