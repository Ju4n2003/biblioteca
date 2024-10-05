/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        Estudiante estudiante = new Estudiante("pedro ", "210231293","pedro@gmail.com", "32314214", 2);

        assertEquals("210231293", estudiante.getCedula());
        assertEquals("pedro@gmail.com", estudiante.getCorreo());
        assertEquals("32314214", estudiante.getTelefono());
        assertEquals("pedro ", estudiante.getNombre());
        assertEquals(2, estudiante.getPrestamosRealizados());

        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");
        Estudiante estudiante = new Estudiante(null,null,null,null,0);
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacíos");
        Estudiante estudiante = new Estudiante("", "", "", "", "",0);

        LOG.info("Finalizando test datos vacíos");
    }

    @Test
    public void prestamoNegativo() {
        LOG.info("Iniciado test edad negativa");
        Estudiante estudiante = new Estudiante("pedro ", "210231293","pedro@gmail.com", "32314214", -2);

        // Verificar que la edad sea positiva
        assertTrue(estudiante.getPrestamosRealizados() > 0);

        LOG.info("Finalizando test edad negativa");
    }    
}