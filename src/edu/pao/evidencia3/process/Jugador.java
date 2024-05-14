package edu.pao.evidencia3.process;

/**
 * Representa un jugador en el juego del Gato.
 * Esta clase es abstracta y proporciona métodos para acceder al nombre y símbolo del jugador, así como un método abstracto
 * para que las subclases implementen su propia lógica de movimiento en el tablero.
 */
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
    /**
     * Obtiene el nombre del jugador.
     * @return El nombre del jugador.
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Obtiene el símbolo del jugador en el juego.
     *
     * @return El símbolo del jugador.
     */
    public char getSimbolo()
    {
        return simbolo;
    }

    /**
     * Obtiene el símbolo del jugador Persona.
     *
     * @return El símbolo del jugador Persona.
     */
    public char getSimboloPersona()
    {
        return simboloPersona;
    }


    /**
     * Método abstracto para que las subclases implementen su propia lógica de movimiento en el tablero.
     *
     * @param tablero El tablero en el que se realizará el movimiento.
     */
    public abstract void realizarMovimiento(Tablero tablero);
}