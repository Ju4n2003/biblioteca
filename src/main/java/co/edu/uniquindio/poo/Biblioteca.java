package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Estudiante> estudiantes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante getEstudianteConMasPrestamos() {
        Estudiante maxEstudiante = null;
        int maxPrestamos = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamosRealizados() > maxPrestamos) {
                maxEstudiante = estudiante;
                maxPrestamos = estudiante.getPrestamosRealizados();
            }
        }
        return maxEstudiante;
    }

    public Libro getCantidadLibroIncluidoEnPrestamos() {
        Libro maxLibro = null;
        int maxPrestamos = 0;
        for (Libro libro : libros) {
            if (libro.getPrestamosIncluidos() > maxPrestamos) {
                maxLibro = libro;
                maxPrestamos = libro.getPrestamosIncluidos();
            }
        }
        return maxLibro;
    }

    public void mostrarPrestamosPorBibliotecario() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int prestamosRealizados = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getBibliotecario().equals(bibliotecario)) {
                    prestamosRealizados++;
                }
            }
            Biblioteca.mostrarMensaje("Bibliotecario " + bibliotecario.getNombre() + " Préstamos realizados " + prestamosRealizados);
        }
    }

    public double calcularTotalPagarBibliotecario(Bibliotecario bibliotecario) {
        int prestamosRealizados = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getBibliotecario().equals(bibliotecario)) {
                prestamosRealizados++;
            }
        }
        return bibliotecario.calcularSalario(prestamosRealizados);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (validarCedula(estudiante.getCedula())) {
            mostrarMensaje("Error, el número de identificación " + estudiante.getCedula() + " ya está creado");
        } else {
            estudiantes.add(estudiante);
        }
    }

    public boolean validarCedula(String cedula) {
        boolean numeroCedulaRepetido = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                numeroCedulaRepetido = true;
            }
        }
        return numeroCedulaRepetido;
    }

    public void eliminarEstudiante(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public void actualizarEstudiante(String correo, String telefono, String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                estudiante.setCorreo(correo);
                estudiante.setTelefono(telefono);
                break;
            }
        }
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (validarCedulaBibliotecario(bibliotecario.getCedula())) {
            mostrarMensaje("Error, el número de identificación " + bibliotecario.getCedula() + " ya está creado");
        } else {
            bibliotecarios.add(bibliotecario);
        }
    }

    public boolean validarCedulaBibliotecario(String cedula) {
        boolean numeroCedulaRepetido = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                numeroCedulaRepetido = true;
            }
        }
        return numeroCedulaRepetido;
    }

    public void eliminarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                bibliotecarios.remove(bibliotecario);
                break;
            }
        }
    }

    public void actualizarBibliotecario(String correo, String telefono, String cedula) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                bibliotecario.setCorreo(correo);
                bibliotecario.setTelefono(telefono);
                break;
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "nombre  \n " + nombre + " prestamos  \n" + prestamos + " libros\n " + libros + " bibliotecarios\n "
                + bibliotecarios + " estudiantes\n " + estudiantes;
    }

    public void agregarLibro(Libro libro) {
        if (validarCodigo(libro.getCodigo())) {
            mostrarMensaje("Error, el código " + libro.getCodigo() + " ya está creado");
        } else {
            libros.add(libro);
        }
    }

    public boolean validarCodigo(String codigo) {
        boolean numeroCodigoRepetido = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                numeroCodigoRepetido = true;
            }
        }
        return numeroCodigoRepetido;
    }

    public void eliminarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
                break;
            }
        }
    }

    public void actualizarLibro(String isbn, String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libro.setIsbn(isbn);
                break;
            }
        }
    }

    // Métodos para gestionar préstamos

    public void agregarPrestamo(Prestamo prestamo) {
        if (validarPrestamo(prestamo)) {
            mostrarMensaje("Error, el préstamo ya existe");
        } else {
            prestamos.add(prestamo);
            mostrarMensaje("Préstamo agregado con éxito");
        }
    }

    public boolean validarPrestamo(Prestamo prestamo) {
        return prestamos.contains(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        if (prestamos.contains(prestamo)) {
            prestamos.remove(prestamo);
            mostrarMensaje("Préstamo eliminado con éxito");
        } else {
            mostrarMensaje("Error, el préstamo no existe");
        }
    }

    public void actualizarPrestamo(Prestamo prestamo, int nuevaCantidad, int nuevoTotal) {
        if (prestamos.contains(prestamo)) {
            prestamo.setCantidad(nuevaCantidad);
            prestamo.setTotal(nuevoTotal);
            mostrarMensaje("Préstamo actualizado con éxito");
        } else {
            mostrarMensaje("Error, el préstamo no existe");
        }
    }
}
