package edu.pao.reto5.reto5_1.data;

/**
 * Clase que representa una ubicación geográfica.
 */

public class UbicacionGeografica
{
    private double latitud;
    private double longitud;
    public UbicacionGeografica(double latitud, double longitud)
    {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public double getLatitud()
    {
        return latitud;
    }

    public double getLongitud()
    {
        return longitud;
    }
}