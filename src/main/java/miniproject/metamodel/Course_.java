package miniproject.metamodel;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import miniproject.entities.Course;

@StaticMetamodel( Course.class )
public class Course_ {
	
	 public static volatile SingularAttribute<Course, String> courseid;
	 public static volatile SingularAttribute<Course, String> coursename;

}
