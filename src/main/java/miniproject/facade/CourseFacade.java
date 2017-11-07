package miniproject.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import miniproject.entities.*;

@Stateless
public class CourseFacade extends  AbstractFacade<Course>{
	@PersistenceContext(unitName="MiniProject")
	private EntityManager em;
	
	public CourseFacade() {
		super(Course.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
