package edu.pao.evidencia1;
import edu.pao.evidencia1.ui.CLI;

import java.util.Scanner;
/**
 * Esta clase incia la aplicación llamando al método main() de la clase CLI, que a su vez inicia la
 * interfaz de línea de comandos para el ingreso de datos de los medicamentos.
 **/
public class MainEvidencia1
{
    public static void main(String[] args)
    {
        try
        {
            CLI.main(args);
        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }
}