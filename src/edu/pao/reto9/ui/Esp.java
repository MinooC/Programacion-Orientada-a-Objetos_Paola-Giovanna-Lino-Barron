package edu.pao.reto9.ui;
/**
 * La clase Esp proporciona textos en español para la interfaz de usuario.
 * Extiende la clase Textos y proporciona implementaciones para los métodos abstractos definidos en ella.
 */

public class Esp extends Textos
{
    @Override
    public String menu()
    {
        return "Elija el libro deseado: ";
    }

    @Override
    public String bienvenida()
    {
        return "Bienvenido al contador de palabras.";
    }

    @Override
    public String palabra()
    {
        return ". Palabra: ";
    }

    @Override
    public String repeticiones()
    {
        return ", repeticiones: ";
    }

    @Override
    public String palabras_repetidas()
    {
        return "Las 10 palabras más repetidas en el libro son: ";
    }

    @Override
    public String error_lectura()
    {
        return "Error al leer el archivo del libro.";
    }

    @Override
    public String opcion_invalida()
    {
        return "Opcion invalida, por favor intentelo de nuevo.";
    }
}
