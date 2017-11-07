package miniproject.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="registeredCourse")
public class RegisteredCourse {
	
	
	public RegisteredCourse(){
		
	}
	
	public RegisteredCourse(Course course,Student student){
		this.course = course;
		this.student = student;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="email", referencedColumnName="email", nullable=false)
	private Student student;

	@ManyToOne
	@JoinColumn(name="courseid", referencedColumnName="courseid", nullable=false)
	private Course course;
	
	@JoinColumn(name="coursename", referencedColumnName="coursename", nullable=false)
	private String courseName;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
}
