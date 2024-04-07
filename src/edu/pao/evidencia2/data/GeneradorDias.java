package edu.pao.evidencia2.data;
import java.util.Random;

/**
 * Esta clase se encarga de generar dias para realizar las operaciones.
 */

public class GeneradorDias
{
    /**
     * Se genera una cantidad de dias al azar para tomar la informacion
     * de cuantos dias se uso el articulo.
     */

    public static int generarDias()
    {
        Random rand = new Random();
        int diasConsumidos = rand.nextInt(31);
        return diasConsumidos;
    }
}