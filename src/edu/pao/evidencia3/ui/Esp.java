package edu.pao.evidencia3.ui;

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
        return "Opcion invalida, por favor intente de nuevo.";
    }

    @Override
    public String ingreso_casilla() {
        return ", ingresa la fila y columna para tu movimiento (ejemplo: 0 1): ";
    }
}