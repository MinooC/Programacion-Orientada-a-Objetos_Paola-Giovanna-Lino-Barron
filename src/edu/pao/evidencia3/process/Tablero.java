package edu.pao.evidencia3.process;

import edu.pao.evidencia3.ui.Textos;

/**
 * Representa el tablero de juego del Gato. Contiene métodos para inicializar el tablero, mostrarlo en la consola,
 * realizar movimientos, verificar el estado del juego (ganador, empate, etc.) y reiniciar el tablero.
 */

public class Tablero
{
    private char[][] celdas;

    public Tablero()
    {
        celdas = new char[3][3];
        iniciarTablero();
    }

    /**
     * Inicializa el tablero llenando todas las celdas con '-' para representar que están vacías.
     */
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


    /** Muestra el tablero actual en la consola.
     **/

    public void mostrarTablero()
    {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++)
            {
                System.out.print(celdas[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Coloca el símbolo especificado en la fila y columna dadas si la celda está vacía.
     *
     * @param row La fila donde se colocará el símbolo.
     * @param col La columna donde se colocará el símbolo.
     * @param symbol El símbolo a colocar en la celda.
     * @return true si el movimiento es válido y se realiza correctamente, false de lo contrario.
     */

    public boolean colocarSimbolo(int row, int col, char symbol)
    {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || celdas[row][col] != '-')
        {
            return false; // Movimiento inválido
        }
        celdas[row][col] = symbol;
        return true;
    }

    /** Limpia la celda especificada, colocando '-' para indicar que está vacía.
     */

    public void limpiarCasilla(int row, int col) {
        celdas[row][col] = '-';
    }


    /**
     * Verifica si el jugador representado por el símbolo dado ha ganado en el tablero actual.
     * * @param symbol El símbolo del jugador a verificar.
     * @return true si el jugador ha ganado, false de lo contrario.
     */

    public boolean verificarGanador(char symbol)
    {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (celdas[i][0] == symbol && celdas[i][1] == symbol && celdas[i][2] == symbol) {
                return true; // Ganador en fila i
            }
            if (celdas[0][i] == symbol && celdas[1][i] == symbol && celdas[2][i] == symbol) {
                return true; // Ganador en columna i
            }
        }
        // Verificar diagonales
        if (celdas[0][0] == symbol && celdas[1][1] == symbol && celdas[2][2] == symbol) {
            return true; // Ganador en diagonal principal
        }
        if (celdas[0][2] == symbol && celdas[1][1] == symbol && celdas[2][0] == symbol) {
            return true; // Ganador en diagonal secundaria
        }
        return false;
    }

    /** Verifica si el tablero está lleno (empate).
     */

    public boolean tableroLleno()
    {
        // Comprobar si todas las celdas están ocupadas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (celdas[i][j] == '-') {
                    return false; // Todavía hay celdas vacías
                }
            }
        }
        return true; // Tablero completo (empate)
    }

    /** Obtiene el símbolo en la celda especificada por fila y columna.
     */
    public char obtenerSimbolo(int row, int col) {
        return celdas[row][col];
    }

    /** Reinicia el tablero, llenándolo nuevamente con celdas vacías.
     */

    public void reiniciarTablero() {
        iniciarTablero();
    }

    //esMovimientoValido(int row, int col): Verifica si un movimiento es válido dentro del tablero basándose en las siguientes condiciones:
    //    1.    La fila row y la columna col deben estar dentro de los límites del tablero, es decir, deben estar en el rango de 0 a 2.
    //    2.    La celda en la posición (row, col) debe estar vacía, representada por el carácter “-“.
    // Si ambas condiciones se cumplen, el método devuelve true, lo que indica que el movimiento es válido.
    // De lo contrario, devuelve false, indicando que el movimiento es inválido y no se puede realizar en el tablero.


    /**
     * Verifica si un movimiento en la fila y columna dadas es válido.
     *
     * @param row La fila del movimiento.
     * @param col La columna del movimiento.
     * @return true si el movimiento es válido, false de lo contrario.
     */

    public boolean esMovimientoValido(int row, int col)
    {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && celdas[row][col] == '-';
    }

    public int getSize() {
        return celdas.length * celdas[0].length;
    }

    public int getFilas() {
        return celdas.length;
    }

    public int getColumnas() {
        return celdas[0].length;
    }

    /**
     * Obtiene el símbolo del jugador ganador, si lo hay, o '-' si no hay ganador.
     *
     * @return El símbolo del jugador ganador o '-' si no hay ganador.
     */

    // obtenerGanador analiza todas las posibles líneas ganadoras en el tablero y devuelve el símbolo del ganador si lo encuentra, o un guion si no hay ganador.
    public char obtenerGanador()
    {
        char ganador = '-';
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++)
        {
            if (celdas[i][0] != '-' && celdas[i][0] == celdas[i][1] && celdas[i][1] == celdas[i][2])
            {
                ganador = celdas[i][0]; // Ganador en fila i
                break;
            }
            if (celdas[0][i] != '-' && celdas[0][i] == celdas[1][i] && celdas[1][i] == celdas[2][i])
            {
                ganador = celdas[0][i]; // Ganador en columna i
                break;
            }
        }
        // Verificar diagonales
        if (ganador == '-' && celdas[0][0] != '-' && celdas[0][0] == celdas[1][1] && celdas[1][1] == celdas[2][2])
        {
            ganador = celdas[0][0]; // Ganador en diagonal principal
        }
        if (ganador == '-' && celdas[0][2] != '-' && celdas[0][2] == celdas[1][1] && celdas[1][1] == celdas[2][0])
        {
            ganador = celdas[0][2]; // Ganador en diagonal secundaria
        }
        return ganador;
    }

    /**
     * Verifica si hay un ganador en el tablero.
     *
     * @return true si hay un ganador, false si no lo hay.
    */

    // Este método simplemente llama al método obtenerGanador() y verifica si el resultado es diferente de un guion.
    // Si obtenerGanador() devuelve un guion, significa que no hay ganador en el tablero, por lo que hayGanador() devuelve false.
    // Si obtenerGanador() devuelve cualquier otro carácter que no sea un guion, significa que hay un ganador en el tablero, por lo que hayGanador() devuelve true.
    public boolean hayGanador()
    {
        return obtenerGanador() != '-';
    }

    edu.pao.evidencia3.ui.Textos textos = Textos.crearTextos("");
    public void mostrarResultado(char simbolo)
    {
        char ganador = obtenerGanador();
        if (ganador != '-')
        {
            System.out.println(textos.ganador() + ganador);
            if (ganador == simbolo)
            {
                System.out.println(textos.felicitacion());
            }
        } else
        {
            System.out.println(textos.empate());
        }
    }
}