
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        // nuevo cambio en main
        // mas comnetarios 
        // modificacion
        // cualquier cosa 
        // cualquier cosa 2
        
        List<Persona> personas = personaDAO.seleccionar();
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
            // comentario agregado
        }
    }
}
