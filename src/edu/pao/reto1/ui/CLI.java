package edu.pao.reto1.ui;

import edu.pao.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

/**
 * Esta clase sirve para que el usuario interactue con la interfaz, ingresando sus datos (peso y estatura)
 * dependiendo del cálculo que necesite realizar.
 **/
public class CLI
{
    public static void showMenu();
    {
        System.out.println("Ingrese la opción para el cálculo que desea operar:");
        System.out.println("A) Cálculo de masa corporal (índice de masa corporal).");
        System.out.println("B) Cálculo de masa corporal magra.");
        System.out.println("C) Cálculo de metabolismo basal (gasto energético basal).");
        System.out.println("D) Salir.");

        {
            public static void launchApp()
                Scanner scanner = new Scanner(System.in);
                while (true)
                {
                    showMenu();
                    String opcion = scanner.nextLine();


                    switch (opcion)
                    {
                        case "A":
                           double indiceMasaCorporal = CalculadoraMasaCorporal.calcularIndiceMasaCorporal(estatura: 173, peso: 60)
                            String estado = clasificarIndiceMasaCorporal(indiceMasaCorporal);
                            System.out.printf("Tu índice de masa corporal es %f");
                            break;

                        case "B":
                            CalcularMasaCorporalMagra();

                            break;

                        case "C":
                            CalcularMetabolismoBasal();

                            break;

                        case "D":
                            Salir();

                            break;

                        default:
                            System.out.println("Opción no válida. Por favor, seleccione A, B o C.");


                    }
                }
        }
    }

}
