package edu.pao.reto5.reto5_1;
import edu.pao.reto5.reto5_1.data.UbicacionGeografica;
import edu.pao.reto5.reto5_1.data.AplicacionMovil;
import edu.pao.reto5.reto5_1.data.PropiedadInmobiliaria;

import java.util.List;

/**
 * Clase principal que contiene el método main para probar la búsqueda de propiedades inmobiliarias.
 */

public class MainReto5_1
{
    public static void main(String[] args)
    {
        UbicacionGeografica ubicacion = new UbicacionGeografica(19.4326, -99.1332);

        AplicacionMovil aplicacion = new AplicacionMovil();

        List<PropiedadInmobiliaria> propiedadesCercanas = aplicacion.buscarPropiedadesCercanas(ubicacion);

        if (propiedadesCercanas.isEmpty())
        {
            System.out.println("No se encontraron propiedades cercanas.");
        } else
        {
            System.out.println("Propiedades cercanas encontradas:");
            for (PropiedadInmobiliaria propiedad : propiedadesCercanas)
            {
                System.out.println("Dirección: " + propiedad.getDireccion() + ", Precio: $" + propiedad.getPrecio() + ", Tipo: " + propiedad.getTipo());
            }
        }
    }
}