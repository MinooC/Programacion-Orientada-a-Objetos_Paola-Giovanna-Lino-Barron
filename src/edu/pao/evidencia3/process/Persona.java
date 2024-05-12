package edu.pao.evidencia3.process;
import edu.pao.evidencia3.ui.Textos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa un jugador controlado por un humano en el juego de Gato. Hereda de la clase abstracta Jugador e
 * implementa la lógica para el movimiento del jugador humano.
 */


public class Persona extends Jugador
{
    public Persona(String nombre, char simbolo, char simboloPersona)
    {
        super(nombre, simbolo, simboloPersona); // Llamada al constructor de la superclase
    }
    /**
     * Método para que el jugador humano realice su movimiento en el tablero. Solicita la entrada de filas y columnas
     * al usuario para realizar el movimiento, verificando que la celda seleccionada sea válida y no esté ocupada.
     *
     * @param tablero El tablero donde se realizará el movimiento.
    */
    edu.pao.evidencia3.ui.Textos textos = Textos.crearTextos(String)
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