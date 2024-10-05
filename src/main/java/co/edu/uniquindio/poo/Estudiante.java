package co.edu.uniquindio.poo;

public class Estudiante extends Persona{
    
    public Estudiante (String nombre, String cedula, String correo, String telefono){
        super(nombre, cedula, correo, telefono);
        assert nombre !=null && !nombre.isBlanck():"";
        assert cedula!=null && !cedula.isBlanck() :"";
        assert correo!=null && !correo.isBlanck() :"";
        assert telefono!=null && !telefono.isBlanck() :"";
        assert correo.contains("@");
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + " cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
}
