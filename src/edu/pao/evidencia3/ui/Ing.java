package edu.pao.evidencia3.ui;

/**
 * Esta clase es la encargada de los textos en inglés.
 */
public class Ing extends Textos
{
    @Override
    public String bienvenida()
    {
        return "Welcome to Tic Tac Toe, choose your game mode: ";
    }

    @Override
    public String opcion_de_juego()
    {
        return "1. One player \n" + "2. Two players";
    }

    @Override
    public String opcion_invalida()
    {
        return "Invalid option, please try again.";
    }

    @Override
    public String ingreso_casilla()
    {
        return ", enter the row and column for your move (example: 0 1)";
    }
    @Override
    public String casilla_ocupadada()
    {
        return "The selected box is already occupied! Please choose another one.";
    }

    @Override
    public String correcion_de_casilla()
    {
        return "Please enter interger numbers for the rows and columns!";
    }

    @Override
    public String empate()
    {
        return "The game has ended in a draw.";
    }

    @Override
    public String felicitacion()
    {
        return "Congratulations! You've won!";
    }

    @Override
    public String ganador()
    {
        return "The winner is: ";
    }
    @Override
    public String tipo_juego()
    {
        return "Select the game type:";
    }
    @Override
    public String un_jugador()
    {
        return "One player vs CPU";
    }

    @Override
    public String dos_jugadores()
    {
        return "Two players";
    }

    @Override
    public String menu_dificultad()
    {
        return "Choose the CPU difficulty";
    }

    @Override
    public String facil()
    {
        return "Easy";
    }


    @Override
    public String intermedia()
    {
        return "Intermediate";
    }

    @Override
    public String dificil()
    {
        return "Hard";
    }

    @Override
    public String turno_jugador()
    {
        return "It's your turn";
    }

    @Override
    public String elegir_simbolo_jugador1()
    {
        return "Player 1, choose your symbol from the list of available symbols: ";
    }

    @Override
    public String elegir_simbolo_jugador2()
    {
        return "Player 2, choose your symbol from the list of available symbols: ";
    }
    @Override
    public String opcion_continuar()
    {
        return "Do you want to continue playing? (Y/N): ";
    }


}