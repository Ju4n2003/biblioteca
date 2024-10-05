package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Autor{
    private String nombre;
    private String apellido;
    private LinkedList<DetalleLibro> detallesLibros;
    
    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.detallesLibros = new LinkedList<>();
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return  "El nombre del autor es "+ nombre + " " + apellido ;
    }

    public LinkedList<DetalleLibro> getDetallesLibros() {
        return detallesLibros;
    }

    public void setDetallesLibros(LinkedList<DetalleLibro> detallesLibros) {
        this.detallesLibros = detallesLibros;
    }

    
    
}