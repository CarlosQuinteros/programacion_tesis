/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.gestionliga.Club;

/**
 *
 * @author CARLOS-ASUS
 */
@Stateless
public class ClubFacade extends AbstractFacade<Club> {

    @PersistenceContext(unitName = "modelo_gestionLiga_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClubFacade() {
        super(Club.class);
    }
    
    public boolean crearClub(Club pClub)
    {
        try {
            create(pClub);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
