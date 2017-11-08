package miniproject.mjb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import miniproject.entities.Course;
import miniproject.entities.RegisteredCourse;
import miniproject.entities.Student;
import miniproject.facade.StudentFacade;
import miniproject.facade.*;

@ManagedBean
public class FacultyBean implements Serializable {

	private String name;
	private String email;
	private String password;
	private String coursename;
	private String courseid;

	private static Student student;
	private Course course;
	private RegisteredCourse registeredCourse;

	@Inject
	@EJB private StudentFacade studentEJB;
	@EJB private CourseFacade courseEJB;
	@EJB private RegisteredCourseFacade registeredCourseEJB;

	private List<Course> courseList;
	private List<Student> studentList;

	private static final long serialVersionUID = 1L;

	public List<Course> getCourseList(){
		if (courseList == null) {
			courseList = courseEJB.findAll();
		}
		return courseList;
	}

	public String registerStudent(){
		student = new Student(name,email,password);
		studentEJB.create(student);
		return "coursereg";
	}

	public void registerCourse(){
		course = courseEJB.findByName(coursename);
		registeredCourse = new RegisteredCourse(course, student);
		registeredCourseEJB.create(registeredCourse);
	}

	public void register(RegisteredCourse registered){
		registeredCourseEJB.edit(registered);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student getStudent() {
		return student;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public RegisteredCourse getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(RegisteredCourse registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	public RegisteredCourseFacade getRegisteredCourseFacade(){
		return registeredCourseEJB;
	}


}
