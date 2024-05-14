package edu.pao.evidencia3.ui;

import edu.pao.evidencia3.process.CPU;
import edu.pao.evidencia3.process.Jugador;
import edu.pao.evidencia3.process.Persona;
import edu.pao.evidencia3.process.Tablero;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static edu.pao.evidencia3.data.SalonDeLaFama.mostrarSalonDeLaFama;

// Este es el punto de entrada del programa. Realiza las siguientes tareas principales:
//  Muestra un menú para seleccionar el idioma.
//  Crea un objeto Textos para gestionar los textos en el idioma seleccionado.
//  Imprime un mensaje de bienvenida en el idioma seleccionado.
//  Llama al método ejecutarJuego para iniciar el juego.

public class CLI
{
    public static void main(String[] args)
    {
        String idioma = showMenuIdioma();
        if (idioma == null)
        {
            System.out.println("Idioma no válido. Saliendo del programa.");
            return;
        }
        Textos textos = Textos.crearTextos(idioma);
        Tablero tablero = new Tablero(textos);
        System.out.println(textos.bienvenida());

        int opcionInicio = showMenuInicio(textos);
        switch (opcionInicio)
        {
            case 1:
                ejecutarJuego(textos, idioma);
                break;
            case 2:
                mostrarSalonDeLaFama(textos);
                break;
            case 3:
                System.out.println(textos.salir());
                return;
        }
    }
    private static int showMenuInicio(Textos textos)
    {
        Scanner scanner = new Scanner(System.in);
        int opcionInicio = -1;

        while (opcionInicio != 1 && opcionInicio != 2 && opcionInicio != 3)
        {
            System.out.println(textos.menu_inicio());
            System.out.println("1. " + textos.jugar());
            System.out.println("2. " + textos.mostrar_salon_fama());
            System.out.println("3. " + textos.salir());

            if (scanner.hasNextInt())
            {
                opcionInicio = scanner.nextInt();
                if (opcionInicio != 1 && opcionInicio != 2 && opcionInicio != 3)
                {
                    System.out.println(textos.opcion_invalida());
                }
            } else {
                System.out.println(textos.opcion_invalida());
                scanner.next(); // Descartar la entrada no válida
            }
        }

        return opcionInicio;
    }

    /**
     * Este método muestra el menú para seleccionar el idioma y devuelve el idioma seleccionado como una cadena de texto.
     */
    private static String showMenuIdioma()
    {
        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        switch (opcionIdioma)
        {
            case 1:
                return "Español";
            case 2:
                return "Ingles";
            case 3:
                return "Chino";
            default:
                System.out.println("Opción inválida");
                System.out.println("Invalid option");
                System.out.println("选项无效");
                return null;
        }
    }

    /**
     * Este método muestra un menú para seleccionar
     * el tipo de juego (un jugador o dos jugadores) y devuelve la opción seleccionada.
     */

    private static int showMenuJuego(Textos textos)
    {
        Scanner scanner = new Scanner(System.in);
        int opcionJuego = -1;

        while (opcionJuego != 1 && opcionJuego != 2)

        {
            System.out.println(textos.tipo_juego());
            System.out.println("1. " + textos.dos_jugadores());
            System.out.println("2. " + textos.un_jugador()  );

            if (scanner.hasNextInt())
            {
                opcionJuego = scanner.nextInt();
                if (opcionJuego != 1 && opcionJuego != 2)
                {
                    System.out.println(textos.opcion_invalida());
                }
            } else {
                System.out.println(textos.opcion_invalida());
                scanner.next(); // Descartar la entrada no válida
            }
        }

        return opcionJuego;
    }

    /**
     * Este método muestra un menú para seleccionar la dificultad del CPU y devuelve la dificultad seleccionada.
     */

