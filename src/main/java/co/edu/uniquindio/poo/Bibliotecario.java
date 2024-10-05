package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        assert nombre !=null && !nombre.isBlanck():"";
        assert cedula!=null && !cedula.isBlanck():"";
        assert correo!=null && !correo.isBlanck():"";
        assert telefono!=null && !telefono.isBlanck():"";
        assert salario > 0 : "El salario debe ser mayor a 0";
        assert telefono.matches("\\d{7,9}") : "El número de teléfono debe tener entre 7 y 9 dígitos";
        assert correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") : "El correo electrónico no es válido";
        assert cedula.matches("\\d{10}") : "La cédula debe tener 10 dígitos";
        
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
