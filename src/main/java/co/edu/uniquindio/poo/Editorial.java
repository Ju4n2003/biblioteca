package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Editorial {
    private String nombre;
    private String correo;
    private String telefono;
    private LinkedList<DetalleEditorial> detallesEditoriale;
    
    public Editorial(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        assert nombre !=null && !nombre.isBlank():"";
        assert correo!= null && !correo.isBlank():"";
        assert telefono!= null && !telefono.isBlank():"";
        assert correo.contains("@");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre de la editorial\n " + nombre + " el  correo de la editorial es \n" + correo + " el telefono de contacto es \n" + telefono ;
    }

    public LinkedList<DetalleEditorial> getDetallesEditoriale() {
        return detallesEditoriale;
    }

    public void setDetallesEditoriale(LinkedList<DetalleEditorial> detallesEditoriale) {
        this.detallesEditoriale = detallesEditoriale;
    }
    
}
