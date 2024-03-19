package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza la potencia de dos números.
 **/

public class Potencia
{
    public static void potencia()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        int resultado = 1;
        for (int i = 0; i < exponente; i++)
        {
            resultado *= base;
        }
        System.out.println("El resultado de la potencia es: " + resultado);
        scanner.close();
    }
}
