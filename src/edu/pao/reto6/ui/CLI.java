package edu.pao.reto6.ui;

import edu.pao.reto6.data.Categoria;
import edu.pao.reto6.data.Empleados;
import edu.pao.reto6.process.CalculadoraNomina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Esta clase proporciona una interfaz de línea de comandos para interactuar con el programa de nómina.
 */

public class CLI
{
    /**
     * Muestra el menú de opciones para ingresar los datos de los empleados y generar la nómina.
     */
    public static void showMenu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados a registrar");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        List<Empleados> listaEmpleados = new ArrayList<>();

        for (int i = 0; i < cantidadEmpleados; i++)
        {
            System.out.println("Ingrese los datos del empleado #" + (i + 1));

            System.out.println("Nombre del empleado:");
            String nombre = scanner.nextLine();

            System.out.println("Horas trabajadas:");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Horas extra trabajadas:");
            int horasExtra = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Número de teléfono:");
            String telefono = scanner.nextLine();

            System.out.println("Fecha de nacimiento del empleado:");
            String fechaNacimiento = scanner.nextLine();

            System.out.println("Elija la categoría asignada:");
            System.out.println("1. Empleado ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            int categoriaSeleccionada = scanner.nextInt();
            scanner.nextLine();

            Categoria categoria;
            switch (categoriaSeleccionada)
            {
                case 1:
                    categoria = new Categoria("Empleado de ventas", "EV", 100.0, 50.0);
                    break;
                case 2:
                    categoria = new Categoria("Administrador", "ADM", 180.0, 100.0);
                    break;
                case 3:
                    categoria = new Categoria("Gerente", "GER", 250.0, 150.0);
                    break;
                default:
                    System.out.println("Opción inválida. Se asignará categoría por defecto.");
                    categoria = new Categoria("Empleado ventas", "EV", 100.0, 50.0);
            }

            Empleados empleado = new Empleados(nombre, horasTrabajadas, horasExtra, telefono, fechaNacimiento, categoria);
            listaEmpleados.add(empleado);
        }

        CalculadoraNomina calculadoraNomina = new CalculadoraNomina();
        for (Empleados empleado : listaEmpleados)
        {
            calculadoraNomina.agregarEmpleado(empleado);
        }

        calculadoraNomina.calcularNomina();
        calculadoraNomina.generarReporte();

        scanner.close();
    }
}
