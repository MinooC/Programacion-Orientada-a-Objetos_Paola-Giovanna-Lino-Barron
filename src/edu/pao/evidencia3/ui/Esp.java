package edu.pao.evidencia3.ui;

/**
 * Esta clase es la encargada de los textos en español.
 */
public class Esp extends Textos
{
    @Override
    public String bienvenida()
    {
        return "Bienvenido a Tic Tac Toe, elija su modo de juego: ";
    }

    @Override
    public String opcion_invalida()
    {
        return "Opción invalida, por favor intente de nuevo.";
    }

    @Override
    public String ingreso_casilla()
    {
        return ", ingresa la fila y columna para tu movimiento (ejemplo: 0 1): ";
    }

    @Override
    public String casilla_ocupada()
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
        return "¡Felicitaciones!";
    }

    @Override
    public String ganador()
    {
        return "El ganador es: ";
    }

    @Override
    public String ganador_jugador1()
    {
        return "Ganó el jugador 1";
    }

    @Override
    public String ganador_jugador2()
    {
        return "Ganó el jugador 2";
    }

    @Override
    public String ganador_jugadorsolo()
    {
        return "Ganó el jugador";
    }

    @Override
    public String ganador_cpu()
    {
        return "Ganó la CPU";
    }

    @Override
    public String tipo_juego()
    {
        return "Seleccione el tipo de juego:";
    }

    @Override
    public String un_jugador()
    {
        return "Un jugador";
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

    @Override
    public String dificil()
    {
        return "Difícil";
    }

    @Override
    public String turno_cpu()
    {
        return "Es el turno de la CPU";
    }

    @Override
    public String turno_jugadorsolo()
    {
        return "Es su turno";
    }

    @Override
    public String elegir_simbolo_jugador1()
    {
        return "Jugador 1, escoja su símbolo de la lista de símbolos disponibles: 'X', 'O', '@', '?', '*', '$', '#', 'A', 'G', 'H': ";
    }

    @Override
    public String elegir_simbolo_jugador2()
    {
        return "Jugador 2, escoja su símbolo de la lista de símbolos disponibles: 'X', 'O', '@', '?', '*', '$', '#', 'A', 'G', 'H': ";
    }

    @Override
    public String elegir_simbolo_jugadorsolo()
    {
        return "Jugador, escoja su símbolo de la lista de símbolos disponibles: 'X', 'O', '@', '?', '*', '$', '#', 'A', 'G', 'H': ";
    }

    @Override
    public String opcion_continuar()
    {
        return "¿Desea continuar jugando? (S/N): ";
    }
    @Override
    public String sigue_intentando()
    {
        return "Más suerte para la próxima, sigue intentando.";
    }
    @Override
    public String jugar()
    {
        return "Jugar Gato";
    }
    @Override
    public String mostrar_salon_fama()
    {
        return "Mostrar Salón De La Fama";
    }
    @Override
    public String menu_inicio()
    {
        return "Ingrese la opción deseada: ";
    }
    @Override
    public String salir()
    {
        return "Salir del programa";
    }
    @Override
    public String titulo_salon_fama()
    {
        return "Salón de la Fama";
    }
    @Override
    public String victorias()
    {
        return "Victorias: ";
    }
    @Override
    public String partidas_jugadas()
    {
        return "Partidas ganadas";
    }
    @Override
    public String partidas_empatadas()
    {
        return "Partidas empatadas";
    }
    @Override
    public String partidas_perdidas()
    {
        return "Partidas perdidas";
    }
    @Override
    public String resumen_partidas()
    {
        return "Resumen de partidas: ";
    }
    @Override
    public String partidas_ganadas()
    {
        return "Partidas ganadas: ";
    }
}
