package edu.pao.evidencia3.data;

import edu.pao.evidencia3.ui.Textos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class JugadorFama
{
    private String nombre;
    private int victorias;

    public JugadorFama(String nombre, int victorias)
    {
        this.nombre = nombre;
        this.victorias = victorias;
    }

    public String getNombre()
    {
        return nombre;
    }

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

    public void agregarJugador(JugadorFama jugador)
    {
        if (jugadores.size() < MAX_JUGADORES)
        {
            jugadores.add(jugador);
        } else {
            jugadores.remove(MAX_JUGADORES - 1);
            jugadores.add(jugador);
        }
        jugadores.sort(Comparator.comparingInt(JugadorFama::getVictorias).reversed());
    }

    public List<JugadorFama> getJugadores()
    {
        return jugadores;
    }
    public static void mostrarSalonDeLaFama(Textos textos)
    {
        SalonDeLaFama salonDeLaFama = new SalonDeLaFama();
        List<JugadorFama> jugadores = salonDeLaFama.getJugadores();

        System.out.println(textos.titulo_salon_fama());
        for (int i = 0; i < jugadores.size(); i++)
        {
            JugadorFama jugador = jugadores.get(i);
            System.out.println((i + 1) + ". " + jugador.getNombre() + " - " + jugador.getVictorias() + " " + textos.victorias());
        }
    }
}

