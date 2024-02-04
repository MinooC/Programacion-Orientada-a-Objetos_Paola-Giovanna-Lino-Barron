package edu.pao.reto2.process;

import java.util.Scanner;
/**
 * Esta clase sirve para realizar los cálculos que desee operar el usuario.
 **/
public class CalculadoraPapel
{
    private int cantidadCompras;
    private int cantidadVentas;
    private double ingresosVentas;
    private double egresosCompras;
    private double montoCaja;

    public CalculadoraPapel()
    {
        this.cantidadCompras = 0;
        this.cantidadVentas = 0;
        this.ingresosVentas = 0;
        this.egresosCompras = 0;
        this.montoCaja = 0;
    }
    /**
     * Se realiza la operación de compra de cajas.
     * @param scanner Scanner utilizado para la entrada de datos.
     **/
    public void comprarCajas(Scanner scanner)
    {
        System.out.print("Ingrese el número de cajas a comprar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el costo de las cajas a comprar: ");
        double costo = scanner.nextDouble();

        double monto = cantidad * costo;
        egresosCompras += monto;
        cantidadCompras += cantidad;
        montoCaja -= monto;

        System.out.println("La compra realizada por " + cantidad + " cajas al costo " + costo + " es igual a " + monto);
    }
    /**
     * Realiza la operación de venta de cajas.
     * @param scanner Scanner utilizado para la entrada de datos.
     **/
    public void venderCajas(Scanner scanner)
    {
        System.out.print("Ingrese el número de cajas a vender: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio de las cajas a vender: ");
        double precio = scanner.nextDouble();

        double monto = cantidad * precio;
        ingresosVentas += monto;
        cantidadVentas += cantidad;
        montoCaja += monto;

        System.out.println("La venta realizada por " + cantidad + " cajas al precio de " + precio + " es igual a " + monto);
    }
    /**
     * Muestra un informe detallado de las operaciones realizadas.
     */
    public void mostrarReporte()
    {
        System.out.println("Cantidad total de ventas: " + cantidadVentas);
        System.out.println("Cantidad total de compras: " + cantidadCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }
    /**
     * Muestra un resumen de las operaciones realizadas.
     */
    public void mostrarResumen()
    {
        System.out.println("\nResumen de movimientos:");
        System.out.println("Cantidad total de operaciones realizadas: " + (cantidadVentas + cantidadCompras));
        System.out.println("Cantidad total de ventas: " + cantidadVentas);
        System.out.println("Cantidad total de compras: " + cantidadCompras);
        System.out.println("Monto en la caja: " + montoCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
    }
}