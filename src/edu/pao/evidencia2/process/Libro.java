package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;

public class Libro extends Articulos
{

    public Libro(String nombre, String tipo, String genero, boolean estreno)
    {
        super(nombre, tipo, genero, estreno);
    }

    @Override
    public double calcularCosto()
    {
        double costo = Costos.COSTO_BASE;
        if (genero.equals("novela"))
        {
            costo += Costos.COSTO_ADICIONAL_NOVELAS;
        } else if (genero.equals("tecnologia"))
        {
            costo += Costos.COSTO_ADICIONAL_LIBROS_TECNOLOGIA;
        }
        if (estreno)
        {
            costo += Costos.COSTO_ADICIONAL_LIBROS_ESTRENO;
        }
        return costo;
    }
}

