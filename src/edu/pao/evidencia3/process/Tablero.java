package edu.pao.evidencia3.process;

public class Tablero
{
    private char[][] celdas;

    public Tablero() {
        celdas = new char[3][3];
        iniciarTablero();
    }

    private void iniciarTablero()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                celdas[i][j] = '-';
            }
        }
    }

    public void mostrarTablero()
    {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(celdas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean colocarSimbolo(int row, int col, char symbol)
    {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || celdas[row][col] != '-')
        {
            return false; // Movimiento inválido
        }
        celdas[row][col] = symbol;
        return true;
    }

    public void limpiarCasilla(int row, int col)
    {
        celdas[row][col] = '-';
    }

    public boolean verificarGanador(char symbol)
    {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++)
        {
            if (celdas[i][0] == symbol && celdas[i][1] == symbol && celdas[i][2] == symbol)
            {
                return true; // Ganador en fila i
            }
            if (celdas[0][i] == symbol && celdas[1][i] == symbol && celdas[2][i] == symbol)
            {
                return true; // Ganador en columna i
            }
        }
        // Verificar diagonales
        if (celdas[0][0] == symbol && celdas[1][1] == symbol && celdas[2][2] == symbol)
        {
            return true; // Ganador en diagonal principal
        }
        if (celdas[0][2] == symbol && celdas[1][1] == symbol && celdas[2][0] == symbol)
        {
            return true; // Ganador en diagonal secundaria
        }
        return false;
    }

    public boolean tableroLleno()
    {
        // Comprobar si todas las celdas están ocupadas
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (celdas[i][j] == '-')
                {
                    return false; // Todavía hay celdas vacías
                }
            }
        }
        return true; // Tablero completo (empate)
    }

    public char obtenerSimbolo(int row, int col)
    {
        return celdas[row][col];
    }

    public void reiniciarTablero()
    {
        iniciarTablero();
    }
}

