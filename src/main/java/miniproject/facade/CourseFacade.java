package miniproject.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import miniproject.entities.*;
import miniproject.metamodel.Course_;

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
	
	public Course findByName(String coursename) {
		return getEntityManager().createQuery("SELECT c FROM Course c WHERE c.coursename = '" + coursename + "'", Course.class).getSingleResult();
	}
}
