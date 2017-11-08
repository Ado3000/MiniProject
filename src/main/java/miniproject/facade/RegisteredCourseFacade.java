package miniproject.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import miniproject.entities.RegisteredCourse;

@Stateless
public class RegisteredCourseFacade extends AbstractFacade<RegisteredCourse>{
	@PersistenceContext(unitName="MiniProject")
	private EntityManager em;
	
	public RegisteredCourseFacade() {
		super(RegisteredCourse.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	


}
