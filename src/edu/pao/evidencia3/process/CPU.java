package edu.pao.evidencia3.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Representa un jugador controlado por la computadora en el juego. La CPU puede ajustar su nivel de dificultad
 * para proporcionar una experiencia de juego variada.
 */

public class CPU extends Jugador
{
    private Dificultad dificultad;

    public CPU(String nombre, char simbolo, char simboloPersona, Dificultad dificultad)
    {
        super(nombre, simbolo, simboloPersona); // Llama al constructor de la superclase Jugador
        this.dificultad = dificultad;
        this.simbolo = obtenerSimboloAleatorioExcepto(simbolo, simboloPersona); // Actualiza el símbolo del CPU
    }
    private char obtenerSimboloAleatorioExcepto(char simboloCPU, char simboloPersona)
    {
        // Define un conjunto de símbolos posibles para elegir
        char[] simbolosPosibles = {'X', 'O', '@', '?', '*', '$', '#', 'A', 'G', 'H'};

        // Convierte el conjunto de símbolos posibles en una lista para facilitar la manipulación
        List<Character> simbolosLista = new ArrayList<>();
        for (char simbolo : simbolosPosibles)
        {
            simbolosLista.add(simbolo);
        }

        // Elimina el símbolo de la CPU y el símbolo de la persona de la lista de símbolos posibles
        simbolosLista.remove(Character.valueOf(simboloCPU));
        simbolosLista.remove(Character.valueOf(simboloPersona));

        // Elige un símbolo aleatorio de los restantes en la lista
        Random random = new Random();
        return simbolosLista.get(random.nextInt(simbolosLista.size()));
    }

    /**
     * Realiza el movimiento de la CPU en el tablero, de acuerdo con su nivel de dificultad.
     *
     * @param tablero El tablero en el que se realizará el movimiento.
     */

    // Se agrega una variable de instancia para almacenar el nivel de dificultad y ajustar la lógica de movimiento en consecuencia.
    @Override
    public void realizarMovimiento(Tablero tablero)
    {
        switch (dificultad)
        {
            case FACIL:
                movimientoFacil(tablero);
                break;
            case INTERMEDIO:
                movimientoIntermedio(tablero);
                break;
            case DIFICIL:
                movimientoDificil(tablero);
                break;
            default:
                throw new IllegalArgumentException("Opción no válida.");
        }
    }

    /**
     * Realiza un movimiento aleatorio en el tablero.
     *
     * @param tablero El tablero en el que se realizará el movimiento.
     */


    private void movimientoFacil(Tablero tablero)
    {
        // Lógica de movimiento fácil
        Random random = new Random();
        int row, col;
        do
        {
            row = random.nextInt(tablero.getFilas());
            col = random.nextInt(tablero.getColumnas());
        } while (!tablero.colocarSimbolo(row, col, simbolo));
    }

    /**
     * Implementa una estrategia intermedia para la CPU, que intenta bloquear al jugador humano si está a punto de ganar
     * y también intenta ganar si es posible, de lo contrario realiza un movimiento aleatorio.
     *
     * @param tablero El tablero en el que se realizará el movimiento.
     */


    private void movimientoIntermedio(Tablero tablero)
    {
        // Bloquear al jugador humano si está a punto de ganar
        if (intentarBloquear(tablero, simboloPersona))
        {
            return;
        }

        // Intentar ganar si es posible
        if (intentarGanar(tablero))
        {
            return;
        }

        // Si no se puede ganar ni bloquear, realizar un movimiento aleatorio
        movimientoFacil(tablero);
    }

    /**
     * Intenta bloquear al jugador humano si está a punto de ganar.
     *
     * @param tablero El tablero en el que se verificarán las posiciones.
     * @return true si se bloqueó un movimiento del jugador humano, false de lo contrario.
     */

    private boolean intentarBloquear(Tablero tablero, char simboloJugador)
    {
        for (int row = 0; row < tablero.getFilas(); row++)
        {
            for (int col = 0; col < tablero.getColumnas(); col++)
            {
                if (tablero.esMovimientoValido(row, col))
                {
                    tablero.colocarSimbolo(row, col, simboloJugador);
                    if (tablero.hayGanador())
                    {
                        tablero.limpiarCasilla(row, col);
                        tablero.colocarSimbolo(row, col, simbolo);
                        return true;
                    }
                    tablero.limpiarCasilla(row, col);
                }
            }
        }
        return false;
    }

