package edu.pao.evidencia3.ui;

import java.util.Scanner;

public class CLI
{
    public static void showMenu ()
    {
        /**
         * Se imprime en pantalla las opciones de idioma para que
         * el usuario elija la deseada.
         */

        edu.pao.evidencia3.ui.Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        String idioma = null;
        switch (opcionIdioma)
        {
            case 1:
                idioma = "Español";
                break;
            case 2:
                idioma = "Ingles";
                break;
            case 3:
                idioma = "Chino";
            default:
                System.out.println("Opción inválida");
                return;
        }
        edu.paulina_vazquez.evidencia3.ui.Textos textos = Textos.crearTextos(idioma);
        System.out.println(textos.bienvenida());
        System.out.println(textos.opcion_de_juego());

        if (opcion_de_juego = 1){

        }
    }
}