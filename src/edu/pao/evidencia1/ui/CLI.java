package edu.pao.evidencia1.ui;

import edu.pao.evidencia1.process.Medicamentos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase sirve para que el usuario interactue con la interfaz, ingresando los datos solicitados.
 **/
public class CLI
{
    public static void main (String[]args)
    {
        Date fechaActual = new Date();
        Scanner scanner = new Scanner(System.in);
        String contraseña;
        String usuario;
        /**
         * Se ingresa el usuario y la contraseña, en caso de que el campo esté vacío, vuelve a pedir
         * los datos.
         **/
        do
        {
            System.out.println("Ingrese su usuario:");
            usuario = scanner.nextLine();

            if (usuario.isEmpty())
            {
                System.out.println("Campo vacío. Por favor, ingrese su usuario.");
            }
        } while (usuario.isEmpty());

        do
        {
            System.out.println("Ingrese su contraseña:");
            contraseña = scanner.nextLine();

            if (contraseña.isEmpty())
            {
                System.out.println("Campo vacío. Por favor, ingrese su contraseña.");
            }
        } while (contraseña.isEmpty());

        System.out.println("Bienvenido(a), " + usuario);

        ArrayList<Medicamentos> listaMedicamentos = new ArrayList<>();

        /**
         * Registro de médicamentos
         **/
        String opcion;
        do
        {
            System.out.println("---Ingrese los datos del médicamento---");
            System.out.println("Nombre químico:");
            String nombreQuimico = scanner.nextLine();
            System.out.println("Nombre genérico:");
            String nombreGenerico = scanner.nextLine();
            System.out.println("Nombre registrado:");
            String nombreRegistrado = scanner.nextLine();
            System.out.println("Precio al público:");
            double precioPublico = Double.parseDouble(scanner.nextLine());
            System.out.println("Forma farmacéutica (sólida, semisólida, líquida):");
            String formaFarmaceutica = scanner.nextLine();

            /**
             * Se cálcula el precio de venta dependiendo de la forma farmacéutica.
             **/
            double precioVenta = Medicamentos.calcularPrecioVenta (precioPublico, formaFarmaceutica);

            /**
             * Se agrega el medicamento a la lista de medicamentos.
             **/
            Medicamentos medicamentos = new Medicamentos(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, precioVenta, formaFarmaceutica);
            listaMedicamentos.add(medicamentos);

            System.out.println("¿Desea agregar otro medicamento?");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("sí"));
        /**
         * Se muestra el reporte en pantalla.
         **/
        System.out.println("---Reporte de medicamentos---");
        System.out.println("Usuario: " + usuario);
        System.out.println("Fecha del reporte: " + fechaActual);
        System.out.println("Medicamentos en la lista: " + listaMedicamentos.size());
        System.out.println("Desgloce: " + listaMedicamentos.size());

        for (int i = 0; i < listaMedicamentos.size(); i++)
        {
            Medicamentos med = listaMedicamentos.get(i);
            System.out.println(" " + med.getNombreRegistrado() + " - Precio al público: $" + med.getPrecioPublico() + " - Precio de venta: $" + med.getPrecioVenta());
        }
    }
}