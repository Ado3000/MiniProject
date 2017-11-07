package miniproject.facade;
import miniproject.entities.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentFacade extends AbstractFacade<Student> {
	@PersistenceContext(unitName="MiniProject")
	private EntityManager em;
	
	public StudentFacade() {
		super(Student.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