    /** * Intenta ganar el juego si es posible.
     *
     * @param tablero El tablero en el que se verificarán las posiciones.
     * @return true si la CPU ganó el juego, false de lo contrario.
     */
    // Revisa todas las posibles combinaciones de líneas ganadoras y verificar si la CPU tiene dos símbolos en una línea y
    // la tercera celda está vacía.
    // Si encuentra tal línea, la CPU coloca su símbolo en esa celda para ganar el juego.
    public boolean intentarGanar(Tablero tablero)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // Verificar filas
                if (tablero.obtenerSimbolo(i, j) == simbolo && tablero.obtenerSimbolo(i, (j + 1) % 3) == simbolo && tablero.obtenerSimbolo(i, (j + 2) % 3) == '-')
                {
                    tablero.colocarSimbolo(i, (j + 2) % 3, simbolo);
                    return true;
                }
                // Verificar columnas
                if (tablero.obtenerSimbolo(j, i) == simbolo && tablero.obtenerSimbolo((j + 1) % 3, i) == simbolo && tablero.obtenerSimbolo((j + 2) % 3, i) == '-')
                {
                    tablero.colocarSimbolo((j + 2) % 3, i, simbolo);
                    return true;
                }
            }
            // Verificar diagonales
            if (tablero.obtenerSimbolo(i, i) == simbolo && tablero.obtenerSimbolo((i + 1) % 3, (i + 1) % 3) == simbolo && tablero.obtenerSimbolo((i + 2) % 3, (i + 2) % 3) == '-')
            {
                tablero.colocarSimbolo((i + 2) % 3, (i + 2) % 3, simbolo);
                return true;
            }
            if (tablero.obtenerSimbolo(i, 2 - i) == simbolo && tablero.obtenerSimbolo((i + 1) % 3, 2 - ((i + 1) % 3)) == simbolo && tablero.obtenerSimbolo((i + 2) % 3, 2 - ((i + 2) % 3)) == '-')
            {
                tablero.colocarSimbolo((i + 2) % 3, 2 - ((i + 2) % 3), simbolo);
                return true;
            }
        }
        return false; // No hay oportunidad de ganar
    }

    /**
     * Implementa una estrategia difícil para la CPU, utilizando el algoritmo Minimax para encontrar el movimiento óptimo.
     * @param tablero El tablero en el que se realizará el movimiento.
     */

    private void movimientoDificil(Tablero tablero)
    {
        int[] mejorMovimiento = minimax(tablero, simbolo, -1000, 1000, true);
        tablero.colocarSimbolo(mejorMovimiento[1], mejorMovimiento[2], simbolo);
    }

    // Se utiliza el algoritmo Minimax para encontrar el movimiento óptimo para la CPU,
    // asumiendo que el oponente jugará de manera óptima támbien.
    private int[] minimax(Tablero tablero, char jugador, int alpha, int beta, boolean maximizando)
    {
        if (tablero.hayGanador())
        {
            char ganador = tablero.obtenerGanador();
            if (ganador == simbolo)
            {
                return new int[] {1000, 0, 0}; // La CPU gana
            } else if (ganador == jugador)
            {
                return new int[] {-1000, 0, 0}; // El jugador humano gana
            } else
            {
                return new int[] {0, 0, 0}; // Empate
            }
        }

        List<int[]> movimientosDisponibles = new ArrayList<>();
        for (int i = 0; i < tablero.getSize(); i++)
        {
            int row = i / tablero.getColumnas();
            int col = i % tablero.getColumnas();
            if (tablero.esMovimientoValido(row, col))
            {
                movimientosDisponibles.add(new int[] {row, col});
            }
        }

        int mejorValor = maximizando ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int[] mejorMovimiento = new int[] {0, 0, 0};
        for (int[] movimiento : movimientosDisponibles)
        {
            char simboloJugador = jugador;
            tablero.colocarSimbolo(movimiento[0], movimiento[1], jugador);
            int[] resultado = minimax(tablero, jugador == simbolo ? simboloJugador : simbolo, alpha, beta, !maximizando);
            tablero.limpiarCasilla(movimiento[0], movimiento[1]);
            int valorMovimiento = resultado[0];
            if (maximizando)
            {
                if (valorMovimiento > mejorValor)
                {
                    mejorValor = valorMovimiento;
                    mejorMovimiento = movimiento;
                    alpha = Math.max(alpha, mejorValor);
                }
            } else
            {
                if (valorMovimiento < mejorValor)
                {
                    mejorValor = valorMovimiento;
                    mejorMovimiento = movimiento;
                    beta = Math.min(beta, mejorValor);
                }
            }
            if (beta <= alpha)
            {
                break;
            }
        }

        return new int[] {mejorValor, mejorMovimiento[0], mejorMovimiento[1]};
    }

    /**
     * Enumeración que representa los niveles de dificultad disponibles para la CPU.
     */
    public enum Dificultad
    {
        FACIL, INTERMEDIO, DIFICIL
    }
}