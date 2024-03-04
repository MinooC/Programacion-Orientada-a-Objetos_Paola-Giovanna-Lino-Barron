package edu.pao.reto5.reto5_3.data;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de artículos del supermercado.
 */
public class ListaArticulos
{
    private List<ArticuloSuperMercado> articulos;

    public ListaArticulos()
    {
        articulos = new ArrayList<>();
    }

    /**
     * Método para agregar un artículo a la lista del supermercado.
     * @param articulo El artículo a agregar.
     */
    public void agregarArticulo(ArticuloSuperMercado articulo)
    {
        articulos.add(articulo);
    }

    /**
     * Método para calcular el total de la lista del supermercado.
     * @return El total de la lista del supermercado.
     */
    public double calcularTotalCompra()
    {
        double total = 0.0;
        for (ArticuloSuperMercado articulo : articulos)
        {
            total += articulo.calcularImporteTotal();
        }
        return total;
    }
}