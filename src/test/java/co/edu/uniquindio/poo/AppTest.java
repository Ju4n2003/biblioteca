/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    public void datosCompletosEstudiante() {
        LOG.info("Iniciado test datos completos");
        Estudiante estudiante = new Estudiante("Carlos Ruiz", "1122334455", "carlos@estudiante.com", "0912345678", 0);

        // Verificar que los datos se almacenen correctamente
        assertEquals("Carlos Ruiz", estudiante.getNombre());
        assertEquals("1122334455", estudiante.getCedula());
        assertEquals("carlos@estudiante.com", estudiante.getCorreo());
        assertEquals("0912345678", estudiante.getTelefono());
        assertEquals(0, estudiante.getPrestamosRealizados());
        LOG.info("Finalizando test datos completos");
    }
    @Test
    public void datosNulosEstudiante() {
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class,()-> new Estudiante(null, null, null, null, 0));

        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVaciosEstudiante() {
        LOG.info("Iniciado test datos vacíos");
        assertThrows(Throwable.class,()-> new Estudiante(" ", " ", " ", " ", 0));
        LOG.info("Finalizando test datos vacíos");
    }
}