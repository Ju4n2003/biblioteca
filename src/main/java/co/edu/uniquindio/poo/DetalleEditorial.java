package co.edu.uniquindio.poo;

public class DetalleEditorial {
    private Autor autor;
    private Editorial editorial;
    public DetalleEditorial(Autor autor, Editorial editorial) {
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return " autor \n" + autor + " editorial \n" + editorial ;
    }
    
}
