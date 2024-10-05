/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PrestamoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        Estudiante estudiante = new Estudiante("Andres", "212345678", "andres@gmail.com", "3123456789", 1);
        Bibliotecario bibliotecario = new Bibliotecario("Felipe", "212345679", "felipe@gmail.com", "3123456790", 2.0, 3);
        Prestamo prestamo = new Prestamo(2, 4, estudiante, bibliotecario);
        assertEquals(2, prestamo.getCantidad());
        assertEquals(4, prestamo.getTotal());
        assertEquals("Felipe", prestamo.getBibliotecario().getNombre());
        assertEquals("Andres", prestamo.getEstudiante().getNombre());
        LOG.info("Finalizando test datos completos");
        // Verificar que el nombre del prestador sea distinto de null
    }    

    @Test
    public void prestamoNegativo() {
        LOG.info("Iniciado test prestamo negativo");
        Estudiante estudiante = new Estudiante("Andres", "212345678", "andres@gmail.com", "3123456789", 1);
        Bibliotecario bibliotecario = new Bibliotecario("Felipe", "212345679", "felipe@gmail.com", "3123456790", 2.0, 3);

        // Verificar que se lanza una excepción si la cantidad o el total son negativos
        assertThrows(Throwable.class, () -> new Prestamo(-2, 0, estudiante, bibliotecario));
        LOG.info("Finalizando test prestamo negativo");
    }

    @Test
    public void prestamoCero() {
        LOG.info("Iniciado test prestamo cero");
        Estudiante estudiante = new Estudiante("Andres", "212345678", "andres@gmail.com", "3123456789", 1);
        Bibliotecario bibliotecario = new Bibliotecario("Felipe", "212345679", "felipe@gmail.com", "3123456790", 2.0, 3);

        // Verificar que se lanza una excepción si el total es negativo
        assertThrows(Throwable.class, () -> new Prestamo(0, -4, estudiante, bibliotecario));
        
        LOG.info("Finalizando test prestamo cero");
    }
}