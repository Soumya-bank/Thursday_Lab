package com.hibernet.labassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CourseOperation
{
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	
		Scanner sc=new Scanner(System.in);
		
	public void addCourse()
	{
		session.beginTransaction();
		
		Course course=new  Course();
		
		System.out.println("Enter Course Name: ");
		String cName=sc.nextLine();
		
		
		System.out.println("Enter Course Fee: ");
		double cfee=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Course Duration: ");
		String cDuration=sc.nextLine();
		
		course.setCourseName(cName);
		course.setCourseFee(cfee);
		course.setCourseDuration(cDuration);
		
		session.save(course);
		System.out.println("Given Course added succesfully..");
		
		session.getTransaction().commit();
		
		
	}
	
	public void getCourse()
	{
		session.beginTransaction();
		Query q=session.getNamedQuery("course.id");
		System.out.println("Enter Course Id");
		int cid=sc.nextInt();
		q.setInteger(1, cid);
		List<Course> clist=q.list();
		for(Course c:clist)
		{
			System.out.println(c);
		}
		
		session.getTransaction().commit();
		session.clear();
		
	}
	
	
	public void updateCourse() 
	{
		session.beginTransaction();
		
		Query q= session.createQuery("update Course set courseName=:cname, course_fee=:cfee,"
				+ "courseDuration=:cduration where courseId=:i");
		
		System.out.println("Give Course Id: ");
		int newiId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter New Course Name: ");
		String cName=sc.nextLine();
		
		
		System.out.println("Enter New Course Fee: ");
		double cfee=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter New  Course Duration: ");
		String cDuration=sc.nextLine();
		
		
		
		q.setParameter("cname", cName );
		q.setParameter("cfee",cfee );
		q.setParameter("cduration", cDuration);
		q.setParameter("i", newiId);
		
		int r=q.executeUpdate();
		System.out.println(r+ " record updated sucessfully");
		
		session.getTransaction().commit();
		
		
	}
	
	
	public void deleteCourse()
	{
		session.beginTransaction();
		
		Query q=session.createQuery("delete from Course c where c.courseId=:i");
		System.out.println("Give Course Id: ");
		int newiId=sc.nextInt();
		
		q.setParameter("i", newiId);
		
		int row =q.executeUpdate();
		System.out.println(row+"record delete succesfully...");
		
		session.getTransaction().commit();
	}
	
	public void assingCourse()
	{
		session.beginTransaction();
		System.out.println("Enter Instructor Id: ");
		int inId=sc.nextInt();
		
		System.out.println("Enter course Id: ");
		int cId=sc.nextInt();
		
		Instructor ins=session.get(Instructor.class, inId);
		Course course=session.get(Course.class, cId);
		
		List<Course> courses=new ArrayList<Course>();
			courses.add(course);
			
			
		
			
			ins.setCourses(courses);
			course.setInstructor(ins);
			session.saveOrUpdate(ins);
			System.out.println("assingCourse sucessfully...");
			session.getTransaction().commit();
		
	}

}
