/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import modelo.Persona;
import persistencia.PersonaFacade;

/**
 *
 * @author CARLOS-ASUS
 */
@Named(value = "personaController")
@Dependent
public class PersonaController implements Serializable {

    private static final long serilversionUID = 1L;

    @EJB
    private PersonaFacade elFacade;

    private Persona current;

    public Persona getCurrent() {
        if (current == null) {
            current = new Persona();
            return current;

        }
        return current;
    }

    public List<Persona> listarPersonas() {
        return elFacade.findAll();
    }

}
