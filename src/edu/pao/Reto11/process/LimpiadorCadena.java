package edu.pao.Reto11.process;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase LimpiadorCadena proporciona métodos para limpiar cadenas de texto
 * de caracteres no alfabéticos y convertirlas a minúsculas.
 **/
public class LimpiadorCadena
{
    /**
     * Limpia una cadena de texto, eliminando caracteres no alfabéticos y
     * convirtiendo todos los caracteres a minúsculas.
     **/
    public static String limpiarCadena(String linea)
    {
        return linea.toLowerCase()
                .replaceAll("[^\\p{IsAlphabetic}\\s]", "")
                .replaceAll("[^\\p{ASCII}]", "");
    }

    /**
     * Limpia una lista de cadenas de texto, aplicando el método limpiarCadena()
     * a cada elemento de la lista.
     **/
    public static List<String> limpiarCadena(List<String> lineas)
    {
        return lineas.stream()
                .map(LimpiadorCadena::limpiarCadena)
                .collect(Collectors.toList());
    }
}