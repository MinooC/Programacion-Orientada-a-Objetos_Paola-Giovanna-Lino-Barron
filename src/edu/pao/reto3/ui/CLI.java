package edu.pao.reto3.ui;

import edu.pao.reto3.process.Diccionario;

import java.util.Scanner;

public class CLI
{
    private Diccionario diccionario;
    private Scanner scanner;

    public CLI(Diccionario diccionario)
    {
        this.diccionario = diccionario;
        this.scanner = new Scanner(System.in);
    }

    public void launchApp()
    {
        while (true)
        {
            showMenu();
            String opcion = scanner.nextLine();

            switch (opcion.toUpperCase())
            {
                case "A":
                    diccionario.listarPalabras();
                    break;
                case "B":
                    System.out.println("\n---¿Qué palabra desea saber su significado?---");
                    String palabraBuscar = scanner.nextLine();
                    String significado = diccionario.buscarSignificado(palabraBuscar);
                    System.out.println(significado);
                    break;
                case "C":
                    diccionario.mostrarDetallesDiccionario();
                    break;
                case "D":
                    scanner.close();
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
    private void showMenu()
    {
        System.out.println("Diccionario:");
        System.out.println("A) Listar palabras del diccionario.");
        System.out.println("B) Buscar palabras en el diccionario.");
        System.out.println("C) Detalle del diccionario.");
        System.out.println("D) Salir del programa.");
        System.out.print("Ingrese la opción deseada: ");
    }
}