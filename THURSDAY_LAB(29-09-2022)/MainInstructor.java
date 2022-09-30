package com.hibernet.labassignment;

import java.util.Scanner;

public class MainInstructor 
{
public static void main(String[] args) 
{
	int choice;
	
	Scanner sc=new Scanner(System.in);
	InstructorOperation instructor=new InstructorOperation();
	CourseOperation course=new CourseOperation();
	
	do
	{
		System.out.println(" ---Choose Your Course Correctlly---  ");
		
		System.out.println("============================================");
		
		System.out.println("Press 1.Add Instructor Details \n"+
					       "press 2.Get Instructor Details  \n" +
					       "press 3.Update Instructor Details \n"+
					       "press 4.Delete Instructor Details  \n"+
					       "press 5.Add Courses details \n"+
					       "press 6.Get Courses  Details  \n"+
						   "press 7.Update Course Details \n"+
						   "press 8.Delete Course Details \n"+
						   "press 9.Assing Course to Instructor \n"+
						   "press 10. for exit");
						  
		System.out.println("============================================");
		System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				instructor.addInstructor();
				System.out.println("============================================");
				break;
			
		case 2:
				instructor.getInstructor();
			System.out.println("============================================");
			break;
		case 3:
			instructor.updateInstructor();
		System.out.println("============================================");
		break;
		case 4:
			instructor.deleteInstructor();
		System.out.println("============================================");
		break;
		
		case 5:
			course.addCourse();
		System.out.println("============================================");
		break;
		case 6:
			course.getCourse();
		System.out.println("============================================");
		break;
		
		case 7:
			course.updateCourse();
		System.out.println("============================================");
		break;
		
		case 8:
			course.deleteCourse();
		System.out.println("============================================");
		break;
		
		case 9:
			course.assingCourse();
		System.out.println("============================================");
		break;
		
		case 10:
			System.out.println("Exit Successfully");
			break;
			
			default:
				System.out.println("Enter correct choice");
			break;
					
	}

}
while(choice!=10);
	System.out.println("Thanku for visit");

		}
	
}
