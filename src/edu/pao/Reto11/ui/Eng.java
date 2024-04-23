package edu.pao.Reto11.ui;

/**
 * La clase Eng proporciona textos en inglés para la interfaz de usuario.
 * Extiende la clase Textos y proporciona implementaciones para los métodos abstractos definidos en ella.
 **/

public class Eng extends Textos
{
    @Override
    public String menu()
    {
        return "Choose the desired book: ";
    }

    @Override
    public String bienvenida()
    {
        return "Welcome to the word counter.";
    }

    @Override
    public String palabra()
    {
        return ". Word: ";
    }

    @Override
    public String repeticiones()
    {
        return ", repetitions: ";
    }

    @Override
    public String palabras_repetidas()
    {
        return "The 10 Most Common Words in the Book ";
    }

    @Override
    public String error_lectura()
    {
        return "Error reading the book file.";
    }

    @Override
    public String opcion_invalida()
    {
        return "Invalid option, please try again.";
    }
}