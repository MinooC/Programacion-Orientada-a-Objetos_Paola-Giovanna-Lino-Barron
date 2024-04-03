package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;

public class Pelicula extends Articulos
{
    public Pelicula(String nombre, String tipo, String genero, boolean estreno)
    {
        super(nombre, tipo, genero, estreno);
    }
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
