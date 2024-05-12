package edu.pao.evidencia3.process;
import edu.pao.evidencia3.ui.Textos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona extends Jugador
{
   private char simboloPersona;
    public Persona(String nombre, char simboloJugador, char simboloPersona)
    {
        super(nombre, simboloJugador);
        this.simboloPersona = simboloPersona;
    }
    edu.pao.evidencia3.ui.Textos textos = Textos

    @Override
    public void realizarMovimiento(Tablero tablero)
    {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            try {
                System.out.print(nombre + textos.ingreso_casilla());
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (!tablero.esMovimientoValido(row, col))
                {
                    //AUN ME FALTA CAMBIAR ESTO
                    System.out.println(textos.opcion_invalida());
                    continue;
                }
                if (!tablero.colocarSimbolo(row, col, simbolo))
                {
                    //AUN ME FALTA CAMBIAR ESTO
                    System.out.println("¡La casilla seleccionada ya está ocupada! Por favor, elige otra.");
                    continue;
                }
                break;
            } catch (InputMismatchException e)
            {
                //AUN ME FALTA CAMBIAR ESTO
                System.out.println("¡Por favor, ingresa números enteros para las filas y columnas!");
                scanner.nextLine(); // Limpiar el búfer de entrada
            }
        } while (true);
    }

}