package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza la multiplicación de dos números.
 **/

public class Multiplicacion
{
    public static void multiplicacion()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = 0;
        for (int i = 0; i < num2; i++)
        {
            resultado += num1;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
        scanner.close();
    }
}
