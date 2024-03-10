package edu.pao.reto5.reto5_3.data;

/**
 * Clase que representa un artículo en la lista del supermercado.
 */
public class ArticuloSuperMercado
{
    private String nombre;
    private double precio;
    private int cantidad;
    public ArticuloSuperMercado(String nombre, double precio, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularImporteTotal()
    {
        return precio * cantidad;
    }

}