package edu.pao.Reto11.process;

import edu.pao.Reto11.process.LimpiadorCadena;
import edu.pao.Reto11.ui.Textos;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Contador
{

    private Map<String, Integer> mapaPalabras;

    public Contador()
    {
        mapaPalabras = new HashMap<>();
    }

    public void contarPalabras(String archivo) throws IOException
    {
        String rutaArchivo = "edu.pao.reto9.resources." + archivo;
        System.out.println("Ruta del archivo: " + rutaArchivo);
        try (InputStream inputStream = Contador.class.getResourceAsStream(rutaArchivo))
        {
            if (inputStream != null) {
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
    public long contarVocales()
    {
        return mapaPalabras.keySet().stream()
                .mapToLong(palabra -> palabra.chars()
                        .filter(c -> "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(c) != -1).count())
                .sum();
    }
    public List<String> obtenerPalabrasInicioVocalOrdenadas()
    {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(0)) != -1)
                .sorted()
                .collect(Collectors.toList());
    }
    public List<String> obtenerPalabrasImparLongitud()
    {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .collect(Collectors.toList());
    }
    public String obtenerPalabraMasLarga()
    {
        return mapaPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
    public String obtenerPalabraMasCorta()
    {
        return mapaPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }
    public boolean existePalabraCondiciones()
    {
        return mapaPalabras.keySet().stream()
                .anyMatch(palabra -> palabra.length() >= 5 &&
                        "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(0)) != -1 &&
                        "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(palabra.length() - 1)) != -1);
    }
}