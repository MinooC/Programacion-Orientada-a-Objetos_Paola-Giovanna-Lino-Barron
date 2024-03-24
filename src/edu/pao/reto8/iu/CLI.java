package edu.pao.reto8.iu;
import edu.pao.reto8.process.Calculadora;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Esta clase sirve para que el usuario interactue con la interfaz, escogiendo su idioma en el que la
 * interfaz estará.
 **/

public class CLI
{
    private static ResourceBundle messages;
    private static Scanner scanner = new Scanner(System.in);
    public static void launchApp()
    {
        System.out.println("Seleccione el idioma / Select language:");
        System.out.println("1. Español");
        System.out.println("2. English");
        int idiomaSeleccionado = scanner.nextInt();
        scanner.nextLine();

        if (idiomaSeleccionado == 1)
        {
            Locale.setDefault(new Locale("en", "US"));
        } else if (idiomaSeleccionado == 2)
        {
            Locale.setDefault(new Locale("es", "ES"));
        } else
        {
            System.out.println("Opción inválida, se seleccionará el idioma español por defecto. / Invalid choice. Defaulting to Spanish.");
            Locale.setDefault(new Locale("es","ES"));
        }
        messages = ResourceBundle.getBundle("MessageBundle",Locale.getDefault());

        System.out.println(messages.getString("menu"));
        int operationChoice = scanner.nextInt();

        switch (operationChoice)
        {
            case 1:
                Calculadora.suma();
                break;
            case 2:
                Calculadora.resta();
                break;
            case 3:
                Calculadora.division();
                break;
            case 4:
                Calculadora.multiplicacion();
                break;
            case 5:
                Calculadora.modulo();
                break;
            case 6:
                Calculadora.potencia();
                break;
            case 7:
                Calculadora.raiz();
                break;
            case 8:
                Calculadora.logaritmo();
                break;
            default:
                System.out.println(messages.getString("opcionInvalida"));
                break;
        }
        scanner.close();
    }
}