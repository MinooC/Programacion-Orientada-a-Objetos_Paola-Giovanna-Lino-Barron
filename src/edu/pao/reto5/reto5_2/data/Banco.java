package edu.pao.reto5.reto5_2.data;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una cuenta bancaria.
 */
public class Banco
{
    private List<Cliente> clientes;
    private List<CuentaBancaria> cuentas;

    public Banco()
    {
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void abrirCuenta(CuentaBancaria cuenta)
    {
        cuentas.add(cuenta);
    }
}