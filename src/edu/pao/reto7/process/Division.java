package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza la división de dos números.
 **/

public class Division
{
    public static void division()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        int cociente = 0;
        while (dividendo >= divisor)
        {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("El resultado de la división es: " + cociente);
        scanner.close();
    }

}
