package edu.pao.reto4.process;

import edu.pao.reto4.data.Boleto;

import java.util.ArrayList;

import static edu.pao.reto4.ui.CLI.calcularImporte;

public class VentaDeBoletos
{
    private ArrayList<Boleto> ventas;

    public VentaDeBoletos() {
        this.ventas = new ArrayList<>();
    }

    public void realizarVenta(String comprador, int cantidadBoletos, String[] pasajeros)
    {
        Boleto venta = new Boleto(comprador, cantidadBoletos, pasajeros);
        ventas.add(venta);
    }
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
            System.out.println("Importe total de la venta: " + importeTotal);
        }
    }
}