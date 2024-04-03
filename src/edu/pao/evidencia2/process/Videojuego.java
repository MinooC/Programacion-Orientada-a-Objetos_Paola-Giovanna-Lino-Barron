package edu.pao.evidencia2.process;

import edu.pao.evidencia2.data.Costos;

public class Videojuego extends Articulos
{
    public Videojuego(String nombre, String tipo, String genero, boolean estreno)
    {
        super(nombre, tipo, genero, estreno);
    }
    @Override
    public double calcularCosto()
    {
        double costo = Costos.COSTO_BASE;
        costo += Costos.COSTO_ADICIONAL_VIDEOJUEGOS;

        return costo;
    }
}
