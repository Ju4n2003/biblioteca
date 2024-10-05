package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class DetallePrestamo {
    private int cantidad;
    private int subTotal;
    private Libro libro;
    private LinkedList<Libro> libros;
    
    public DetallePrestamo(int cantidad, Libro libro, int subTotal) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.subTotal = CalcularSubTotal(libro, subTotal);
        this.libros = new LinkedList<>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }
    
    
    public void quitarLibro(Libro libro) {
        libros.remove(libro);
        subTotal = CalcularSubTotal(libro, subTotal);
    }
    
    public boolean verificarStock(Libro libro) {
        return libro.getUnidadDisponible() >= cantidad;
    }

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        subTotal = CalcularSubTotal(libro, subTotal);
    }

    public int CalcularSubTotal(Libro libro, int cantidad) {
        int subTotal = 0;
        subTotal= cantidad*libro.getUnidadDisponible();
        return subTotal;
    }
    

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibroPrestamo(Libro libro) {
        libros.add(libro);
    }
}
