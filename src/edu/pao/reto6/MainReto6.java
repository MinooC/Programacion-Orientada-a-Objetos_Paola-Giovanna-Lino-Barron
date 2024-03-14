package edu.pao.reto6;

import edu.pao.reto6.ui.CLI;

public class MainReto6
{
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
