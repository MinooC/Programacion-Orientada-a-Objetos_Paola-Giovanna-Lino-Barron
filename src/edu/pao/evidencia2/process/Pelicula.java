package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;

/**
 * Hereda de la clase Articulos y es la encargada de los procesos
 * relacionados con las peliculas.
 */

public class Pelicula extends Articulos
{
    public Pelicula(String nombre, String tipo, String genero, boolean estreno)
    {
        super(nombre, tipo, genero, estreno);
    }
    /**
     * Calcula el costo final de la película.
     */
    @Override
    public double calcularCosto()
    {
        double costo = Costos.COSTO_BASE;
        if (estreno)
        {
            costo += Costos.COSTO_ADICIONAL_PELICULAS_ESTRENO;
        } else {
            costo += Costos.COSTO_ADICIONAL_PELICULAS;
        }
        return costo;
    }
}
