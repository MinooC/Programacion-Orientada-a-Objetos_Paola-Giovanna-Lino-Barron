package edu.pao.evidencia3.process;
import edu.pao.evidencia3.ui.Textos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa un jugador controlado por un humano en el juego de Gato en caso de haber seleccionado la opción de jugar contra otro jugador humano. Hereda de la clase abstracta Jugador e
 * implementa la lógica para el movimiento del jugador humano.
 */

public class Persona extends Jugador
{
    private Textos textos;

    public Persona(String nombre, char simbolo, char simboloPersona, String idioma)
    {
        super(nombre, simbolo, simboloPersona); // Llamada al constructor de la superclase
        this.textos = Textos.crearTextos(idioma);
    }

    /**
     * Método para que el jugador humano realice su movimiento en el tablero. Solicita la entrada de filas y columnas
     * al usuario para realizar el movimiento, verificando que la celda seleccionada sea válida y no esté ocupada.
     * @param tablero El tablero donde se realizará el movimiento.
     */
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
                    System.out.println(textos.opcion_invalida());
                    continue;
                }
                if (!tablero.colocarSimbolo(row, col, simbolo))
                {
                    System.out.println(textos.casilla_ocupada());
                    continue;
                }
                break;
            } catch (InputMismatchException e)
            {
                System.out.println(textos.correcion_de_casilla());
                scanner.nextLine(); // Limpiar el búfer de entrada
            }
        } while (true);
    }
}