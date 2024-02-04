package edu.pao.reto2.ui;

import edu.pao.reto2.process.CalculadoraPapel;

import java.util.Scanner;

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
        System.out.println("Menú de opciones:");
        System.out.println("A) Comprar cajas de papel.");
        System.out.println("B) Vender cajas de papel.");
        System.out.println("C) Mostrar reporte.");
        System.out.println("D) Salir.");

    }
    public static void launchApp()
    {
        Scanner scanner = new Scanner(System.in);
        CalculadoraPapel calculadora = new CalculadoraPapel();

        while (true)
        {
            showMenu();
            String opcion = scanner.nextLine();
            /**
             * Dependiendo de la opción solicitada, el programa se dirigirá automáticamente al método donde se encuentran
             * las operaciones necesarias y hará los cálculos correspondientes. Finalmente, mostrándole
             * el resultado en pantalla.
             **/
            switch (opcion.toUpperCase())
            {
                case "A":
                    calculadora.comprarCajas(scanner);

                    break;

                case "B":
                    calculadora.venderCajas(scanner);

                    break;

                case "C":
                    calculadora.mostrarReporte();

                    break;

                case "D":
                    scanner.close();
                    calculadora.mostrarResumen();
                    System.out.println("¡Gracias por usar el programa!");
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione A, B, C o D.");
            }
        }
    }
}