package edu.pao.evidencia3.ui;

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
}