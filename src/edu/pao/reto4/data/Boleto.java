package edu.pao.reto4.data;

public class Boleto
{
    private String comprador;
    private int cantidadBoletos;
    private String[] pasajeros;

    public Boleto (String comprador, int cantidadBoletos, String[] pasajeros)
    {
        this.comprador = comprador;
        this.cantidadBoletos = cantidadBoletos;
        this.pasajeros = pasajeros;
    }
    public String getComprador()
    {
        return comprador;
    }
    public int getCantidadBoletos()
    {
        return cantidadBoletos;
    }
    public String[] getPasajeros()
    {
        return pasajeros;
    }
}