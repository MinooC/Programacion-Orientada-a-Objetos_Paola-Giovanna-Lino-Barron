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
public class CLI
{
    public static void main(String[] args)
    {
        showMenu();
    }

    public static void showMenu()
    {
        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        String idioma = null;
        switch (opcionIdioma)
        {
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

        while (true)
        {
            int opcionJuego = solicitarTipoJuego(scanner, textos);

            switch (opcionJuego)
            {
                case 1:
                    ejecutarJuegoContraPersona(scanner, textos);
                    break;
                case 2:
                    CPU.Dificultad dificultad = mostrarMenuDificultadCPU(scanner, textos);
                    if (dificultad != null)
                    {
                        ejecutarJuegoContraCPU(scanner, textos, dificultad);
                    }
                    break;
                default:
                    System.out.println(textos.opcion_invalida());
                    break;
            }
            String continuar = scanner.nextLine();

            // Si el idioma es inglés o chino, acepta "Y" como "Yes"
            if (idioma.equalsIgnoreCase("Ingles") || idioma.equalsIgnoreCase("Chino")) {
                if (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("Y")) {
                    System.out.println("Respuesta inválida. Por favor, ingrese 'S' o 'Y' para continuar.");
                    continuar = scanner.nextLine();
                }
            } else {
                // Para otros idiomas, solo acepta "S"
                if (!continuar.equalsIgnoreCase("S"))
                {
                    System.out.println("Respuesta inválida. Por favor, ingrese 'S' para continuar.");
                    continuar = scanner.nextLine();
                }
            }

            if (!continuar.equalsIgnoreCase("S"))
            {
                break; // Salir del bucle si la respuesta no es "S" o "Y" (dependiendo del idioma)
            }

        }
    }

    private static int solicitarTipoJuego(Scanner scanner, Textos textos)
    {
        System.out.println(textos.tipo_juego());
        System.out.println("1. " + textos.un_jugador());
        System.out.println("2. " + textos.dos_jugadores());
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    private static CPU.Dificultad mostrarMenuDificultadCPU(Scanner scanner, Textos textos) {
        System.out.println(textos.menu_dificultad());
        System.out.println("1. " + textos.facil());
        System.out.println("2. " + textos.intermedia());
        System.out.println("3. " + textos.dificil());
        int dificultad = scanner.nextInt();
        scanner.nextLine();

        switch (dificultad)
        {
            case 1:
                return CPU.Dificultad.FACIL;
            case 2:
                return CPU.Dificultad.INTERMEDIO;
            case 3:
                return CPU.Dificultad.DIFICIL;
            default:
                System.out.println(textos.opcion_invalida());
                return null;
        }
    }

    private static void ejecutarJuegoContraPersona(Scanner scanner, Textos textos)
    {
        Tablero tablero = new Tablero();
        char simboloJugador1, simboloJugador2;

        do
        {
            System.out.println(textos.elegir_simbolo_jugador1());
            simboloJugador1 = scanner.next().charAt(0);
            System.out.println(textos.elegir_simbolo_jugador2());
            simboloJugador2 = scanner.next().charAt(0);
            scanner.nextLine();
        } while (simboloJugador1 == simboloJugador2);

        Jugador jugador1 = new Persona("Jugador 1", simboloJugador1, simboloJugador2);
        Jugador jugador2 = new Persona("Jugador 2", simboloJugador2, simboloJugador1);

        tablero.mostrarTablero();

        while (!tablero.tableroLleno() && !tablero.hayGanador())
        {
            realizarMovimientoJugador(jugador1, tablero, scanner, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador(jugador1.getNombre()));
                return;
            }
            realizarMovimientoJugador(jugador2, tablero, scanner, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador(jugador2.getNombre()));
                return;
            }
        }

        if (tablero.tableroLleno() && !tablero.hayGanador())
        {
            System.out.println(textos.empate());
        }
    }

    private static void realizarMovimientoJugador(Jugador jugador, Tablero tablero, Scanner scanner, Textos textos) {
        System.out.println(textos.turno_jugador(jugador.getNombre()));
        jugador.realizarMovimiento(tablero);
        tablero.mostrarTablero();
    }

    private static void ejecutarJuegoContraCPU(Scanner scanner, Textos textos, CPU.Dificultad dificultad) {
        // Implementación pendiente para el juego contra la CPU
    }
}

