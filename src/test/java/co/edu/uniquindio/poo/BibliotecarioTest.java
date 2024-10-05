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
public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        Bibliotecario bibliotecario = new Bibliotecario("maicol", "2123123","mauif@gmail.com", "3938324", 1.250, 4 );
        assertEquals("maicol", bibliotecario.getNombre());
        assertEquals ("2123123", bibliotecario.getCedula());
        assertEquals ("mauif@gmail.com", bibliotecario.getCorreo());
        assertEquals ("3938324", bibliotecario.getTelefono());
        assertEquals (1.250, bibliotecario.getSalario());
        assertEquals (4, bibliotecario.getAntiguedad());
        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");
        Bibliotecario bibliotecario = new Bibliotecario("maicol ", "2123123","mauif@gmail.com", "3938324", 1.250, 4 );
        assertThrows(Throwable.class,()->new Bibliotecario(null,null,null,null,0.0,0));
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacíos");
        Bibliotecario bibliotecario = new Bibliotecario("maicol ", "2123123","mauif@gmail.com", "3938324", 1.250, 4 );
        assertThrows(Throwable.class,()-> new Bibliotecario("","","","",0.0,0));

        LOG.info("Finalizando test datos vacíos");
    }

    @Test
    public void salarioNegativo() {
        LOG.info("Iniciado test  negativa");
        Bibliotecario bibliotecario = new Bibliotecario("maicol ", "2123123","mauif@gmail.com", "3938324", 1.250, 4 );
        assertThrows(Throwable.class,()-> new Bibliotecario("maicol ", "2123123","mauif@gmail.com", "3938324", -1.250, -4 ));
        // Verificar que la edad sea positiva
        assertTrue(bibliotecario.getSalario() > 0.0);
        assertTrue(bibliotecario.getAntiguedad() >0);

        LOG.info("Finalizando test edad negativa");
    }    
}