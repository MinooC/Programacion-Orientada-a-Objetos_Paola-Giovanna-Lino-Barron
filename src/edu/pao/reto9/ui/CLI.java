package edu.pao.reto9.ui;

import edu.pao.reto9.process.Contador;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
/**
 * La clase CLI proporciona la interfaz de línea de comandos para interactuar con el programa.
 * Permite al usuario seleccionar un idioma, elegir un libro y analizar las palabras más repetidas en ese libro.
 **/

public class CLI
{
    /**
     * La lista de libros disponibles para su análisis.
     **/
    private static final List<String> libros = List.of(
            "Blancanieves",
            "La reina de las nieves",
            "Pinocchio",
            "Ricitos de oro",
            "The milkmaid"
    );

    /**
     * Muestra el menú principal del programa.
     **/
    public static void showMenu()
    {
        mostrarMenuIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        String idioma;
        switch (opcionIdioma) {
            case 1:
                idioma = "Español";
                break;
            case 2:
                idioma = "English";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        Textos textos = new Textos()
        {
            @Override
            public String bienvenida()
            {
                return null;
            }

            @Override
            public String opcion_invalida()
            {
                return null;
            }

            @Override
            public String menu()
            {
                return null;
            }

            @Override
            public String error_lectura()
            {
                return null;
            }

            @Override
            public String palabra()
            {
                return null;
            }

            @Override
            public String repeticiones()
            {
                return null;
            }

            @Override
            public String palabras_repetidas()
            {
                return null;
            }
        };
        System.out.println(textos.bienvenida());
        System.out.println(textos.menu());

        mostrarLibros();

        int opcionLibro = scanner.nextInt();
        scanner.nextLine();

        if (opcionLibro < 1 || opcionLibro > libros.size())
        {
            System.out.println(textos.opcion_invalida());
            return;
        }

        String libroSeleccionado = libros.get(opcionLibro - 1);
        System.out.println(textos.palabras_repetidas() + "\"" + libroSeleccionado + "\":");
        try
        {
            Contador wordManager = new Contador();
            wordManager.contarPalabras(libroSeleccionado + ".txt");
            wordManager.imprimirPalabrasMasRepetidas(textos);
        } catch (IOException e) {
            System.out.println(textos.error_lectura());
        }
    }
    /**
     * Muestra el menú para seleccionar un idioma.
     **/
    private static void mostrarMenuIdioma()
    {
        System.out.println("Seleccione un idioma:");
        System.out.println("1. Español");
        System.out.println("2. English");
    }
    /**
     * Muestra la lista de libros disponibles.
     **/
    private static void mostrarLibros()
    {
        System.out.println("Seleccione un libro:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
    }
}