    private static CPU.Dificultad mostrarMenuDificultadCPU(Scanner scanner, Textos textos)
    {
        System.out.println(textos.menu_dificultad());
        System.out.println("1. " + textos.facil());
        System.out.println("2. " + textos.dificil());
        System.out.println("3. " + textos.intermedia());
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

    /**
     * Este método maneja la lógica principal del juego.
     * Dependiendo de la opción de juego seleccionada, llama a los métodos correspondientes para jugar contra otro jugador o contra la CPU.
     */

    private static void ejecutarJuego(Textos textos, String idioma)
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            int opcionJuego = showMenuJuego(textos);

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
        } while (continuarJuego(idioma, scanner, textos));
    }

    /**
     * Este método maneja el juego cuando hay dos jugadores humanos.
     * Controla la secuencia de turnos y determina el ganador.
     */

    private static void ejecutarJuegoContraPersona(Scanner scanner, Textos textos)
    {
        Tablero tablero = new Tablero();
        char simboloJugador1, simboloJugador2;

        do {
            System.out.println(textos.elegir_simbolo_jugador1());
            simboloJugador1 = scanner.next().charAt(0);
            System.out.println(textos.elegir_simbolo_jugador2());
            simboloJugador2 = scanner.next().charAt(0);
            scanner.nextLine();
        } while (simboloJugador1 == simboloJugador2);

        String idioma = showMenuIdioma();
        Jugador jugador1 = new Persona("Jugador 1", simboloJugador1, simboloJugador2, idioma);
        Jugador jugador2 = new Persona("Jugador 2", simboloJugador2, simboloJugador1, idioma);

        tablero.mostrarTablero();

        while (!tablero.tableroLleno() && !tablero.hayGanador())
        {
            realizarMovimientoJugador(jugador1, tablero, scanner, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador_jugador1());
                System.out.println(textos.felicitacion());
                return;
            }
            realizarMovimientoJugador(jugador2, tablero, scanner, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador_jugador2());
                System.out.println(textos.felicitacion());
                return;
            }
        }

        if (tablero.tableroLleno() && !tablero.hayGanador())
        {
            System.out.println(textos.empate());
        }
    }

    /**
     * Este método maneja el juego cuando un jugador humano juega contra la CPU.
     * Controla la secuencia de turnos y determina el ganador.
     */
    private static void ejecutarJuegoContraCPU(Scanner scanner, Textos textos, CPU.Dificultad dificultad)
    {
        Tablero tablero = new Tablero();
        char simboloJugador;
        List<Character> simbolosPosibles = Arrays.asList('X', 'O', '@', '?', '*', '$', '#', 'A', 'G', 'H');

        do
        {
            System.out.println(textos.elegir_simbolo_jugadorsolo());
            simboloJugador = scanner.next().charAt(0);
            scanner.nextLine();
        } while (!simbolosPosibles.contains(simboloJugador));


        String idioma = showMenuIdioma(); // Obtener el idioma seleccionado por el usuario

        Jugador jugador = new Persona("Jugador", simboloJugador, ' ', idioma);
        Jugador cpu = new CPU("CPU", ' ', simboloJugador, dificultad);


        tablero.mostrarTablero();

        while (!tablero.tableroLleno() && !tablero.hayGanador())
        {
            realizarMovimientoJugador(jugador, tablero, scanner, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador_jugadorsolo());
                System.out.println(textos.felicitacion());
                return;
            }

            if (tablero.tableroLleno())
            {
                break;
            }

            realizarMovimientoCPU(cpu, tablero, textos);
            if (tablero.hayGanador())
            {
                System.out.println(textos.ganador_cpu());
                System.out.println(textos.sigue_intentando());
                return;
            }
        }

        if (tablero.tableroLleno() && !tablero.hayGanador())
        {
            System.out.println(textos.empate());
        }
    }

    /**
     * Maneja el movimiento de la CPU.
     */

    private static void realizarMovimientoCPU(Jugador cpu, Tablero tablero, Textos textos)
    {
        System.out.println(textos.turno_cpu());
        cpu.realizarMovimiento(tablero);
        tablero.mostrarTablero();
    }

    /**
     * Maneja el movimiento del jugador humano.
     */
    private static void realizarMovimientoJugador(Jugador jugador, Tablero tablero, Scanner scanner, Textos textos)
    {
        System.out.println(textos.turno_jugadorsolo());
        jugador.realizarMovimiento(tablero);
        tablero.mostrarTablero();
    }

    /**
     * Pregunta al usuario si quiere continuar jugando.
     */

    private static boolean continuarJuego(String idioma, Scanner scanner, Textos textos)
    {
        System.out.println(textos.opcion_continuar());
        String continuar = scanner.nextLine();

        if (idioma.equalsIgnoreCase("Ingles") || idioma.equalsIgnoreCase("Chino"))
        {
            return continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Y");
        } else
        {
            return continuar.equalsIgnoreCase("S");
        }
    }
}