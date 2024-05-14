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
    public String casilla_ocupada()
    {
        return "The selected box is already occupied! Please choose another one.";
    }

    @Override
    public String correcion_de_casilla()
    {
        return "Please enter integer numbers for the rows and columns!";
    }

    @Override
    public String empate()
    {
        return "The game has ended in a draw.";
    }

    @Override
    public String felicitacion()
    {
        return "Congratulations!";
    }

    @Override
    public String ganador_jugador1()
    {
        return "Player 1 wins";
    }

    @Override
    public String ganador_jugador2()
    {
        return "Player 2 wins";
    }

    @Override
    public String ganador() {
        return "The winner is: ";
    }

    @Override
    public String ganador_cpu()
    {
        return "CPU wins";
    }

    @Override
    public String ganador_jugadorsolo()
    {
        return "Player wins";
    }

    @Override
    public String tipo_juego()
    {
        return "Select the game type:";
    }

    @Override
    public String un_jugador()
    {
        return "One player";
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
    public String turno_jugadorsolo()
    {
        return "It's your turn";
    }

    @Override
    public String turno_cpu()
    {
        return "It's the CPU's turn";
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
    public String elegir_simbolo_jugadorsolo()
    {
        return "Player, choose your symbol from the list of available symbols: ";
    }

    @Override
    public String opcion_continuar()
    {
        return "Do you want to continue playing? (Y/N): ";
    }
    @Override
    public String sigue_intentando()
    {
        return "Better luck next time, keep trying.";
    }
    @Override
    public String jugar()
    {
        return "Play Tic Tac Toe";
    }

    @Override
    public String mostrar_salon_fama()
    {
        return "Show Hall of Fame";
    }
    @Override
    public String menu_inicio()
    {
        return "Enter the desired option: ";
    }

    @Override
    public String salir()
    {
        return "Exit the program";
    }

    @Override
    public String titulo_salon_fama()
    {
        return "Hall of Fame";
    }
    @Override
    public String victorias()
    {
        return "Victories: ";
    }



}
