package edu.pao.reto7.process;
import java.util.Scanner;

/**
 * Esta clase realiza la suma de dos números.
 **/

public class Suma
{
    public static void suma()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
        scanner.close();
    }

}
