package edu.pao.reto5.reto5_4.data;
/**
 * Clase que representa un contacto en una agenda telefónica.
 */
public class Contacto
{
    public String getNombre;
    private String nombre;
    private String direccion;
    private String telefonoCasa;
    private String telefonoTrabajo;

    public Contacto(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }

}