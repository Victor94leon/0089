
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    public void test()
    {
        AgendaTelefonica agenda = new AgendaTelefonica();
        //Se hacen correctamente consultas a una agenda vacía.
        agenda.lookupNumber("nombre");
        //Se introducen correctamente contactos.
        agenda.enterNumber("Pepe","987654321");
        //Se consulta correctamente el teléfono de un contacto existente.
        agenda.lookupNumber("Pepe");
        //Se consulta correctamente el teléfono de un contacto inexistente.
    }
}
