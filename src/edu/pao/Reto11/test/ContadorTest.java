package edu.pao.Reto11.test;
import edu.pao.Reto11.ui.Esp;
import edu.pao.Reto11.ui.Textos;
import edu.pao.Reto11.process.Contador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas para la clase Contador.
 */

public class ContadorTest
{
    /**
     * Prueba unitaria para contar el número total de vocales en el mapa de palabras.
     */

    @Test
    public void contarVocalesTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        long resultado = contador.contarVocales();

        assertEquals(9, resultado);
    }

    /**
     * Prueba unitaria para obtener palabras que comienzan con vocal, ordenadas alfabéticamente.
     */

    @Test
    public void obtenerPalabrasInicioVocalOrdenadasTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        List<String> resultado = contador.obtenerPalabrasInicioVocalOrdenadas();

        assertEquals(Arrays.asList("adiós", "gato", "hola"), resultado);
    }

    /**
     * Prueba unitaria para obtener palabras con longitud impar.
     */

    @Test
    public void obtenerPalabrasImparLongitudTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        List<String> resultado = contador.obtenerPalabrasImparLongitud();

        assertEquals(Arrays.asList("hola"), resultado);
    }

    /**
     * Prueba unitaria para obtener la palabra más larga del mapa de palabras.
     */

    @Test
    public void obtenerPalabraMasLargaTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        String resultado = contador.obtenerPalabraMasLarga();

        assertEquals("adiós", resultado);
    }

    /**
     * Prueba unitaria para obtener la palabra más corta del mapa de palabras.
     */

    @Test
    public void obtenerPalabraMasCortaTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        String resultado = contador.obtenerPalabraMasCorta();

        assertEquals("gato", resultado);
    }

    /**
     * Prueba unitaria para verificar si existe alguna palabra en el mapa de palabras.
     */

    @Test
    public void existePalabraCondicionesPrueba()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        boolean resultado = contador.existePalabraCondiciones();

        assertTrue(resultado);
    }

    /**
     * Prueba unitaria para contar palabras en un archivo vacío.
     */

    @Test
    public void contarPalabrasArchivoVacioPrueba() throws IOException
    {
        Contador contador = new Contador();
        contador.contarPalabras("archivo_vacio.txt");
        assertTrue(contador.getMapaPalabras().isEmpty());
    }

    /**
     * Prueba unitaria para contar palabras en un archivo con una sola palabra.
     */

    @Test
    public void contarPalabrasArchivoUnaPalabraPrueba() throws IOException
    {
        Contador contador = new Contador();
        contador.contarPalabras("archivo_una_palabra.txt");
        assertEquals(1, contador.getMapaPalabras().size());
        assertEquals(1, contador.getMapaPalabras().get("hola").intValue());
    }

    /**
     * Prueba unitaria para contar palabras en un archivo con varias palabras.
     */

    @Test
    public void contarPalabrasArchivoVariasPalabrasTest() throws IOException
    {
        Contador contador = new Contador();
        contador.contarPalabras("archivo_varias_palabras.txt");
        assertEquals(3, contador.getMapaPalabras().size());
        assertEquals(2, contador.getMapaPalabras().get("hola").intValue());
        assertEquals(1, contador.getMapaPalabras().get("gato").intValue());
        assertEquals(1, contador.getMapaPalabras().get("adiós").intValue());
    }

    /**
     * Prueba unitaria para verificar si se lanza una FileNotFoundException al intentar contar palabras en un archivo que no existe.
     */

    @Test(expected = FileNotFoundException.class)
    public void contarPalabrasArchivoNoEncontradoTest() throws IOException
    {
        Contador contador = new Contador();
        contador.contarPalabras("archivo_no_existente.txt");
    }

    /**
     * Prueba unitaria para imprimir palabras más repetidas con un mapa vacío.
     */

    @Test
    public void imprimirPalabrasMasRepetidasConMapaVacioTest()
    {
        Contador contador = new Contador();
        Textos textos = new Esp();
        String output = contador.imprimirPalabrasMasRepetidas(textos);
        assertEquals("", output);
    }

    /**
     * Prueba unitaria para imprimir palabras más repetidas con palabras en el mapa.
     */

    @Test
    public void imprimirPalabrasMasRepetidasConPalabrasEnElMapaTest()
    {
        Contador contador = new Contador();
        Textos textos = new Esp();
        contador.getMapaPalabras().put("word1", 10);
        contador.getMapaPalabras().put("word2", 20);
        contador.getMapaPalabras().put("word3", 30);
        String expectedOutput = "1 Palabra: word3, repeticiones: 30\n" +
                "2 Palabra: word2, repeticiones: 20\n" +
                "3 Palabra: word1, repeticiones: 10\n";
        String output = contador.imprimirPalabrasMasRepetidas(textos);
        assertEquals(expectedOutput, output);
    }

    /**
     * Prueba unitaria para verificar si existe alguna palabra en el mapa de palabras.
     */

    @Test
    public void existePalabraCondicionesTest()
    {
        Contador contador = new Contador();
        contador.getMapaPalabras().put("hola", 5);
        contador.getMapaPalabras().put("gato", 10);
        contador.getMapaPalabras().put("adiós", 3);

        boolean resultado = contador.existePalabraCondiciones();

        assertTrue(resultado);
    }
}

