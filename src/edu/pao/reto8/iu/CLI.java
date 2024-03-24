package edu.pao.reto8.iu;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CLI
{
    private static ResourceBundle messages;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

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
            System.out.println("Opción inválida, se seleccionará el idioma inglés por defecto. / Invalid choice. Defaulting to English.");
            Locale.setDefault(new Locale("en","US"));
        }
        messages = ResourceBundle.getBundle("MessageBundle",Locale.getDefault());

        System.out.println(messages.getString("menu"));
        int operationChoice = scanner.nextInt();

        switch (operationChoice)
        {
            case 1:
                break;

            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println(messages.getString("invalidChoice"));
                break;
        }
        scanner.close();
    }
}