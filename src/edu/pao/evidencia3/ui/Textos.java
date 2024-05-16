package edu.pao.evidencia3.ui;
/**
 * Esta clase es la encargada de definir los idiomas y
 * heredar las variables a los mismos.
 */

public abstract class Textos
{
    public abstract String bienvenida();
    public abstract String opcion_invalida();
    public abstract String ingreso_casilla();
    public abstract String casilla_ocupada();
    public abstract String correcion_de_casilla();
    public abstract String empate();
    public abstract String felicitacion();
    public abstract String ganador();
    public abstract String ganador_jugador1();
    public abstract String ganador_jugador2();
    public abstract String ganador_jugadorsolo();
    public abstract String ganador_cpu();
    public abstract String tipo_juego();
    public abstract String un_jugador();
    public abstract String dos_jugadores();
    public abstract String menu_dificultad();
    public abstract String facil();
    public abstract String intermedia();
    public abstract String dificil();
    public abstract String turno_jugadorsolo();
    public abstract String turno_cpu();
    public abstract String elegir_simbolo_jugador1();
    public abstract String elegir_simbolo_jugador2();
    public abstract String elegir_simbolo_jugadorsolo();
    public abstract String opcion_continuar();
    public abstract String sigue_intentando();
    public abstract String mostrar_salon_fama();
    public abstract String menu_inicio();
    public abstract String jugar();
    public abstract String salir();
    public abstract String titulo_salon_fama();
    public abstract String victorias();
    public abstract String resumen_partidas();
    public abstract String partidas_jugadas();
    public abstract String partidas_ganadas();
    public abstract String partidas_empatadas();
    public abstract String partidas_perdidas();

    public static void escogerIdioma ()
    {
        /**
         * Se encarga de mostrarle al usuario el menu de
         * idiomas disponibles para el programa.
         */

        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("选择语言");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. 中国人");
    }

    public static Textos crearTextos(String idioma)
    {
        /**
         * Direcciona el idioma escogido por el usuario para
         * mostrar los textos en el idioma correspondiente.
         */

        switch (idioma)
        {
            case "Español":
                return new Esp();
            case "Ingles":
                return new Ing();
            case "Chino":
                return new Chino();
            default:
                throw new IllegalArgumentException("Idioma no válido");
        }
    }
}