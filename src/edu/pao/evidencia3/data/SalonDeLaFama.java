package edu.pao.evidencia3.data;

import java.util.ArrayList;
import java.util.Comparator;

public class SalonDeLaFama {
    private static final int MAX_JUGADORES = 5;
    private List<JugadorFama> jugadores;

    public SalonDeLaFama() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(JugadorFama jugador) {
        if (jugadores.size() < MAX_JUGADORES) {
            jugadores.add(jugador);
        } else {
            // Si ya hay 5 jugadores, se elimina el último para dar espacio al nuevo
            jugadores.remove(MAX_JUGADORES - 1);
            jugadores.add(jugador);
        }
        // Ordenar la lista por número de victorias (de mayor a menor)
        jugadores.sort(Comparator.comparingInt(JugadorFama::getVictorias).reversed());
    }

    public List<JugadorFama> getJugadores() {
        return jugadores;
    }
}
