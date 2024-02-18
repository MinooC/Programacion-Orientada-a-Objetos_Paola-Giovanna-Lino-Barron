package edu.pao.reto4.process;

import edu.pao.reto4.data.Boleto;

import java.util.ArrayList;

import static edu.pao.reto4.ui.CLI.calcularImporte;
/**
 * La clase VentaDeBoletos maneja la venta de boletos de la empresa de autobuses turísticos.
 * Permite realizar ventas y mostrar los datos de las ventas realizadas.
 **/

public class VentaDeBoletos
{
    private ArrayList<Boleto> ventas;

    public VentaDeBoletos() {
        this.ventas = new ArrayList<>();
    }
/**
 * Realiza una venta de boletos y la agrega a la lista de ventas.
 **/
    public void realizarVenta(String comprador, int cantidadBoletos, String[] pasajeros)
    {
        Boleto venta = new Boleto(comprador, cantidadBoletos, pasajeros);
        ventas.add(venta);
    }
    /**
     * Muestra los datos de las ventas realizadas, incluyendo detalles de cada venta y el importe total.
     **/
    public void mostrarDatosVentas()
    {
        int totalPasajeros = 0;
        double importeTotalVentas = 0.0;

        for (Boleto venta : ventas)
        {
            String comprador = venta.getComprador();
            int cantidadBoletos = venta.getCantidadBoletos();
            String[] pasajeros = venta.getPasajeros();
            double importeTotal = calcularImporte(cantidadBoletos);

            System.out.println("Comprador: " + comprador);
            System.out.println("Cantidad de boletos: " + cantidadBoletos);
            System.out.println("Pasajeros adicionales:");
            for (String pasajero : pasajeros)
            {
                System.out.println("- " + pasajero);
            }
            /**
             * Se muestra en pantalla el total.
             **/
            System.out.println("Importe total de la venta: " + importeTotal);
        }
    }
}