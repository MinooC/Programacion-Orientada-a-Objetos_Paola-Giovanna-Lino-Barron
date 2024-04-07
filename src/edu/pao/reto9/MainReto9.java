package edu.pao.reto9;

import edu.pao.reto9.ui.CLI;

public class MainReto9
{
    /**
     * Es la encargada activar el menu y,
     * ademas, de atrapar los errores y mostar un
     * mensaje ante esta situacion.
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
