package edu.pao.evidencia1.process;
/**
 * La clase Medicamentos representa un medicamento en el catálogo de una empresa farmacéutica.
 * Contiene información sobre el nombre químico, nombre genérico, nombre registrado, precio al público,
 * precio de venta y forma farmacéutica del medicamento.
 **/
public class Medicamentos
{
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String formaFarmaceutica;

    public String getNombreGenerico()
    {
        return this.nombreGenerico;
    }
    public String getNombreRegistrado()
    {

        return this.nombreRegistrado;
    }
    public double getPrecioVenta()
    {

        return this.precioVenta;
    }
    public double getPrecioPublico()
    {
        return this.precioPublico;
    }
    /**
     * Constructor de la clase Medicamentos.
     * @param nombreQuimico El nombre químico del medicamento.
     * @param nombreGenerico El nombre genérico del medicamento.
     * @param nombreRegistrado El nombre registrado del medicamento.
     * @param precioPublico El precio al público del medicamento.
     * @param precioVenta El precio de venta del medicamento.
     * @param formaFarmaceutica La forma farmacéutica del medicamento.
     **/
    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, double precioVenta, String formaFarmaceutica)
    {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
    }
/**
 * Aquí se calcula el precio de venta del medicamento basado en el precio al público y la forma farmacéutica.
 **/
    public static double calcularPrecioVenta (double precioPublico, String formaFarmaceutica)
    {
        double porcentajeAdicional;

        switch (formaFarmaceutica.toUpperCase())
        {
            case "SÓLIDA":
                porcentajeAdicional = 0.09;
                break;
            case "SEMISÓLIDA":
                porcentajeAdicional = 0.12;
                break;
            case "LÍQUIDA":
                porcentajeAdicional = 0.13;
                break;
            default:
                porcentajeAdicional = 0;
                System.out.println("No se agregó ningún porcentaje adicional para su precio al público.");
                break;
        }
        return precioPublico * (1 + porcentajeAdicional);
    }
}