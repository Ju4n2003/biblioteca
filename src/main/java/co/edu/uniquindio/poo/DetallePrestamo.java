package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int cantidad;
    private int subTotal;
    private Libro libro;
    
    public DetallePrestamo(int cantidad, Libro libro, int subTotal) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.subTotal = CalcularSubTotal(libro, subTotal);
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

    public int CalcularSubTotal(Libro libro, int cantidad) {
        int subTotal = 0;
        subTotal= cantidad*libro.getUnidadDisponible();
        return subTotal;
    }
    
    
}
