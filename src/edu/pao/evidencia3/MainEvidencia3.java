package edu.pao.evidencia3;

public class MainEvidencia3
{
    /**
     * Este método es el punto de entrada de la aplicación.
     * Se encarga de activar el menú llamando a `CLI.main(String[])`
     * y de atrapar cualquier excepción, mostrando un mensaje
     * en caso de que ocurra un error inesperado.
     */

    public static void main(String[] arg)
    {
        try {
            // Llamada al método main de CLI con un arreglo vacío de String
            edu.pao.evidencia3.ui.CLI.main(new String[0]);
        } catch (Exception e)
        {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();  // Opcional: para mostrar más detalles del error
        }
    }
}

