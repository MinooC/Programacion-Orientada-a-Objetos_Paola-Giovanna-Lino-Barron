package edu.pao.evidencia2.ui;
import java.util.Scanner;

public class CLI
{
    public static void showMenu(){
        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionDeIdioma = scanner.nextInt();

        switch (opcionDeIdioma) {
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
        }
        System.out.println(Textos.USUARIO);
        String usuario = scanner.nextLine();
        System.out.println(Textos.CONTRASENA);
        String contrasena = scanner.nextLine();

        System.out.println(Textos.MONTO_TOTAL);
        scanner.close();

    }
}
