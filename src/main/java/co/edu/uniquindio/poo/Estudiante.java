package co.edu.uniquindio.poo;

public class Estudiante extends Persona{
    
    public Estudiante (String nombre, String cedula, String correo, String telefono){
        super(nombre, cedula, correo, telefono);
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + " cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
}
