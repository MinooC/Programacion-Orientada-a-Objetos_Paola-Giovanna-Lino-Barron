package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;
/**
 * Hereda de la clase Articulos y es la encargada de los procesos
 * relacionados con los videojuegos.
 */

public class Videojuego extends Articulos
{
    public Videojuego(String nombre, String tipo, String genero, boolean estreno, int diasConsumidos)
    {
        super(nombre, tipo, genero, estreno, diasConsumidos);
    }

    /**
     * Calcula el costo final del videojuego.
     */
    public double calcularCosto()
    {
            return Costos.COSTO_BASE + Costos.COSTO_ADICIONAL_VIDEOJUEGOS * diasConsumidos;
    }
}