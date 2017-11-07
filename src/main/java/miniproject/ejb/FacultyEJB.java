package miniproject.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FacultyEJB {
	@PersistenceContext(unitName="MiniProject")
	private EntityManager em;

}
