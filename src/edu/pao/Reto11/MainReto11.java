package edu.pao.Reto11;
import edu.pao.Reto11.ui.CLI;

public class MainReto11
{
    /**
     * Es la encargada activar el menu y,
     * además, de atrapar los errores y mostar un
     * mensaje ante esta situación.
     */
    public static void main(String[] arg)
    {
        try
        {
            CLI.showMenu();
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}