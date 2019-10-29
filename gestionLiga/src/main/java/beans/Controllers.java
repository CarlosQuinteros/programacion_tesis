/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import modelo.gestionliga.Club;
import persistencia.ClubFacade;

/**
 *
 * @author CARLOS-ASUS
 */
@Named(value = "controllers")
@SessionScoped
public class Controllers implements Serializable {
    private static long serializableUID= 1L;
    @EJB
    private ClubFacade elfacade;
    private Club current;
    /**
     * Creates a new instance of Controllers
     */
    public Club getCurrent()
    {
        if(current==null)
        {
            current=new Club();
        }
        return current;
    }
    
    public void guardarClub()
    {
        if(elfacade.crearClub(current))
        {
            System.out.println("Creado");
        }
        System.out.println("NO creado");
    }
    
 
    
}
