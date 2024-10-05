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
public class EditorialTest {
    private static final Logger LOG = Logger.getLogger(EditorialTest.class.getName());

    @Test
    public void datosCompletos(){
        LOG.info("Iniciado test datos completos");
        Editorial editorial = new Editorial("mendez", "mendesdistri@gmail.com", "32312312");
        assertEquals("mendez", editorial.getNombre());
        assertEquals("mendesdistri@gmail.com", editorial.getCorreo());
        assertEquals("32312312", editorial.getTelefono());
        LOG.info("Iniciado test datos completos");

    }

    @Test
    public void datosNulos(){
        LOG.info("Iniciado test datos nulos");
        Editorial editorial = new Editorial("mendez", "mendesdistri@gmail.com", "32312312");
        assertThrows(Throwable.class,()->new Editorial(null, null, null));
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datos vacíos");
        Editorial editorial = new Editorial("mendez", "mendesdistri@gmail.com", "32312312");
        assertThrows(Throwable.class,()-> new Editorial("", "", ""));
        LOG.info("Finalizando test datos vacíos");
    }

    
    
}
