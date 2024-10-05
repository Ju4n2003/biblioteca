package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Libro {
    private String codigo;
    private String isbn;
    private String titulo;
    private String fecha;
    private LinkedList<DetalleLibro> detallesLibros;
    private int unidadDisponible;
    private int prestamosIncluidos;

    public Libro(String codigo, String isbn, String titulo, String fecha, int unidadDisponible) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadDisponible = unidadDisponible;
        this.prestamosIncluidos = 0;
        this.detallesLibros = new LinkedList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadDisponible() {
        return unidadDisponible;
    }

    public void setUnidadDisponible(int unidadDisponible) {
        this.unidadDisponible = unidadDisponible;
    }

    public int getPrestamosIncluidos() {
        return prestamosIncluidos;
    }

    public void setPrestamosIncluidos(int prestamosIncluidos) {
        this.prestamosIncluidos = prestamosIncluidos;
    }

    public LinkedList<DetalleLibro> getDetallesLibros() {
        return detallesLibros;
    }

    public void setDetallesLibros(LinkedList<DetalleLibro> detallesLibros) {
        this.detallesLibros = detallesLibros;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", fecha=" + fecha
                + ", unidadDisponible=" + unidadDisponible + "]";
    }

    public void calcularIncrementoPrestamosIncluidos(){
        this.prestamosIncluidos++;
    }
}
