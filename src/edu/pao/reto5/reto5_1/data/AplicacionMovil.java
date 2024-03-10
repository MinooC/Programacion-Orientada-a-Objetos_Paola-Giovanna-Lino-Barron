package edu.pao.reto5.reto5_1.data;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil
{
    public List<PropiedadInmobiliaria> buscarPropiedadesCercanas(UbicacionGeografica ubicacion)
    {
        List<PropiedadInmobiliaria> propiedadesCercanas = new ArrayList<>();
        propiedadesCercanas.add(new PropiedadInmobiliaria("Calle A", 200000, "Venta"));
        propiedadesCercanas.add(new PropiedadInmobiliaria("Calle B", 1500, "Renta"));
        propiedadesCercanas.add(new PropiedadInmobiliaria("Calle C", 300000, "Venta"));
        return propiedadesCercanas;
    }
}