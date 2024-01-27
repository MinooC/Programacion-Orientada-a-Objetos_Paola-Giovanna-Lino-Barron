package edu.pao.reto1.process;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar los cálculos que desee operar el usuario.
 **/
public class CalculadoraMasaCorporal
{
    /**
     * Este método sirve para calcular el índice de masa corporal de una persona con base en su peso
     * y su estatura.
     * @param estatura del paciente en centímetros
     * @param peso del paciente en kilogramos
     * @param return índice de masa corporal
     **/
    public static double calcularIndiceDeMasaCorporal()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la estatura en cm: ");
        double estatura = scanner.nextDouble();
/**
 * Se realiza el cálculo del índice de masa corporal.
 **/
        double indiceDeMasaCorporal;
        {
            estatura/=100;
            return peso /(estatura*estatura);
        }
    }
    /**
     * Una vez obtenidos los cálculos, este método sirve para interpretar el índice de masa corporal
     * de una persona con base a los datos proporcionandos anteriormente (peso y estatura).
     **/
    public static String interpretarIndiceMasaCorporal(double imc)
        {
            String value = "";
            if (imc<18)
            {
                value = "Peso bajo";
            }
            else if (imc<=24.99)
            {
                value = "Peso normal";
            }
            else if (imc<=29.99)
            {
                value = "Sobrepeso";
            }
            else if (imc<=34.99)
            {
                value = "Obesidad leve";
            }
            else if (imc<=39.99)
            {
                value = "Obesidad media";
            }
            else
            {
                value = "Obesidad morbida";
            }
            return value;
        }
    /**
     * Este método cálcula la masa corporal magra basándose en el peso, estatura y sexo.
     **/
    public static double calcularMasaCorporalMagra()
    {
        double masaMagra = 0;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la estatura en cm: ");
        double estatura = scanner.nextInt();

        System.out.println("Ingrese el sexo (hombre o mujer): ");
        String sexo = scanner.next().toLowerCase();
        /**
         * Dependiendo del sexo que ingrese el usuario se realizarán los cálculos correspondientes
         * para cada circunstancia.
         **/
        if ("mujer".equals(sexo))
        {
            masaMagra = (1.07 * peso) - 148 * (peso*peso) / (estatura*estatura);
        }
        else if ("hombre".equals(sexo))
        {
            masaMagra = (1.10 * peso) - 128 * (peso*peso) / (estatura*estatura);
        }
        else
        {
            System.out.println("Opción no válida.");
        }
        return masaMagra;
        /**
         * Por último, en la clase CLI se muestra en pantalla el resultado.
         **/
    }
    /**
     * Este método calcula el metabolismo basal de una persona, basándose en el peso, estatura, edad
     * y sexo.
     **/
    public static double calcularMetabolismoBasal()
    {
        double metabolismoBasal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la estatura en cm: ");
        double estatura = scanner.nextDouble();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el sexo (hombre o mujer): ");
        String sexo = scanner.next().toLowerCase();
        /**
         * Dependiendo del sexo que ingrese el usuario se realizarán los cálculos correspondientes
         * para cada circunstancia.
         **/
        if ("mujer".equals(sexo))
        {
            metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        }
        else if ("hombre".equals(sexo))
        {
            metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }
        else
        {
            System.out.println("Opción no válida.");
        }
        return metabolismoBasal;
        /**
         * Por último, en la clase CLI se muestra el resultado en pantalla.
         **/
    }
}
