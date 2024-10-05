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
    public void datosCompletosEstudiante() {
        LOG.info("Iniciado test datos completos");
        Estudiante estudiante = new Estudiante("Juan", "Perez", 20, "123456789", "Ingeniería de Sistemas", "2023-01");

        // Verificar que los datos se almacenen correctamente
        assertEquals("Juan", estudiante.getNombre());
        assertEquals("Perez", estudiante.getApellido());
        assertEquals(20, estudiante.getEdad());
        assertEquals("123456789", estudiante.getCedula());
        assertEquals("Ingeniería de Sistemas", estudiante.getCarrera());
        assertEquals("2023-01", estudiante.getAnioIngreso());

        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulosEstudiante() {
        LOG.info("Iniciado test datos nulos");
        Estudiante estudiante = new Estudiante(null, null, 0, null, null, null);

        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVaciosEstudiante() {
        LOG.info("Iniciado test datos vacíos");
        Estudiante estudiante = new Estudiante("", "", 0, "", "", "");

        LOG.info("Finalizando test datos vacíos");
    }

    @Test
    public void edadNegativaEstudiante() {
        LOG.info("Iniciado test edad negativa");
        Estudiante estudiante = new Estudiante("Juan", "Perez", -20, "123456789", "Ingeniería de Sistemas", "2023-01");

        // Verificar que la edad sea positiva
        assertTrue(estudiante.getEdad() >= 0);

        LOG.info("Finalizando test edad negativa");
    }

    @Test
    public void datosCompletosBibliotecario() {
        LOG.info("Iniciado test datos completos");
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "Perez", 30, "123456789", "Licenciatura en Informática", "2023-01");

        // Verificar que los datos se almacenen correctamente
        assertEquals("Juan", bibliotecario.getNombre());
        assertEquals("Perez", bibliotecario.getApellido());
        assertEquals(30, bibliotecario.getEdad());
        assertEquals("123456789", bibliotecario.getCedula());
        assertEquals("Licenciatura en Informática", bibliotecario.getTitulo());
        assertEquals("2023-01", bibliotecario.getAnioIngreso());

        LOG.info("Finalizando test datos completos");
    }
}