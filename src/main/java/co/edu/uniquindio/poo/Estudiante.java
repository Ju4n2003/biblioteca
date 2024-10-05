package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    
    public Estudiante(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
        
        assert nombre != null && !nombre.isBlank() : "El nombre no puede ser null o vacío";
        assert cedula != null && !cedula.isBlank() : "La cédula no puede ser null o vacía";
        assert correo != null && !correo.isBlank() : "El correo no puede ser null o vacío";
        assert telefono != null && !telefono.isBlank() : "El teléfono no puede ser null o vacío";
        
        assert !nombre.equals("") : "El nombre no puede ser una cadena vacía";
        assert !cedula.equals("") : "La cédula no puede ser una cadena vacía";
        assert !correo.equals("") : "El correo no puede ser una cadena vacía";
        assert !telefono.equals("") : "El teléfono no puede ser una cadena vacía";
        
        Objects.requireNonNull(nombre, "El nombre no puede ser null");
        Objects.requireNonNull(cedula, "La cédula no puede ser null");
        Objects.requireNonNull(correo, "El correo no puede ser null");
        Objects.requireNonNull(telefono, "El teléfono no puede ser null");
    }
}
    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + " cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
}
