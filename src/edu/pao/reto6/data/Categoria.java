package edu.pao.reto6.data;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * Esta clase representa una categoría de empleado.
 */
public class Categoria
{
    private String nombreCategoria;
    private String claveCategoria;
    private double sueldoBase;
    private double pagoHoraExtra;
    /**
     * Constructor de la clase Categoria.
     * @param nombreCategoria Nombre de la categoría.
     * @param claveCategoria Clave de la categoría.
     * @param sueldoBase Sueldo base de la categoría.
     * @param pagoHoraExtra Pago por hora extra de la categoría.
     */
    public Categoria(String nombreCategoria, String claveCategoria, double sueldoBase, double pagoHoraExtra)
    {
        this.nombreCategoria = nombreCategoria;
        this.claveCategoria = claveCategoria;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }
    /**
     * Obtiene el nombre de la categoría.
     * @return Nombre de la categoría.
     */
    public String getNombreCategoria()
    {
        return nombreCategoria;
    }
    /**
     * Obtiene la clave de la categoría.
     * @return Clave de la categoría.
     */
    public String getClaveCategoria()
    {
        return claveCategoria;
    }
    /**
     * Obtiene el sueldo base de la categoría.
     * @return Sueldo base de la categoría.
     */
    public double getSueldoBase()
    {
        return sueldoBase;
    }
    /**
     * Obtiene el pago por hora extra de la categoría.
     * @return Pago por hora extra de la categoría.
     */
    public double getPagoHoraExtra()
    {
        return pagoHoraExtra;
    }
}