package edu.pao.reto5.reto5_4.data;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una agenda telefónica.
 */
public class AgendaTelefonica
{
    private List<Contacto> contactos;

    public AgendaTelefonica()
    {
        contactos = new ArrayList<>();
    }
    /**
     * Método para agregar un contacto a la agenda telefónica.
     * @param contacto El contacto a agregar.
     */
    public void agregarContacto(Contacto contacto)
    {
        contactos.add(contacto);
    }

    /**
     * Método para eliminar un contacto a la agenda telefónica.
     * @param contacto El contacto a eliminar.
     */
    public void eliminarContacto(Contacto contacto)
    {
        contactos.remove(contacto);
    }

    /**
     * Método para buscar un contacto por su nombre en la agenda telefónica.
     * @param nombre El nombre del contacto a buscar.
     * @return El contacto encontrado, o null si no se encuentra.
     */
    public Contacto buscarContacto(String nombre)
    {
        for (Contacto contacto : contactos)
        {
            if (contacto.getNombre.equalsIgnoreCase(nombre))
            {
                return contacto;
            }
        }
        return null;
    }
    public <Contacto> void agregarContacto(Contacto contacto1)
    {

    }
}