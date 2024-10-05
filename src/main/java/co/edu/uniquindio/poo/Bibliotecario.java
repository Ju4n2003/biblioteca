package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {

    private int antiguedad;
    private double salario;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario, int antiguedad) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.antiguedad = antiguedad;
        assert nombre !=null && !nombre.isBlack():"";
        assert cedula!=null && !cedula.isBlack():"";
        assert correo!=null && !correo.isBlack():"";
        assert telefono!=null && !telefono.isBlack():"";
        assert salario > 0 && antiguedad > 0 : "Los valores deben ser positivos.";
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
