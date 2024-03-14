package edu.pao.reto6.process;

import edu.pao.reto6.data.Empleados;
import edu.pao.reto6.data.Empleados;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se encarga de calcular la nómina de los empleados y generar el reporte correspondiente.
 */
public class CalculadoraNomina
{
    List<Empleados> listaEmpleados = new ArrayList<>();
    double totalNomina = 0;
    double totalSueldoBase = 0;
    double totalHorasExtra = 0;
    int totalEmpleadosHorasExtra = 0;
    int totalEmpleadosSueldoBase = 0;
    int totalHorasLaboradas = 0;
    /**
     * Agrega un empleado a la lista de empleados.
     * @param empleado Objeto Empleado a agregar.
     */
    public void agregarEmpleado(Empleados empleado)
    {
        listaEmpleados.add(empleado);
    }
    /**
     * Calcula la nómina total de la empresa.
     */
    public void calcularNomina()
    {
        for (Empleados empleado : listaEmpleados)
        {
            int horasLaboradasEmpleado = empleado.getHorasTrabajadas() + empleado.getHorasExtra();
            totalHorasLaboradas += horasLaboradasEmpleado;

            double sueldoBase = empleado.getHorasTrabajadas() * empleado.getCategoria().getSueldoBase();
            totalSueldoBase += sueldoBase;

            double pagoHorasExtra = empleado.getHorasExtra() * empleado.getCategoria().getPagoHoraExtra();
            totalHorasExtra += pagoHorasExtra;

            totalNomina += sueldoBase + pagoHorasExtra;

            if (empleado.getHorasExtra() > 0)
            {
                totalEmpleadosHorasExtra++;
            } else {
                totalEmpleadosSueldoBase++;
            }
        }
    }
    /**
     * Genera y muestra el reporte de la nómina.
     */
    public void generarReporte()
    {
        System.out.println("Total de la nómina de la empresa: $" + totalNomina);
        System.out.println("Total a pagar por sueldo normal: $" + totalSueldoBase);
        System.out.println("Total a pagar por horas extra: $" + totalHorasExtra);
        System.out.println("Total de horas laboradas: " + totalHorasLaboradas);
        System.out.println("Total de empleados con horas extras: " + totalEmpleadosHorasExtra);
        System.out.println("Total de empleados sin horas extras: " + totalEmpleadosSueldoBase);

        System.out.println("Detalles de los empleados");
        for (Empleados empleado : listaEmpleados)
        {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Categoría: " + empleado.getCategoria().getNombreCategoria());
            System.out.println("--------------------------------------------");
        }
    }
}