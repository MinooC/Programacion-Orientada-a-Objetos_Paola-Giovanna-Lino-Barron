package edu.pao.evidencia2.data;
import edu.pao.evidencia2.process.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class GeneradorArticulo
{
    public static final Random random = new Random();
    public static final List<String> peliculas = new ArrayList<>();
    public static final List<String> canciones = new ArrayList<>();
    public static final List<String> generos = new ArrayList<>();

    static {
        peliculas.add("Harry Potter");
        peliculas.add("Star Wars");
        peliculas.add("Terminator");
        peliculas.add("Back to the future");
        peliculas.add("Barbie");

        canciones.add("Believer");
        canciones.add("I want it that way");
        canciones.add("I wanna be your slave");
        canciones.add("New rules");
        canciones.add("Bad romance");

        generos.add("novela");
        generos.add("tecnologia");
        generos.add("ciencia ficcion");
        generos.add("historia");
        generos.add("autoayuda");
    }

    private static List<Articulos> generateRandomConsumption() {
        List<Articulos> articulos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int choice = random.nextInt(4);
            boolean esEstreno = random.nextBoolean();
            switch (choice) {
                case 0:
                    articulos.add(new Cancion(estreno));
                    break;
                case 1:
                    articulos.add(new Videojuego());
                    break;
                case 2:
                    articulos.add(new Pelicula(estreno));
                    break;
                case 3:
                    articulos.add(new Libro(generos.get(random.nextInt(generos.size())), esEstreno));
                    break;
            }
        }
        return articulos;
    }
}