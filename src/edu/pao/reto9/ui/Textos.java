package edu.pao.reto9.ui;

/**
 * La clase Textos es una clase abstracta que proporciona textos para la interfaz de usuario.
 * Define métodos abstractos para obtener diferentes textos, como bienvenida, menú, mensajes de error, etc.
 */

public abstract class Textos
{
    public abstract String bienvenida();
    public abstract String opcion_invalida();
    public abstract String menu();
    public abstract String error_lectura ();
    public abstract String palabra ();
    public abstract String repeticiones ();
    public abstract String palabras_repetidas ();

    /**
     * Se muestra al usuario el menu de idiomas disponibles.
     **/
    public static void escogerIdioma ()
    {
        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");
    }

    public static Textos crearTextos(String idioma)
    {

        switch (idioma)
        {
            case "Español":
                return new Esp();
            case "English":
                return new Eng();
            default:
                throw new IllegalArgumentException("Idioma no válido");
        }
    }
}
