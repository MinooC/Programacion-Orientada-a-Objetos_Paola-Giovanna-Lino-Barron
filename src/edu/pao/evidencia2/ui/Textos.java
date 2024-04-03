package edu.pao.evidencia2.ui;
/**
 * Esta clase se encarga de direccionar el idioma segun
 * el usuario lo indique.
 */
public class Textos
{
    public static String USUARIO;
    public static String CONTRASENA;
    public static String MONTO_TOTAL;

    public static void escogerIdioma ()
    {
        /**
         * Se encarga de mostrar en pantalla las opciones de
         * idioma para que el usuario elija el que desee.
         */

        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");
    }
    /**
     * Configura las variables en ingles.
     */
    public static void setIng()
    {
        USUARIO = Ing.USUARIO;
        CONTRASENA = Ing.CONTRASENA;
        MONTO_TOTAL = Ing.MONTO_TOTAL;
    }
    /**
     * Configura las variables en español.
     */
    public static void setEsp()
    {
        USUARIO = Esp.USUARIO;
        CONTRASENA = Esp.CONTRASENA;
        MONTO_TOTAL = Esp.MONTO_TOTAL;
    }
}