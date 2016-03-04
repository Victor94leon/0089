import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // Objeto de la clase HashMap para guardar el listado de contactos de la agenda telefónica
    private HashMap<String,String> agenda;
    
    /**
     * Constructor de un objeto de la clase AgendaTelefo
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<String,String>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number) 
    {
        agenda.put(name,number);
    }
    
    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }
}

