package edu.pao.evidencia2.process;

public abstract class Articulos
{

    public String nombre;
    public String tipo;
    public String genero;
    public boolean estreno;

    public Articulos(String nombre, String tipo, String genero, boolean estreno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.estreno = estreno;
    }
    public abstract double calcularCosto();
}
