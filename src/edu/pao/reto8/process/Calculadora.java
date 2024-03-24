package edu.pao.reto8.process;
import java.util.Scanner;
import java.util.ResourceBundle;

/**
 * Esta clase proporciona métodos para realizar operaciones matemáticas simples.
 **/

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
        System.out.print(messages.getString("ingresePrimerNumero"));
        int num1 = scanner.nextInt();
        System.out.print(messages.getString("ingreseSegundoNumero"));
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println(messages.getString("resultadoResta") + resultado);
        scanner.close();
    }
    public static void division()
    {
        System.out.print(messages.getString("ingreseDividendo"));
        int dividendo = scanner.nextInt();
        System.out.print(messages.getString("ingreseDivisor"));
        int divisor = scanner.nextInt();

        if (divisor == 0)
        {
            System.out.println(messages.getString("divisionPorCero"));
        } else
            {
            int cociente = 0;
            while (dividendo >= divisor)
            {
                dividendo -= divisor;
                cociente++;
            }
            System.out.println(messages.getString("resultadoDivision") + cociente);
            System.out.println(messages.getString("restoDivision") + dividendo);
        }
    }
    public static void multiplicacion()
    {
        System.out.print(messages.getString("ingresePrimerNumero"));
        int num1 = scanner.nextInt();
        System.out.print(messages.getString("ingreseSegundoNumero"));
        int num2 = scanner.nextInt();
        int resultado = 0;
        for (int i = 0; i < num2; i++)
        {
            resultado += num1;
        }
        System.out.println(messages.getString("resultadoMultiplicacion") + resultado);
    }
    public static void modulo()
    {
        System.out.print(messages.getString("ingreseDividendo"));
        int dividendo = scanner.nextInt();
        System.out.print(messages.getString("ingreseDivisor"));
        int divisor = scanner.nextInt();

        int residuo = dividendo;
        while (residuo >= divisor)
        {
            residuo -= divisor;
        }
        System.out.println(messages.getString("resultadoModulo") + residuo);
    }
    public static void potencia()
    {
        System.out.print(messages.getString("ingreseBase"));
        int base = scanner.nextInt();
        System.out.print(messages.getString("ingreseExponente"));
        int exponente = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < exponente; i++)
        {
            resultado *= base;
        }

        System.out.println(messages.getString("resultadoPotencia") + resultado);
    }
    public static void raiz()
    {
        System.out.print(messages.getString("ingreseNumeroRaiz"));
        int numero = scanner.nextInt();

        double raiz = calcularRaiz(numero);
        System.out.println(messages.getString("resultadoRaizCuadrada") + raiz);
    }
    private static double calcularRaiz(int numero)
    {
        double estimacion = numero / 2.0;
        double precision = 0.0001;

        while (true)
        {
            double nuevaEstimacion = (estimacion + numero / estimacion) / 2;

            if (Math.abs(estimacion - nuevaEstimacion) < precision)
            {
                break;
            }
            estimacion = nuevaEstimacion;
        }
        return estimacion;
    }
    public static void logaritmo()
    {
        System.out.print(messages.getString("ingreseNumeroLogaritmo"));
        int numero = scanner.nextInt();

        double logaritmo = calcularLogaritmo(numero);
        System.out.println(messages.getString("resultadoLogaritmo") + logaritmo);
    }
    private static double calcularLogaritmo(int numero)
    {
        int n = 50;
        double x = (numero - 1.0) / (numero + 1.0);
        double log = 0;

        for (int i = 1; i <= n; i += 2)
        {
            double potencia = 1.0;
            for (int j = 0; j < i; j++)
            {
                potencia *= x;
            }
            log += (1.0 / i) * potencia;
        }
        double resultado = 0;
        for (int i = 0; i < 2; i++)
        {
            resultado += log;
        }
        return resultado;
    }
    public static void potencia(Scanner scanner)
    {
        System.out.println(messages.getString("ingreseBase"));
        int base = scanner.nextInt();
        System.out.println(messages.getString("ingreseExponente"));
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println(messages.getString("resultadoPotencia") + resultado);
    }
    public static int calcularPotencia(int base, int exponente)
    {
        if (exponente == 0)
            return 1;

        int resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = realizarSuma(resultado, base);
        }
        return resultado;
    }
    public static int realizarSuma(int a, int b)
    {
        return a + b;
    }
}