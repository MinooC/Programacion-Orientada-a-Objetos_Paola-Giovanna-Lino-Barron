package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza la resta de dos números.
 **/

public class Resta
{
    public static void resta()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        scanner.close();
    }

}
