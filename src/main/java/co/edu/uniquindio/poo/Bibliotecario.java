package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", correo=" + correo
                + ", telefono=" + telefono + "]";
    }
    
    


}
