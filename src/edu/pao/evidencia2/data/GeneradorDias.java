package edu.pao.evidencia2.data;
import java.util.Random;

import java.util.Random;

public class GeneradorDias {
    public static int generarDias() {
        Random rand = new Random();
        int diasConsumidos = rand.nextInt(31);
        return diasConsumidos;
    }
}
