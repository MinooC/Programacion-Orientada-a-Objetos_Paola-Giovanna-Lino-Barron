package edu.pao.Reto11.process;
import edu.pao.Reto11.ui.Textos;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * La clase Contador se encarga de contar la frecuencia de palabras en un archivo de texto
 * y mostrar las palabras más repetidas.
 */

public class Contador
{

    private Map<String, Integer> mapaPalabras;

    /**
     * Constructor de la clase Contador. Inicializa un nuevo mapa de palabras vacío.
     */

    public Contador()
    {
        mapaPalabras = new HashMap<>();
    }

    /**
     * Lee el contenido de un archivo de texto y cuenta la frecuencia de cada palabra.
     *
     * @param archivo Ruta del archivo de texto a analizar.
     * @throws IOException Si ocurre un error al leer el archivo.
     **/

    public void contarPalabras(String archivo) throws IOException
    {
        String rutaArchivo = "edu.pao.reto9.resources." + archivo;
        System.out.println("Ruta del archivo: " + rutaArchivo);
        try (InputStream inputStream = Contador.class.getResourceAsStream(rutaArchivo))
        {
            if (inputStream != null)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String linea;
                while ((linea = reader.readLine()) != null)
                {
                    linea = LimpiadorCadena.limpiarCadena(linea);
                    String[] palabras = linea.split("\\s+");
                    for (String palabra : palabras)
                    {
                        palabra = palabra.toLowerCase();
                        palabra = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚ]", "");
                        if (!palabra.isEmpty())
                        {
                            mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
                        }
                    }
                }
            } else {
                throw new FileNotFoundException("Archivo no encontrado: " + rutaArchivo);
            }
        } finally {

        }
    }

    /**
     * Imprime en pantalla las 10 palabras más repetidas junto con su frecuencia.
     **/
    public void imprimirPalabrasMasRepetidas(Textos textos)
    {
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : mapaPalabras.entrySet())
        {
            heap.offer(entry);
            if (heap.size() > 10)
            {
                heap.poll();
            }
        }

        List<Map.Entry<String, Integer>> top10 = new ArrayList<>();
        while (!heap.isEmpty())
        {
            top10.add(heap.poll());
        }

        for (int i = top10.size() - 1; i >= 0; i--)
        {
            Map.Entry<String, Integer> entry = top10.get(i);
            System.out.println((top10.size() - i) + textos.palabra() + entry.getKey() + textos.repeticiones() + entry.getValue());
        }
    }
    /**
     * Cuenta el total de todas las vocales disponibles en las palabras del mapa.
     *
     * @return El conteo total de vocales en todas las palabras.
     */
    public long contarVocales()
    {
        return mapaPalabras.keySet().stream()
                .mapToLong(palabra -> palabra.chars()
                        .filter(c -> "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(c) != -1).count())
                .sum();
    }

    /**
     * Obtiene todas las palabras del mapa que empiezan con una vocal, ordenadas alfabéticamente.
     *
     * @return Una lista de palabras que empiezan con una vocal y están ordenadas alfabéticamente.
     */
    public List<String> obtenerPalabrasInicioVocalOrdenadas()
    {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(0)) != -1)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Obtiene todas las palabras del mapa que tienen un número impar de letras.
     *
     * @return Una lista de palabras que tienen un número impar de letras.
     */
    public List<String> obtenerPalabrasImparLongitud()
    {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .collect(Collectors.toList());
    }

    /**
     * Encuentra la palabra más larga en el mapa de palabras.
     *
     * @return La palabra más larga en el mapa, o una cadena vacía si el mapa está vacío.
     */
    public String obtenerPalabraMasLarga()
    {
        return mapaPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    /**
     * Encuentra la palabra más corta en el mapa de palabras.
     *
     * @return La palabra más corta en el mapa, o una cadena vacía si el mapa está vacío.
     */
    public String obtenerPalabraMasCorta()
    {
        return mapaPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }
    /**
     * Identifica si hay al menos una palabra en el mapa que cumple ciertas condiciones:
     * comienza con una vocal, termina con una vocal y tiene al menos 5 letras.
     *
     * @return true si al menos una palabra cumple las condiciones, false de lo contrario.
     */
    public boolean existePalabraCondiciones()
    {
        return mapaPalabras.keySet().stream()
                .anyMatch(palabra -> palabra.length() >= 5 &&
                        "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(0)) != -1 &&
                        "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(palabra.length() - 1)) != -1);
    }
}