package edu.pao.evidencia2.ui;

public class Textos
{

    public static String USUARIO;
    public static String CONTRASENA;
    public static String MONTO_TOTAL;

    public static void escogerIdioma ()
    {
        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");
    }
    public static void setIng()
    {
        USUARIO = Ing.USUARIO;
        CONTRASENA = Ing.CONTRASENA;
        MONTO_TOTAL = Ing.MONTO_TOTAL;
    }

    public static void setEsp()
    {
        USUARIO = Esp.USUARIO;
        CONTRASENA = Esp.CONTRASENA;
        MONTO_TOTAL = Esp.MONTO_TOTAL;
    }
}
