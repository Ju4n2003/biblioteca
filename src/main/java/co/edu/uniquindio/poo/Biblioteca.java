package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Bibliotecario> bibliotecarios;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.prestamos = new LinkedList<>();
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

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }
    
    public int cantidadPrestamos() {
        return prestamos.size();
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
       
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + "]";
    }

public void agregarEstudiante(Estudiante estudiante) {
    if (validarCedulaEstudiante(estudiante.getCedula())) {
        mostrarMensaje("Error: Estudiante ya creado");
    } else {
        estudiantes.add(estudiante);
    }
}

public void agregarBibliotecario(Bibliotecario bibliotecario) {
    if (validarCedulaBibliotecario(bibliotecario.getCedula())) {
        mostrarMensaje("Error: Bibliotecario ya creado");
    } else {
        bibliotecarios.add(bibliotecario);
    }
}
    public void validarCedulaEstudiante(String cedula){
        boolean cedulaRepetida= false;
        for (Estudiante estudiante :estudiantes ){
            if(estudiante.getCedula().equals(cedula)){
                cedula=true;
            }
        }
        return cedulaRepetida;
    }

    public void validarCedulaBibliotecario(String cedula){
        boolean cedulaRepetida= false;
        for (Bibliotecario bibliotecario :bibliotecarios ){
            if(bibliotecario.getCedula().equals(cedula)){
                cedula=true;
            }
        }
        return cedulaRepetida;
    }

    public void eliminarEstudiante(String cedula){
        for (Estudiante estudiante : estudiantes){
            if(estudiante.getCedula().equals(cedula)){
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public void eliminarBibliotecario(String cedula){
        for (Bibliotecario bibliotecario : bibliotecarios){
            if(bibliotecario.getCedula().equals(cedula)){
                bibliotecarios.remove(bibliotecario);
                break;
            }
        }

    }
    
    public void actualizarEstudiante(String correo, String telefono){
        for (Estudiante estudiante : estudiantes){
            if(estudiante.getCedula().equals(cedula)){
                estudiante.setTelefono(telefono);
                estudiante.setCorreo(correo);
                break;
            }
        }

    }

    public void actualizarBibliotecario(String correo, String telefono){
        for (Bibliotecario bibliotecario : bibliotecarios){
            if(bibliotecario.getCedula().equals(cedula)){
                bibliotecario.setTelefono(telefono);
                bibliotecario.setCorreo(correo);
                break;
            }
        }
    }

}
