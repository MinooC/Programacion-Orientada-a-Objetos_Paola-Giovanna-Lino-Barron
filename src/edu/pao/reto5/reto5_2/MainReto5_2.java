package edu.pao.reto5.reto5_2;

import edu.pao.reto5.reto5_2.data.Banco;
import edu.pao.reto5.reto5_2.data.Cliente;
import edu.pao.reto5.reto5_2.data.CuentaBancaria;

/**
 * Clase principal que contiene el método main para probar la gestión de cuentas bancarias.
 */
public class MainReto5_2
{
    public static void main(String[] args)
    {
        /**
         * Se crea un cliente.
         **/
        Cliente cliente1 = new Cliente("Juan Perez", "Calle 123", "123456789", "987654321");

        /**
         * Se crea una cuenta bancaria para el cliente.
         **/
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890", 1000.0, "Corriente", cliente1);

        /**
         * Se crea una instancia del banco.
         **/
        Banco banco = new Banco();

        /**
         * Se agrega el cliente al banco.
         **/
        banco.agregarCliente(cliente1);

        /**
         * Se abre una cuenta para el cliente en el banco.
         **/
        banco.abrirCuenta(cuenta1);

        /**
         * Se realizan operaciones bancarias.
         **/
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
    }
}