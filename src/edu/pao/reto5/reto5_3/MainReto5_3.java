package edu.pao.reto5.reto5_3;

import edu.pao.reto5.reto5_3.data.ArticuloSuperMercado;
import edu.pao.reto5.reto5_3.data.ListaArticulos;

/**
 * Clase principal que contiene el método main para probar la lista del supermercado.
 */
public class MainReto5_3
{
    public static void main(String[] args) {
        /**
         * Se crean los artículos.
         **/
        ArticuloSuperMercado articulo1 = new ArticuloSuperMercado("Leche", 2.5, 2);
        ArticuloSuperMercado articulo2 = new ArticuloSuperMercado("Pan", 1.0, 3);
        ArticuloSuperMercado articulo3 = new ArticuloSuperMercado("Huevos", 3.0, 1);

        /**
         * Se crea una lista de artículos.
         **/
        ListaArticulos listaArticulos = new ListaArticulos();

        /**
         * Se agregan los artículos a la lista.
         **/
        listaArticulos.agregarArticulo(articulo1);
        listaArticulos.agregarArticulo(articulo2);
        listaArticulos.agregarArticulo(articulo3);

        /**
         * Se calcula el total de la compra.
         **/
        double totalCompra = listaArticulos.calcularTotalCompra();
        System.out.println("Total de la compra: $" + totalCompra);
    }
}