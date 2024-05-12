package edu.pao.evidencia3.process;

public abstract class Jugador
{
    protected String nombre;
    protected char simbolo;
    protected char simboloPersona; // Nuevo campo para el símbolo del jugador Persona

    public Jugador(String nombre, char simbolo, char simboloPersona)
    {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.simboloPersona = simboloPersona; // Asignar el símbolo
    }

    public String getNombre()
    {
        return nombre;
    }

    public char getSimbolo()
    {
        return simbolo;
    }

    public char getSimboloPersona()
    {
        return simboloPersona;
    }

    // Método abstracto para que las subclases implementen su propia lógica de juego
    public abstract void realizarMovimiento(Tablero tablero);
}
