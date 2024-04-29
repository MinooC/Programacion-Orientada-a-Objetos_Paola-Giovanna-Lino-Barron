package edu.pao.Reto11.test;
import static org.junit.Assert.assertEquals;
import edu.pao.Reto11.process.LimpiadorCadena;
import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Clase de pruebas para la clase LimpiadorCadena.
 */

public class LimpiadorCadenaTest
{
    /**
     * Prueba unitaria para verificar si una línea sin caracteres especiales se limpia correctamente.
     * Se espera que la línea limpia sea igual a la línea original.
     */

    @Test
    public void limpiarLineaSinCaracteresEspecialesTest()
    {
        String linea = "Esto es una prueba sin caracteres especiales";
        String cleanedLine = LimpiadorCadena.limpiarCadena(linea);
        assertEquals(linea, cleanedLine, "La línea limpia debería ser igual a la línea original");
    }

    /**
     * Prueba unitaria para verificar si una línea con caracteres especiales se limpia correctamente.
     * Se espera que la línea limpia coincida con la línea esperada.
     */

    @Test
    public void limpiarLineaConCaracteresEspecialesTest()
    {
        String linea = "¡Hola, cómo estás? Espero que bien.";
        String expectedCleanedLine = "hola como estas espero que bien";
        String cleanedLine = LimpiadorCadena.limpiarCadena(linea);
        assertEquals(expectedCleanedLine, cleanedLine, "La línea limpia no coincide con la línea esperada");
    }

    /**
     * Prueba si las líneas vacías se limpian correctamente.
     * Se espera que el resultado de limpiar estas líneas sea una lista vacía.
     */

    @Test
    public void limpiarLineasConLineasVaciasTest()
    {
        List<String> lineas = List.of("", " ", "  ");
        List<String> lineasLimpias = LimpiadorCadena.limpiarCadena(lineas);
        assertTrue(lineasLimpias.isEmpty(), "Debería devolver una lista vacía");
    }

    /**
     * Prueba si las líneas normales se limpian correctamente.
     * Se espera que el resultado de limpiar estas líneas sea una lista de líneas con texto en minúsculas.
     */

    @Test
    public void limpiarLineasConLineasNormalesTest ()
    {
        List<String> lineas = List.of("Esto es una línea normal.", "Otra línea normal!");
        List<String> lineasLimpias = LimpiadorCadena.limpiarCadena(lineas);
        assertAll("Debería devolver la misma cantidad de líneas y estar en minúsculas",
                () -> assertEquals(lineas.size(), lineasLimpias.size()),
                () -> {
                    for (int i = 0; i < lineas.size(); i++) {
                        assertEquals(lineas.get(i).toLowerCase(), lineasLimpias.get(i));
                    }
                }
        );
    }

    /**
     * Prueba si las líneas con caracteres no alfabéticos se limpian correctamente.
     * Se espera que el resultado de limpiar estas líneas sea una lista de líneas
     * con solo texto alfabético en minúsculas.
     */

    @Test
    public void limpiarLineasConLineasConCaracteresNoAlfabeticos()
    {
        List<String> lineas = List.of("Esta línea tiene caracteres especiales: @#&!", "Otra línea con números: 12345");
        List<String> lineasLimpias = LimpiadorCadena.limpiarCadena(lineas);
        assertAll("Debería devolver la misma cantidad de líneas y solo texto alfabético en minúsculas",
                () -> assertEquals(lineas.size(), lineasLimpias.size()),
                () -> {
                    for (int i = 0; i < lineas.size(); i++)
                    {
                        assertEquals("esta línea tiene caracteres especiales", lineasLimpias.get(i));
                    }
                }
        );
    }
}
