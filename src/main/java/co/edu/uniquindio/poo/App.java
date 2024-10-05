package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = crearBiblioteca();
        crearPrestamos(biblioteca);
        mostrarResultados(biblioteca);
    }

    private static Biblioteca crearBiblioteca() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        // Create and add bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecario("Ana Gómez", "1234567890", "ana@biblioteca.com", "0991234567", 500, 5);
        Bibliotecario bibliotecario2= new Bibliotecario("Juan Pérez", "0987654321", "juan@biblioteca.com", "0987654321", 600, 3);
        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarBibliotecario(bibliotecario2);
        
        // Create and add students
        Estudiante estudiante1 = new Estudiante("Carlos Ruiz", "1122334455", "carlos@estudiante.com", "0912345678", 0);
        Estudiante estudiante2 = new Estudiante("Lucía Castro", "6677889900", "lucia@estudiante.com", "0923456789", 0);
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        
        // Create and add books
        Libro libro1 = new Libro("001", "978-3-16-148410-0", "Java Programming", "2022-05-01", 10);
        Libro libro2 = new Libro("002", "978-3-16-148411-7", "Data Structures", "2021-09-15", 5);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        return biblioteca;
    }

    private static void crearPrestamos(Biblioteca biblioteca) {
        Prestamo prestamo1 = new Prestamo(1, 200, biblioteca.getEstudiantes().get(0), biblioteca.getBibliotecarios().get(0));
        Prestamo prestamo2 = new Prestamo(2, 400, biblioteca.getEstudiantes().get(1), biblioteca.getBibliotecarios().get(1));
        prestamo1.adicionarDetalle(new DetallePrestamo(1, biblioteca.getLibros().get(0), 200));
        prestamo2.adicionarDetalle(new DetallePrestamo(2, biblioteca.getLibros().get(1), 400));
        
        biblioteca.agregarPrestamo(prestamo1);
        biblioteca.agregarPrestamo(prestamo2);
        
        biblioteca.mostrarPrestamosPorBibliotecario();
    }

    private static void mostrarResultados(Biblioteca biblioteca) {
        // Total to pay to each bibliotecario
        double totalPagoAna = biblioteca.calcularTotalPagarBibliotecario(biblioteca.getBibliotecarios().get(0));
        Biblioteca.mostrarMensaje("Total a pagar a Ana Gómez: " + totalPagoAna);

        double totalPagoJuan = biblioteca.calcularTotalPagarBibliotecario(biblioteca.getBibliotecarios().get(1));
        Biblioteca.mostrarMensaje("Total a pagar a Juan Pérez: " + totalPagoJuan);

        // Student with the most loans
        Estudiante estudianteConMasPrestamos = biblioteca.getEstudianteConMasPrestamos();
        Biblioteca.mostrarMensaje("Estudiante con más préstamos: " + estudianteConMasPrestamos.getNombre());

        // Library information
        Biblioteca.mostrarMensaje(biblioteca.toString());
    }
}
