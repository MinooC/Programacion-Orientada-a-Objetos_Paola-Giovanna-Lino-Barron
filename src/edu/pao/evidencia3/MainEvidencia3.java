package edu.pao.evidencia3;
import edu.pao.evidencia3.ui.CLI;
public class MainEvidencia3
{
    /**
     * Es la encargada activar el menu y,
     * ademas, de atrapar los errores y mostar un
     * mensaje ante esta situacion.
     */
    public static void main(String[] arg)
    {
        try{
            CLI.showMenu();
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}