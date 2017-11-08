package miniproject.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.*;


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

	@JoinColumns({
		  @JoinColumn(name = "courseid",referencedColumnName="courseid", nullable=false),
		  @JoinColumn(name = "coursename",referencedColumnName="coursename", nullable=false)})
	private Course course;

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

	
	
	
	
}
