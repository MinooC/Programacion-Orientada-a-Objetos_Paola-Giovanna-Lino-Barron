package edu.pao.evidencia3.process;

public class Tablero
{
    private char[][] celdas;

    public Tablero()
    {
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

    //esMovimientoValido(int row, int col): Verifica si un movimiento es válido dentro del tablero basándose en las siguientes condiciones:
    //    1.    La fila row y la columna col deben estar dentro de los límites del tablero, es decir, deben estar en el rango de 0 a 2.
    //    2.    La celda en la posición (row, col) debe estar vacía, representada por el carácter “-“.
    // Si ambas condiciones se cumplen, el método devuelve true, lo que indica que el movimiento es válido.
    // De lo contrario, devuelve false, indicando que el movimiento es inválido y no se puede realizar en el tablero.

    public boolean esMovimientoValido(int row, int col)
    {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && celdas[row][col] == '-';
    }
    public int getSize()
    {
        return celdas.length * celdas[0].length;
    }

    public int getFilas()
    {
        return celdas.length;
    }

    public int getColumnas()
    {
        return celdas[0].length;
    }

    // obtenerGanador analiza todas las posibles líneas ganadoras en el tablero y devuelve el símbolo del ganador si lo encuentra, o un guion si no hay ganador.

    public char obtenerGanador()
    {
        char ganador = '-';
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (celdas[i][0] != '-' && celdas[i][0] == celdas[i][1] && celdas[i][1] == celdas[i][2]) {
                ganador = celdas[i][0]; // Ganador en fila i
                break;
            }
            if (celdas[0][i] != '-' && celdas[0][i] == celdas[1][i] && celdas[1][i] == celdas[2][i]) {
                ganador = celdas[0][i]; // Ganador en columna i
                break;
            }
        }
        // Verificar diagonales
        if (ganador == '-' && celdas[0][0] != '-' && celdas[0][0] == celdas[1][1] && celdas[1][1] == celdas[2][2]) {
            ganador = celdas[0][0]; // Ganador en diagonal principal
        }
        if (ganador == '-' && celdas[0][2] != '-' && celdas[0][2] == celdas[1][1] && celdas[1][1] == celdas[2][0]) {
            ganador = celdas[0][2]; // Ganador en diagonal secundaria
        }
        return ganador;
    }

    // Este método simplemente llama al método obtenerGanador() y verifica si el resultado es diferente de un guion.
    // Si obtenerGanador() devuelve un guion, significa que no hay ganador en el tablero, por lo que hayGanador() devuelve false.
    // Si obtenerGanador() devuelve cualquier otro carácter que no sea un guion, significa que hay un ganador en el tablero, por lo que hayGanador() devuelve true.
    public boolean hayGanador()
    {
        return obtenerGanador() != '-';
    }
    public void mostrarResultado()
    {
        char ganador = obtenerGanador();
        if (ganador != '-')
        {
            //Me falta traducir dependiendo del idioma!!!
            System.out.println("El ganador es: " + ganador);
            if (ganador == simboloJugador)
            {
                System.out.println("¡Felicidades! ¡Has ganado!");
            }
        } else {
            System.out.println("El juego ha terminado en empate.");
        }
    }

}