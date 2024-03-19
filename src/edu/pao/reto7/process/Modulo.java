package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza el modulo de dos números.
 **/

public class Modulo
{
    public static void modulo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        int residuo = dividendo;
        while (residuo >= divisor)
        {
            residuo -= divisor;
        }
        System.out.println("El resultado del módulo es: " + residuo);
        scanner.close();
    }
}