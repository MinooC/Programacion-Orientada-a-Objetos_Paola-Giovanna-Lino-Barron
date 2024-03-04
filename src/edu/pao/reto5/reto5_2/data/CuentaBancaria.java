package edu.pao.reto5.reto5_2.data;

import edu.pao.reto5.reto5_2.data.Cliente;
/**
 * Clase que representa una cuenta bancaria.
 */
public class CuentaBancaria

{
    private String numeroCuenta;
    private double saldo;
    private String tipo;
    private Cliente cliente;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipo, Cliente cliente)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    /**
     * Sirve para depositar o retirar el monto de la cuenta bancaria del cliente.
     * @param monto
     */
    public void depositar(double monto)
    {
        saldo += monto;
    }
    public void retirar(double monto)
    {
        if (monto <= saldo)
        {
            saldo -= monto;
        } else
        {
            System.out.println("Saldo insuficiente.");
        }
    }
}