package edu.pao.evidencia3.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Representa el salón de la fama del juego, que mantiene un registro de los mejores jugadores
 * basado en el número de victorias.
 */
class JugadorFama
{
    private String nombre;
    private int victorias;

    public JugadorFama(String nombre, int victorias)
    {
        this.nombre = nombre;
        this.victorias = victorias;
    }

    /**
     * Método para obtener el nombre del jugador
     */

    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método para obtener el número de victorias del jugador
     *
     */
    public int getVictorias()
    {
        return victorias;
    }
}
public class SalonDeLaFama
{
    private static final int MAX_JUGADORES = 5;
    private List<JugadorFama> jugadores;

    public SalonDeLaFama()
    {
        this.jugadores = new ArrayList<>();
    }

    /**
     * Agrega un jugador al salón de la fama. Si ya hay 5 jugadores, se elimina el último
     * para dar espacio al nuevo. La lista de jugadores se ordena por número de victorias, de mayor a menor.
     *
     * @param jugador El jugador a agregar al salón de la fama.
     */

    public void agregarJugador(JugadorFama jugador)
    {
        if (jugadores.size() < MAX_JUGADORES)
        {
            jugadores.add(jugador);
        } else {
            // Si ya hay 5 jugadores, se elimina el último para dar espacio al nuevo
            jugadores.remove(MAX_JUGADORES - 1);
            jugadores.add(jugador);
        }
        // Ordenar la lista por número de victorias (de mayor a menor)vo
        jugadores.sort(Comparator.comparingInt(JugadorFama::getVictorias).reversed());
    }

    /**
     * Obtiene la lista de jugadores en el salón de la fama.
     *
     * @return La lista de jugadores en el salón de la fama.
     */
    public List<JugadorFama> getJugadores()
    {
        return jugadores;
    }
}