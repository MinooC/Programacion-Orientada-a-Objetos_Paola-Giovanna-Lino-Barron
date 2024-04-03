package edu.pao.evidencia2.ui;
import java.util.Scanner;

/**
 * Esta clase es la encargada de mostrar las opciones de
 * la interfaz del programa al usuario.
 */

public class CLI
{
    /**
     * Primero se muestra el menu de opciones de idioma al
     * usuiario. Dependiendo de lo que este elija e; programa
     * estara en español o ingles.
     */

    public static void showMenu()
    {
        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionDeIdioma = scanner.nextInt();

        switch (opcionDeIdioma)
        {
            case 1:
                edu.pao.evidencia2.ui.Textos.setEsp();
                break;
            case 2:
                edu.pao.evidencia2.ui.Textos.setIng();
                break;
            default:
                System.out.println("Opcion no valida, por favor intentelo de nuevo.");
                System.out.println("Invalid option, please try again.");
                return;
            /**
             * Se le muestra al usuario el espacio para que ingrese su usuario y contrasena.
             */
        }
        System.out.println(Textos.USUARIO);
        String usuario = scanner.nextLine();
        System.out.println(Textos.CONTRASENA);
        String contrasena = scanner.nextLine();

        System.out.println(Textos.MONTO_TOTAL);
        scanner.close();
        /**
         * Se imprime en pantalla el monto total del proceso y el
         * scanner se cierra.
         */
    }
}
