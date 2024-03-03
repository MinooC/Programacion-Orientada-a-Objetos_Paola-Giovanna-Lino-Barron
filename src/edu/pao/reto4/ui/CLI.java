package edu.pao.reto4.ui;

import edu.pao.reto4.process.VentaDeBoletos;

import java.util.Scanner;

/**
 * Esta clase sirve para que el usuario interactue con la interfaz, ingresando los datos solicitados
 **/
public class CLI
{
    private VentaDeBoletos proceso;
    public CLI()
    {
        this.proceso = new VentaDeBoletos();
    }

    public static void main(String[] args)
    {
        CLI cli = new CLI();
        cli.launchApp();
    }
    /**
     * Muestra el menú de opciones.
     **/
    public static void showMenu()
    {
        System.out.println("Menú:");
        System.out.println("(Escriba la opción que desee operar)");
        System.out.println("A) Venta de Boleto.");
        System.out.println("B) Mostrar datos de la lista de ventas.");
        System.out.println("S) Finalizar programa");
    }
    /**
     * Método que ejecuta la lógica principal de la aplicación.
     **/
    public void launchApp()
    {
        Scanner scanner = new Scanner(System.in);
        String comprador = null;
        int cantidadBoletos = 0;
        String[] pasajeros = null;

        while (true)
        {
            showMenu();
            String opcion = scanner.nextLine();

            switch (opcion.toUpperCase())
            {
                case "A":
                    realizarVenta(scanner);
                    System.out.println("Venta realizada con éxito.");
                    break;

                case "B":
                    proceso.mostrarDatosVentas();
                    break;

                case "S":
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
    /**
     * Realiza la venta de boletos.
     * @param scanner Objeto Scanner para la entrada de datos.
     **/
    private void realizarVenta(Scanner scanner)
    {
        System.out.println("Ingrese el nombre del comprador:");
        String comprador = scanner.nextLine();

        System.out.println("Ingrese la cantidad de boletos:");
        int cantidadBoletos = Integer.parseInt(scanner.nextLine());

        String[] pasajeros = new String[cantidadBoletos - 1];
        for (int i = 0; i < cantidadBoletos - 1; i++)
        {
            System.out.println("Ingrese el nombre del pasajero " + (i + 1) + ":");
            pasajeros[i] = scanner.nextLine();
        }

        proceso.realizarVenta(comprador, cantidadBoletos, pasajeros);

        mostrarTicket(comprador, cantidadBoletos, pasajeros);
    }
    /**
     * Muestra el ticket de venta.
     * @param comprador Nombre del comprador.
     * @param cantidadBoletos Cantidad de boletos vendidos.
     * @param pasajeros Nombres de los pasajeros adicionales.
     **/
    private void mostrarTicket(String comprador, int cantidadBoletos, String[] pasajeros)
    {
        System.out.println("\nTicket de venta:");
        System.out.println("Comprador: " + comprador);
        System.out.println("Importe de venta: " + calcularImporte(cantidadBoletos));
        System.out.println("Pasajeros adicionales:");

        if (pasajeros != null)
        {
            for (String pasajero : pasajeros)
            {
                System.out.println("- " + pasajero);
            }
        }
        else
        {
            System.out.println("(No se han ingresado pasajeros adicionales)");
        }
    }
    /**
     * Calcula el importe total de la venta.
     * @param cantidadBoletos Cantidad de boletos vendidos.
     * @return Importe total de la venta.
     **/
    public static double calcularImporte(int cantidadBoletos)
    {
        return cantidadBoletos * 1250.50;
    }
}