package edu.pao.reto5.reto5_5;

import edu.pao.reto5.reto5_5.data.CarritoCompras;

/**
 * Clase principal que contiene el método main para probar el carrito de compras.
 */

public class MainReto5_5
{
    public static <ArticuloCarrito> void main(String[] args)
    {
        /**
         * Se crean artículos para el carrito.
         */
        ArticuloCarrito articulo1 = new ArticuloCarrito("Camiseta", 2, 15.0, 16);
        ArticuloCarrito articulo2 = new ArticuloCarrito("Pantalón", 1, 30.0, 16);
        ArticuloCarrito articulo3 = new ArticuloCarrito("Zapatos", 1, 50.0, 16);

        /**
         * Se crea un carrito de compras.
         */
        CarritoCompras = new CarritoCompras();

        /**
         * Se agregan artículos al carrito.
         */
        carrito.agregarArticulo(articulo1);
        carrito.agregarArticulo(articulo2);
        carrito.agregarArticulo(articulo3);

        /**
         * Calcula el total de la compra.
         */
        double totalCompra = carrito.calcularTotalCompra();
        System.out.println("Total de la compra: $" + totalCompra);
    }
}