package br.inatel.dm110.ibge.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.inatel.dm110.ibge.entities.State;

@Stateless
public class IBGEDAO {

	@PersistenceContext(unitName = "ibge_pu")
    private EntityManager em;
	
    //STATES
    public List<State> listAllStates() {
        Query query = em.createQuery("from State s", State.class);
        return query.getResultList();
    }
    
    public void insertState(State state) {
        em.persist(state);
    }
	
}
