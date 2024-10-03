package co.edu.uniquindio.poo;

public class DetalleLibro {
    private Libro libro;
    private Autor autor;
    public DetalleLibro(Libro libro, Autor autor) {
        this.libro = libro;
        this.autor = autor;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
