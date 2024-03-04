package edu.pao.reto5.reto5_4;

import edu.pao.reto5.reto5_4.data.AgendaTelefonica;

/**
 * Clase principal que contiene el método main para probar la agenda telefónica.
 */
public class MainReto5_4
{
    public static <Contacto> void main(String[] args)
    {
        /**
         * Se crea un contacto.
         */
        Contacto contacto1 = new Contacto("Juan", "Calle 123", "123456789", "987654321");
        Contacto contacto2 = new  Contacto("María", "Avenida 456", "987654321", "123456789");

        /**
         * Se crea una agenda telefónica.
         */
        AgendaTelefonica agenda = new AgendaTelefonica();

        /**
         * Se agrega el contacto.
         */
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
    }
}