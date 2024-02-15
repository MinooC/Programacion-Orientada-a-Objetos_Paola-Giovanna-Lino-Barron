package edu.pao.reto3.process;

import java.util.Random;

public class ContadorDeNumeros
{
    private int [][] matriz;
    private int filas, columnas;

    public ContadorDeNumeros(int filas, int columnas)
    {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
        llenarMatriz();
    }
    private void llenarMatriz()
    {
        Random random = new Random();

        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j  < columnas; j++)
            {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }
    public void mostrarResultados()
    {
        int paresFilas, imparesFilas;
        int paresColumnas, imparesColumnas;
        int sumaTotal = 0;

        System.out.println("\nConteo de números pares e impares:");
        for (int i = 0; i < filas; i++)
        {
            paresFilas = 0;
            imparesFilas = 0;

            for (int j = 0; j < columnas; j++)
            {
                sumaTotal += matriz[i][j];
                if (matriz[i][j] % 2 == 0)
                {
                    paresFilas++;
                }
                else
                {
                    imparesFilas++;
                }
            }
            System.out.printf("Fila %d: Pares = %d, Impares = %d\n", i + 1, paresFilas, imparesFilas);
        }
        for (int j = 0; j < columnas; j++)
        {
            paresColumnas = 0;
            imparesColumnas = 0;

          for (int i = 0; i < filas; i++)
          {
              if (matriz[i][j] % 2 == 0)
              {
                  paresColumnas++;
              }
              else
              {
                  imparesColumnas++;
              }
          }
            System.out.printf("Columna %d: Pares = %d, Impares = %d\n", j + 1, paresColumnas, imparesColumnas);
        }
        System.out.println("\nSuma total de todos los números en la matriz: " + sumaTotal);
    }
}
