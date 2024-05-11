package edu.pao.evidencia3.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class CPU extends Jugador
{
    private Dificultad dificultad;

    public CPU(String nombre, char simbolo, Dificultad dificultad)
    {
        super(nombre, simbolo);
        this.dificultad = dificultad;
    }

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

    private void movimientoIntermedio(Tablero tablero)
    {
        // Bloquear al jugador humano si está a punto de ganar
        if (intentarBloquear(tablero))
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

    private boolean intentarBloquear(Tablero tablero)
    {
        // Buscar si hay una jugada del jugador que pueda resultar en una victoria
        for (int row = 0; row < tablero.getFilas(); row++)
        {
            for (int col = 0; col < tablero.getColumnas(); col++)
            {
                if (tablero.esMovimientoValido(row, col))
                {
                    tablero.colocarSimbolo(row, col, simboloJugadorHumano);
                    if (tablero.hayGanador())
                    {
                        tablero.limpiarCasilla(row, col); // Deshacer movimiento
                        tablero.colocarSimbolo(row, col, simbolo); // Bloquear movimiento
                        return true;
                    }
                    tablero.limpiarCasilla(row, col); // Deshacer movimiento
                }
            }
        }
        return false;
    }

    private void movimientoDificil(Tablero tablero)
    {
        int[] mejorMovimiento = minimax(tablero, simbolo, -1000, 1000, true);
        tablero.colocarSimbolo(mejorMovimiento[1], mejorMovimiento[2], simbolo);
    }

    // Se utiliza el algoritmo Minimax para encontrar el movimiento óptimo para la CPU, asumiendo que el oponente jugará de manera óptima támbien.
    private int[] minimax(Tablero tablero, char jugador, int alpha, int beta, boolean maximizando)
    {
        if (tablero.hayGanador())
        {
            char ganador = tablero.obtenerGanador();
            if (ganador == simbolo)
            {
                return new int[] {1000, 0, 0}; // La CPU gana
            } else if (ganador == simboloJugadorHumano)
            {
                return new int[] {-1000, 0, 0}; // El jugador humano gana
            } else {
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
        for (int[] movimiento : movimientosDisponibles) {
            tablero.colocarSimbolo(movimiento[0], movimiento[1], jugador);
            int[] resultado = minimax(tablero, jugador == simbolo ? simboloJugadorHumano : simbolo, alpha, beta, !maximizando);
            tablero.limpiarCasilla(movimiento[0], movimiento[1]);
            int valorMovimiento = resultado[0];
            if (maximizando) {
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

    // Enum para representar los niveles de dificultad
    public enum Dificultad
    {
        FACIL, INTERMEDIO, DIFICIL
    }
}

