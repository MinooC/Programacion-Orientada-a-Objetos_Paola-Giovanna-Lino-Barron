package edu.pao.evidencia3.process;


public abstract class Jugador
{
    protected String nombre;
    protected char simbolo;
    protected char simboloHumano;

    public Jugador(String nombre, char simbolo, char simboloHumano)
    {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.simboloHumano = simboloHumano;
    }

    public String getNombre()
    {
        return nombre;
    }

    public char getSimbolo()
    {
        return simbolo;
    }

    // Método abstracto para que las subclases implementen su propia lógica de juego
    public abstract void realizarMovimiento(Tablero tablero);
}