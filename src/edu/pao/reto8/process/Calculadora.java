package edu.pao.reto8.process;
import java.util.Scanner;
import java.util.ResourceBundle;

public class Calculadora
{
    private static Scanner scanner = new Scanner(System.in);
    private static ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");
    public static void suma()
    {
        System.out.print(messages.getString("ingresePrimerNumero"));
        int num1 = scanner.nextInt();
        System.out.print(messages.getString("ingreseSegundoNumero"));
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println(messages.getString("resultadoSuma") + resultado);
        scanner.close();
    }
    public static void resta()
    {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
        scanner.close();
    }
    public static void division()
    {
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
    public  static void multiplicacion()
    {
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
    public static void modulo()
    {
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
    public static void potencia()
    {
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
    public static void raiz()
    {
        System.out.print("Ingrese el número para calcular su raíz cuadrada: ");
        int numero = scanner.nextInt();

        double raiz = calcularRaiz(numero);
        System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + raiz);
    }
    private static double calcularRaiz(int numero)
    {
        double estimacion = numero / 2.0;
        double precision = 0.0001; // Precisión deseada

        while (Math.abs(estimacion * estimacion - numero) > precision) {
            estimacion = (estimacion + numero / estimacion) / 2;
        }

        return estimacion;
    }
    public static void logaritmo()
    {
        System.out.print("Ingrese el número para calcular su logaritmo natural: ");
        int numero = scanner.nextInt();

        double logaritmo = calcularLogaritmo(numero);
        System.out.println("El logaritmo natural de " + numero + " es aproximadamente: " + logaritmo);
    }

    private static double calcularLogaritmo(int numero)
    {
        int n = 50;
        double x = (numero - 1.0) / (numero + 1.0);
        double log = 0;

        for (int i = 1; i <= n; i += 2) {
            log += (1.0 / i) * potencia(x, i);
        }

        return 2 * log;
    }
    private static double potencia(double base, int exponente)
    {
        double resultado = 1.0;

        for (int i = 0; i < exponente; i++)
        {
            resultado *= base;
        }

        return resultado;
    }
     scanner.close();
}