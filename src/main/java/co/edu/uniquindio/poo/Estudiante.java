package co.edu.uniquindio.poo;

public class Estudiante extends Persona{

    private int prestamosRealizados;
    
    public Estudiante (String nombre, String cedula, String correo, String telefono, int prestamosRealizados){
        super(nombre, cedula, correo, telefono);
        this.prestamosRealizados = prestamosRealizados;
        assert nombre != null && !nombre.isBlank():"";
        assert cedula!= null && !cedula.isBlank():"";
        assert correo!= null && !correo.isBlank() && correo.contains("@");
        assert telefono!= null && !telefono.isBlank():"";
        assert prestamosRealizados >=0 : "El número de préstamos realizados debe ser positivo";
    }

    @Override
    public String toString() {
        return "nombre " + nombre + " cedula " + cedula + ", correo " + correo + ", telefono=" + telefono + "]";
    }
    public void incrementarPrestamos() {
        prestamosRealizados++;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(int prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }
}
