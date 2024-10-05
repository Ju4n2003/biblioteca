package co.edu.uniquindio.poo;

public class Libro {
    private String codigo;
    private String isbn;
    private String titulo;
    private String fecha;
    private int unidadDisponible;
    public Libro(String codigo, String isbn, String titulo, String fecha, int unidadDisponible) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadDisponible = unidadDisponible;
        assert codigo !=null && !codigo.isBlanck():"";
        assert isbn!=null && !isbn.isBlanck():"";
        assert titulo!=null && !titulo.isBlanck():"";
        assert fecha!=null && !fecha.isBlanck():"";
        assert unidadDisponible >= 0 : "La cantidad de unidades disponibles no puede ser negativa";
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
    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", fecha=" + fecha
                + ", unidadDisponible=" + unidadDisponible + "]";
    }
    
}
