package edu.pao.reto1.ui;

import edu.pao.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

/**
 * Esta clase sirve para que el usuario interactue con la interfaz, ingresando sus datos (peso y estatura)
 * dependiendo del cálculo que necesite realizar.
 **/
public class CLI
{
    public static void main(String[] args)
    {
        launchApp();
    }
    /**
     * Este método mostrará en pantalla el menú, junto con las opciones de las operaciones que el usuario
     * puede realizar.
     **/
    public static void showMenu()
    {
        System.out.println("Ingrese la opción para el cálculo que desea operar:");
        System.out.println("A) Cálculo de masa corporal (índice de masa corporal).");
        System.out.println("B) Cálculo de masa corporal magra.");
        System.out.println("C) Cálculo de metabolismo basal (gasto energético basal).");
        System.out.println("D) Salir.");
    }
    /**
     * Este método es el que permitirá ver al usuario los resultados en base al cálculo que eligió en el menú.
     **/
    public static void launchApp()
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            showMenu();
            String opcion = scanner.nextLine();
            /**
             * Dependiendo de la operación solicitada, el programa se dirigirá automáticamente al método donde se encuentran
             ** las operaciones necesarias y hará los cálculos correspondientes. Finalmente, mostrándole
             * el resultado en pantalla.
             **/
            switch (opcion.toUpperCase())
            {
                case "A":
                    double indiceMasaCorporal = CalculadoraMasaCorporal.calcularIndiceDeMasaCorporal();
                    String estado = CalculadoraMasaCorporal.interpretarIndiceMasaCorporal(indiceMasaCorporal);
                    System.out.println("Tu índice de masa corporal es "+ indiceMasaCorporal + " y tu estado es: " + estado);
                    break;

                case "B":
                    double masaMagra = CalculadoraMasaCorporal.calcularMasaCorporalMagra();
                    System.out.println("Masa Corporal Magra: " + masaMagra + " kg");
                    break;

                case "C":
                    double metabolismoBasal = CalculadoraMasaCorporal.calcularMetabolismoBasal();
                    System.out.println("Gasto Energético Basal: " + metabolismoBasal);
                    break;

                case "D":
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione A, B, C o D.");
            }
        }
    }
}



