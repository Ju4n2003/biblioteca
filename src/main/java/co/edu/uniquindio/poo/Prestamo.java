package co.edu.uniquindio.poo;

public class Prestamo {
    private int cantidad;
    private int total;
    public Prestamo(int cantidad, int total) {
        this.cantidad = cantidad;
        this.total = total;
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
    
}
