package edu.pao.reto9.process;
import edu.pao.reto9.ui.Textos;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.IOException;

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
                        mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
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
}



