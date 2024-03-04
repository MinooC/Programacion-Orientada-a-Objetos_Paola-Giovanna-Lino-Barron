package edu.pao.reto5.reto5_5.data;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un carrito de compras.
 */
public class CarritoCompras
{
    private List<ArticuloCarrito> articulos;

    public CarritoCompras()
    {
        this.articulos = new ArrayList<>();
    }
    /**
     * Método para agregar un artículo al carrito.
     * @param articulo El artículo a agregar.
     */
    public void agregarArticulo(ArticuloCarrito articulo)
    {
        articulos.add(articulo);
    }
    /**
     * Método que calcula el total de la compra en el carrito.
     * @return El total de la compra.
     */
    public double calcularTotalCompra()
    {
        double total = 0;
        for (ArticuloCarrito articulo : articulos) {
            total += articulo.calcularImporteNeto();
        }
        return total;
    }
}