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
    @Override
    public String tipo_juego()
    {
        return "Seleccione el tipo de juego:";
    }
    @Override
    public String un_jugador()
    {
        return "Un jugador vs CPU";
    }
    @Override
    public String dos_jugadores()
    {
        return "Dos jugadores";
    }
    @Override
    public String menu_dificultad()
    {
        return "Escoja la dificultad del CPU";
    }
    @Override
    public String facil()
    {
        return "Fácil";
    }
    @Override
    public String intermedia()
    {
        return "Intermedio";
    }
    public String dificil()
    {
        return "Difícil";
    }
    @Override
    public String turno_jugador()
    {
        return "Es su turno";
    }
    @Override
    public String elegir_simbolo_jugador1()
    {
        return "Jugador 1, escoja su símbolo de la lista de símbolos disponibles: ";
    }
    @Override
    public String elegir_simbolo_jugador2()
    {
        return "Jugador 2, escoja su símbolo de la lista de símbolos disponibles: ";
    }
    @Override
    public String opcion_continuar()
    {
        return "¿Desea continuar jugando? (S/N): ";
    }

}
