package edu.pao.evidencia2.process;

/**
 * Es la encargada de heredar a los articulos establecidos
 * segun sea el caso.
 */

public abstract class Articulos
{
    public String nombre;
    public String tipo;
    public String genero;
    public boolean estreno;
    public int diasConsumidos;
    public Articulos(String nombre, String tipo, String genero, boolean estreno)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.estreno = estreno;
        this.diasConsumidos = diasConsumidos;

    }

    /**
     * Es el metodo encargado de calcular el costo total de los procesos.
     */
    public abstract double calcularCosto();
}