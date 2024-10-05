package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Prestamo {
    private int cantidad;
    private int total;
    private LinkedList<DetallePrestamo> detallesPrestamo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    public Prestamo(int cantidad, int total, Estudiante estudiante, Bibliotecario bibliotecario) {
        this.cantidad = cantidad;
        this.total = total;
        this.detallesPrestamo = new LinkedList<>();
        this.estudiante= estudiante;
        this.bibliotecario = bibliotecario;
        assert cantidad >=0;
        assert total >=0;
        assert total >= cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public LinkedList<DetallePrestamo> getDetallesPrestamo() {
        return detallesPrestamo;
    }
    public void setDetallesPrestamo(LinkedList<DetallePrestamo> detallesPrestamo) {
        this.detallesPrestamo = detallesPrestamo;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    public void adicionarDetalle(DetallePrestamo detalle) {
        detallesPrestamo.add(detalle);
        detalle.getLibro().getPrestamosIncluidos();
        estudiante.incrementarPrestamos();
    }
}
