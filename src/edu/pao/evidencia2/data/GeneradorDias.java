package edu.pao.evidencia2.data;
import java.util.Random;

public class GeneradorDias
{
    public static void generarDias ()
    {
        Random rand = new Random();
        int diasConsumidos = rand.nextInt(31);
    }
}