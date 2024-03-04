package edu.pao.reto5.reto5_5.data;

/**
 * Clase que representa un artículo en el carrito de compras.
 */
public class ArticuloCarrito
{
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double iva;

    public ArticuloCarrito(String nombre, int cantidad, double precioUnitario, double iva) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
    }
    /**
     * Método que calcula el importe neto del artículo (incluyendo el IVA).
     * @return El importe neto del artículo.
     */
    public double calcularImporteNeto()
    {
        double importeBruto = cantidad * precioUnitario;
        double importeIva = importeBruto * iva / 100;
        return importeBruto + importeIva;
    }
}