package edu.pao.reto8;

import edu.pao.reto8.iu.CLI;package edu.pao.reto8.iu;

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
