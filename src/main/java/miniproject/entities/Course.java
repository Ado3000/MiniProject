package miniproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course{

	public Course(){
		
	}
	
	public Course(String courseid, String coursename){
		this.courseId = courseid;
		this.coursename = coursename;
	}
	
	@Id
	@Column(name="courseid", nullable=false, length=255)
	private String courseId;
	
	@Column(name="coursename", nullable=false, length=255)
	private String coursename;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	
	
	

}
