package edu.pao.evidencia3.process;

import java.util.Scanner;

public class Persona extends Jugador
{
    public Persona(String nombre, char simbolo) {
        super(nombre, simbolo);
    }

    @Override
    public void realizarMovimiento(Tablero tablero)
    {
        // Lógica de movimiento para el jugador persona
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.print(nombre + textos.ingreso_casilla());
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!tablero.colocarSimbolo(row, col, simbolo));
    }
}
