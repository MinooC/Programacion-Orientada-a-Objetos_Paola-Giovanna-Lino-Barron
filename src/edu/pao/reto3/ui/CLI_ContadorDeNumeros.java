package edu.pao.reto3.ui;

import edu.pao.reto3.process.ContadorDeNumeros;

import java.util.Scanner;

public class CLI_ContadorDeNumeros
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int filas, columnas;

        do
        {
            System.out.print("Ingrese la cantidad de filas y columnas (N x M): ");
            filas = scanner.nextInt();
            columnas = scanner.nextInt();

            if (filas != columnas)
            {
                System.out.println("Error: N y M deben tener el mismo valor. Por favor, inténtelo de nuevo.");
            }
        }
        while (filas != columnas);

        ContadorDeNumeros contador = new ContadorDeNumeros (filas, columnas);
        contador.mostrarResultados();
    }
}



