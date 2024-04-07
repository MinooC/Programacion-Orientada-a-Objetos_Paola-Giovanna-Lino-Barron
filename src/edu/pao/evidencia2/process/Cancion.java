package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;
/**
 * Hereda de la clase Articulos y es la encargada de los procesos
 * relacionados con las canciones.
 */
public class Cancion extends Articulos
{
    public Cancion(String nombre, String tipo, String genero, boolean estreno, int diasConsumidos)
    {
        super(nombre, tipo, genero, estreno);
    }
    /**
     * Calcula el costo final de la cancion.
     */
    @Override
    public double calcularCosto()
    {
        double costo = Costos.COSTO_BASE;
        if (estreno)
        {
            costo += Costos.COSTO_ADICIONAL_CANCIONES_ESTRENO;
        } else
        {
            costo += Costos.COSTO_ADICIONAL_CANCIONES;
        }
        return costo;
    }
}

