package edu.pao.reto8;
import edu.pao.reto8.iu.CLI;

/**
 * Iniciar la aplicación llamando al método main() de la clase CLI, que a su vez inicia la
 * interfaz.
 **/

public class MainReto8
{
    public static void main(String[] args) {
        try {
            CLI.launchApp();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}