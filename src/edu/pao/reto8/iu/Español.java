package edu.pao.reto8.iu;
import java.util.Scanner;

public class Español
{
    public static void ShowMenu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido/a");
        System.out.println("Menú de opciones:");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) Módulo");
        System.out.println("5) Potencia");
        System.out.println("Ingrese la operación que desee realizar:");
        int opcion = scanner.nextInt();

        switch (opcion)
        {
            case 1:
                Suma.suma();
                break;
            case 2:
                Resta.resta();
                break;
            case 3:Multiplicacion.multiplicacion();
                break;
            case 4:
                Modulo.modulo();
                break;
            case 5:
                Potencia.potencia();
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
    }

}
