package edu.pao.evidencia3.ui;

import edu.pao.evidencia3.MainEvidencia3;
import edu.pao.evidencia3.process.CPU;
import edu.pao.evidencia3.process.Jugador;
import edu.pao.evidencia3.process.Persona;
import edu.pao.evidencia3.process.Tablero;
import java.util.Scanner;

/**
 * Muestra el menú de selección de idioma y permite al usuario elegir el idioma deseado.
 */
public class CLI {
    public static void showMenu() {
        /**
         * Se imprime en pantalla las opciones de idioma para que
         * el usuario elija la deseada.
         */

        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        String idioma = null;
        switch (opcionIdioma) {
            case 1:
                idioma = "Español";
                break;
            case 2:
                idioma = "Ingles";
                break;
            case 3:
                idioma = "Chino";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }
        Textos textos = Textos.crearTextos(idioma);
        System.out.println(textos.bienvenida());
        System.out.println(textos.opcion_de_juego());

        int opcionJuego = solicitarTipoJuego(scanner, textos);

        switch (opcionJuego) {
            case 1:
                // Lógica para un jugador
                // Crear el tablero
                Tablero tableroUnJugador = new Tablero();
                // Crear el jugador
                Jugador jugador = new Persona("Jugador", 'X', 'O');
                // Crear el CPU
                Jugador cpu = new CPU("CPU", 'O', 'X', Dificultad.INTERMEDIA);
                // Ejecutar el juego
                ejecutarJuego(tableroUnJugador, textos, jugador, cpu);
                break;
            case 2:
                // Lógica para dos jugadores
                // Crear el tablero
                Tablero tableroDosJugadores = new Tablero();
                // Crear el primer jugador
                Jugador jugador1 = new Persona("Jugador 1", 'X', 'O');
                // Crear el segundo jugador
                Jugador jugador2 = new Persona("Jugador 2", 'O', 'X');
                // Ejecutar el juego
                ejecutarJuego(tableroDosJugadores, textos, jugador1, jugador2);
                break;
            default:
                System.out.println(textos.opcion_invalida());
                break;
        }
    }
    private static int solicitarTipoJuego(Scanner scanner, Textos textos)
    {
        System.out.println(textos.tipo_juego());
        System.out.println("1. " + textos.un_jugador());
        System.out.println("2. " + textos.dos_jugadores());
        return scanner.nextInt();
    }

    private static void ejecutarJuego(Tablero tablero, Textos textos, Jugador jugador1, Jugador jugador2)
    {
        while (!tablero.tableroLleno() && !tablero.hayGanador())
            {
            // Turno del jugador 1
            jugador1.realizarMovimiento(tablero);
            tablero.mostrarTablero();
            if (tablero.hayGanador())
            {
                tablero.mostrarResultado(jugador1.getSimbolo());
                break;
            }

            // Turno del jugador 2
            jugador2.realizarMovimiento(tablero);
            tablero.mostrarTablero();
            if (tablero.hayGanador())
            {
                tablero.mostrarResultado(jugador2.getSimbolo());
                break;
            }
        }
    }
}
