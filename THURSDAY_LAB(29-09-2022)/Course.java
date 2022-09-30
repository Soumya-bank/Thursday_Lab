package com.hibernet.labassignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name=" course_info")
@NamedQuery(name = "course.id",query = "from Course where courseId=?1")
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int courseId;
	
	@Column(name="course_name",length = 50)
	String courseName;
	
	@Column(name=" course_duration" , length = 50)
	String courseDuration;
	
	@Column(name="course_fee", length = 50)
	double courseFee;
	
	//many courses can teach by one instructor
	@ManyToOne
	@JoinColumn(name = "instructorId")
	private Instructor instructor;

	

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseFee=" + courseFee + "]";
	}

	public Course() {
		super();
		
	}

	public Course(int courseId, String courseName, String courseDuration, double courseFee, Instructor instructor) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
		this.instructor = instructor;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	
}
