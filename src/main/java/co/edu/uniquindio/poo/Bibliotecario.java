package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {

    private int antiguedad;
    private double salario;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario, int antiguedad) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSalario(int prestamosRealizados) {
        double baseSalario = prestamosRealizados * 0.20;
        double bonificacion = baseSalario * (0.02 * antiguedad);
        double totalSalario = baseSalario + bonificacion;
        return totalSalario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", correo=" + correo
                + ", telefono=" + telefono + "]";
    }
}
