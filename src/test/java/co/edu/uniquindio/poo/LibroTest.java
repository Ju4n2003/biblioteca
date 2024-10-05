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
public class LibroTest {
    private static final Logger LOG = Logger.getLogger(LibroTest.class.getName());


    @Test 
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        Libro libro = new Libro("24213412", "232rq2", "señor de los anillos", "04/09/2003", 25);
        assertEquals("24213412", libro.getCodigo());
        assertEquals("232rq2", libro.getIsbn());
        assertEquals("señor de los anillos", libro.getTitulo());
        assertEquals("04/09/2003", libro.getFecha());
        assertTrue(libro.getUnidadDisponible() >= 0);
        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");
        Libro libro = new Libro("24213412", "232rq2", "señor de los anillos ", "04/09/2003", 25);
        assertThrows(Throwable.class, () -> new Libro(null, null, null, null, 0));
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacíos");
        Libro libro = new Libro("24213412", "232rq2", "señor de los anillos ", "04/09/2003", 25);
        assertThrows(Throwable.class, () -> new Libro(" ", " ", " ", " ", 0));
        LOG.info("Finalizando test datos vacíos");
    }
    
    @Test
    public void unidadDisponibleNegativa() {
        LOG.info("Iniciado test unidad disponible negativa");
        Libro libro = new Libro("24213412", "232rq2", "señor de los anillos ", "04/09/2003", 25);
        assertThrows(Throwable.class, () -> new Libro("24213412", "232rq2", "señor de los anillos ", "04/09/2003", -25));
        LOG.info("Finalizando test unidad disponible negativa");
    }
    
}
