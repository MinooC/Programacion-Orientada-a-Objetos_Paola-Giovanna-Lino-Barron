package edu.pao.reto5.reto5_1.data;

/**
 * Clase que representa una propiedad inmobiliaria.
 */

public class PropiedadInmobiliaria
{
    private String direccion;
    private double precio;
    private String tipo;

    public PropiedadInmobiliaria (String direccion, double precio, String tipo)
    {
        this.direccion = direccion;
        this.precio = precio;
        this.tipo = tipo;
    }
    public String getDireccion()
    {
        return direccion;
    }

    public double getPrecio()
    {
        return precio;
    }

    public String getTipo()
    {
        return tipo;
    }

    public String detallesPropiedad()
    {
        return "Dirección: " + direccion + ", Precio: $" + precio + ", Tipo: " + tipo;
    }
}