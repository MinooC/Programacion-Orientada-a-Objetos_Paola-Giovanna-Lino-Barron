package edu.pao.evidencia3.ui;

/**
 * Esta clase es la encargada de los textos en español.
 */
public class Esp extends Textos
{
    @Override
    public String bienvenida() {
        return "Bienvenido a Tic Tac Toe, elija su modo de juego: ";
    }

    @Override
    public String opcion_de_juego() {
        return "1. Un jugador \n" + "2. Dos jugadores";
    }

    @Override
    public String opcion_invalida() {
        return "Opción invalida, por favor intente de nuevo.";
    }

    @Override
    public String ingreso_casilla() {
        return ", ingresa la fila y columna para tu movimiento (ejemplo: 0 1): ";
    }

    @Override
    public String casilla_ocupadada()
    {
        return "¡La casilla seleccionada ya está ocupada! Por favor, elige otra.";
    }

    @Override
    public String correcion_de_casilla()
    {
        return "¡Por favor, ingresa números enteros para las filas y columnas!";
    }

    @Override
    public String empate()
    {
        return "El juego ha terminado en empate.";
    }

    @Override
    public String felicitacion()
    {
        return "¡Felicidades! ¡Has ganado!";
    }
    @Override
    public String ganador()
    {
        return "El ganador es:";
    }
    public String tipo_juego()
    {
        return "Seleccione el tipo de juego:";
    }
    public String un_jugador()
    {
        return "Un jugador vs CPU";
    }
    public String dos_jugadores()
    {
        return "Dos jugadores";
    }
}