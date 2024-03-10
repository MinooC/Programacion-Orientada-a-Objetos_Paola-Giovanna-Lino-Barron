package edu.pao.reto5.reto5_2.data;

/**
 * Clase que representa un cliente del banco.
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String telefonoCasa;
    private String telefonoTrabajo;
    public Cliente(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }
}