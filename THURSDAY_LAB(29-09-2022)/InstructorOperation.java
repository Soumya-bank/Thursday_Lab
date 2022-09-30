package com.hibernet.labassignment;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InstructorOperation 
{
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	
		Scanner sc=new Scanner(System.in);
	
	public void addInstructor()
	
	{	
		
		session.beginTransaction();
		Instructor instructor=new Instructor();
		
		
		System.out.println("Enter Instructor Id: ");
		int iID=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Instructor Name: ");
		String iName=sc.nextLine();
		
		System.out.println("Enter Instructor City: ");
		String iCity=sc.nextLine();
		
		instructor.setInstructorId(iID);
		instructor.setInstructorName(iName);
		instructor.setInstructorCity(iCity);
		
		session.save(instructor);
		System.out.println("Given details added Sussesfully..");
		
		session.getTransaction().commit();		
		
	}
	
	public void getInstructor()
	{
		session.beginTransaction();
		
		String query1="from Instructor";
		Query q=session.createQuery(query1);
		List<Instructor> ilist=q.getResultList();
		for(Instructor instructors:ilist)
		{
			System.out.println(instructors);
		}
		
		session.getTransaction().commit();
		session.clear();
		
	}
	
	public void updateInstructor()
	{
		session.beginTransaction();
		
		Query q= session.createQuery("update Instructor set instructorName=:iname, instructorCity=:icity where instructorId=:i");
			
		System.out.println("Give Instructror Id: ");
		int newiId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter New Instructor Name: ");
		String newiName=sc.nextLine();
		
		System.out.println("Enter New Instructor City: ");
		String newiCity=sc.nextLine();
		
		q.setParameter("iname", newiName);
		q.setParameter("icity",newiCity );
		q.setParameter("i", newiId);
		
		int r=q.executeUpdate();
		System.out.println(r+ " record updated sucessfully");
		
		session.getTransaction().commit();
		
	}
	
	public void deleteInstructor()
	{
		session.beginTransaction();
		Query q=session.createQuery("delete from Instructor i where i.instructorId=:id");
		System.out.println("Give Course Id: ");
		int newiId=sc.nextInt();
		
		q.setParameter("id", newiId);
		
		int row =q.executeUpdate();
		System.out.println(row+"record delete succesfully...");
	
		
		
		session.getTransaction().commit();
		
	}

}
