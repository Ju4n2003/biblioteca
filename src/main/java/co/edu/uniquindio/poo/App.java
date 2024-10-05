package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    Bibliotecario bibliotecario1 = new Bibliotecario("Ana Gómez", "1234567890", "ana@biblioteca.com", "0991234567", 500, 5);
    Bibliotecario bibliotecario2 = new Bibliotecario("Juan Pérez", "0987654321", "juan@biblioteca.com", "0987654321", 600, 3);
    
    // Crear Estudiantes
    Estudiante estudiante1 = new Estudiante("Carlos Ruiz", "1122334455", "carlos@estudiante.com", "0912345678", 0);
    Estudiante estudiante2 = new Estudiante("Lucía Castro", "6677889900", "lucia@estudiante.com", "0923456789", 0);
    
    // Crear Libros
    Libro libro1 = new Libro("001", "978-3-16-148410-0", "Java Programming", "2022-05-01", 10);
    Libro libro2 = new Libro("002", "978-3-16-148411-7", "Data Structures", "2021-09-15", 5);
    
    // Crear Biblioteca
    Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

    // Agregar Bibliotecarios a la Biblioteca
    biblioteca.getBibliotecarios().add(bibliotecario1);
    biblioteca.getBibliotecarios().add(bibliotecario2);

    // Agregar Estudiantes a la Biblioteca
    biblioteca.getEstudiantes().add(estudiante1);
    biblioteca.getEstudiantes().add(estudiante2);

    // Agregar Libros a la Biblioteca
    biblioteca.getLibros().add(libro1);
    biblioteca.getLibros().add(libro2);
    
    // Crear Préstamos
    Prestamo prestamo1 = new Prestamo(1, 200, estudiante1, bibliotecario1);
    Prestamo prestamo2 = new Prestamo(2, 400, estudiante2, bibliotecario2);
    
    // Adicionar libros a los préstamos
    prestamo1.adicionarDetalle(new DetallePrestamo(1, libro1, 200));
    prestamo2.adicionarDetalle(new DetallePrestamo(2, libro2, 400));

    // Agregar préstamos a la Biblioteca
    biblioteca.getPrestamos().add(prestamo1);
    biblioteca.getPrestamos().add(prestamo2);

    // Mostrar Préstamos realizados por cada Bibliotecario
    biblioteca.mostrarPrestamosPorBibliotecario();

    // Calcular y mostrar total a pagar a Bibliotecario
    double totalPagoAna = biblioteca.calcularTotalPagarBibliotecario(bibliotecario1);
    System.out.println("Total a pagar a Ana Gómez: " + totalPagoAna);

    double totalPagoJuan = biblioteca.calcularTotalPagarBibliotecario(bibliotecario2);
    System.out.println("Total a pagar a Juan Pérez: " + totalPagoJuan);

    // Mostrar Estudiante con más préstamos
    Estudiante estudianteConMasPrestamos = biblioteca.getEstudianteConMasPrestamos();
    System.out.println("Estudiante con más préstamos: " + estudianteConMasPrestamos.getNombre());
}
}
