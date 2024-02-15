package edu.pao.reto3.process;

import edu.pao.reto3.Main;

import java.util.Scanner;

public class Diccionario
{
    private static final int CAPACIDAD_DICCIONARIO = 10;
    private String[] palabras;
    private String[] significados;
    private int cantidadPalabras;

    public Diccionario(String[] palabras, String[] significados)
    {
        this.palabras = palabras;
        this.significados = significados;
        this.cantidadPalabras = palabras.length;
    }

    public void listarPalabras()
    {
        System.out.println("--- Palabras del diccionario ---");
        int index = 0;
        while (index < cantidadPalabras)
        {
            System.out.println(palabras[index]);
            index++;
        }
    }

    public String buscarSignificado(String palabra)
    {
        int index = 0;
        while (index < cantidadPalabras) {
            if (palabra.equalsIgnoreCase(palabras[index]))
            {
                return significados[index];
            }
            index++;
        }
        return "La palabra buscada no existe en el diccionario";
    }

    public void mostrarDetallesDiccionario()
    {
        System.out.println("--- Detalles del diccionario ---");
        System.out.println("Cantidad de palabras en el diccionario: " + cantidadPalabras);

        int index = 0;
        while (index < cantidadPalabras)
        {
            System.out.println("Palabra: " + palabras[index] +
                    ", Significado: " + significados[index] +
                    ", Cantidad de caracteres del significado: " + significados[index].length());
            index++;
        }
    }
}
