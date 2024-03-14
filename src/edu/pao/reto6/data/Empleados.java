package edu.pao.reto6.data;

public class Empleados
{
    /**
     * Esta clase representa a un empleado.
     */
    private String nombre;
    private int horasTrabajadas;
    private int horasExtra;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param horasTrabajadas Horas trabajadas por el empleado.
     * @param horasExtra Horas extra trabajadas por el empleado.
     * @param telefono Número de teléfono del empleado.
     * @param fechaNacimiento Fecha de nacimiento del empleado.
     * @param categoria Categoría del empleado.
     */

    public Empleados (String nombre, int horasTrabajadas, int horasExtra, String telefono, String fechaNacimiento, Categoria categoria)
    {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }

    public int getHorasExtra()
    {
        return horasExtra;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public Categoria getCategoria()
    {
        return categoria;
    }
}