package studentManagementSystem;
import java.util.Scanner;
	public class StudentDetails 
	{
		static Student stdjava[]=new Student[50];
		static Student stdaws[]=new Student[50];
		
		static Scanner sc=new Scanner(System.in);
		static int jindex=0;
		static int aindex=0;
		
		
		//getting java Student details
		public static void javaStudentDetails() 
		{
			System.out.println("Welcome to java Course ");
			System.out.println("Enter Student Id: ");
			int id=sc.nextInt();
			
			sc.nextLine();//it will consume \n character
			
			System.out.println("Enter Student Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter Student Mail Id: ");
			String mailId=sc.nextLine();
			
			System.out.println("Enter Student Phno :");
			long phno=sc.nextLong();
			
			stdjava[jindex]=new Student(id,name,mailId,phno);
			jindex++;
			
			

			System.out.println("Java Student Details Added Successfully");
			
		}
		//getting aws student details
		public static void awsStudentDetails()
		{
			System.out.println("Welcome to Aws Course ");
		
			System.out.println("Enter Student Id: ");
			int id=sc.nextInt();
			
			sc.nextLine();//it will consume \n character
			
			System.out.println("Enter Student Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter Student Mail Id: ");
			String mailId=sc.nextLine();
			
			System.out.println("Enter Student Phno :");
			long phno=sc.nextLong();
			
			stdaws[aindex]=new Student(id,name,mailId,phno);
			aindex++;
			System.out.println("Aws Student Details Added Successfully");
			
		}
		
		//get java students details
		public static void getDetailsJavaStudent() 
		{
			for(int i=0; i<jindex; i++)
			{
				{
					System.out.println("Student Id: "+stdjava[i].getStudentId());
					System.out.println("Student Name: "+stdjava[i].getStudentName());
					System.out.println("Student Mail: "+stdjava[i].getStudentEmailId());
					System.out.println("Student Phno: "+stdjava[i].getStudentEmailId());
					System.out.println("============================================");
				
				}	
			}
		}
		
		//get Aws students details	
			public static void getAwsStudentDetails() 
			{
				for(int i=0; i<aindex; i++)
				{
					{
						System.out.println("Student Id: "+stdaws[i].getStudentId());
						System.out.println("Student Name: "+stdaws[i].getStudentName());
						System.out.println("Student Mail: "+stdaws[i].getStudentEmailId());
						System.out.println("Student Phno: "+stdaws[i].getStudentEmailId());
						System.out.println("============================================");
					
					}
				}
			}
			
			//update details based on id
			public static void updateJavaStudent() throws StudentIdNotFoundException
			{
				boolean status=false;
				System.out.println("Enter Id: ");
				int id=sc.nextInt();
				
				for(int i=0; i<jindex; i++)
				{
					if(id==stdjava[i].getStudentId())
					{
						
						System.out.println("Enter Student Id: ");
						int bid=sc.nextInt();
						
						sc.nextLine();
						
						System.out.println("Enter Student Name: ");
						String sname=sc.nextLine();
						
						System.out.println("Enter Student Mail Id: ");
						String mailId=sc.nextLine();
						
						System.out.println("Enter Student Phno :");
						long phno=sc.nextLong();
						
						
						stdjava[i]=new Student(bid, sname, mailId,phno);
						
						System.out.println("Java Student Details has been updated successfully");
						status=true;
						break;
					}
					
				}
				if(status==false)
				{
					throw new StudentIdNotFoundException("No Student Id Found in system");
				}
			}
			
			
			
			//updating Aws Student details by book id
			public static void updateAwsStudent() throws StudentIdNotFoundException
			{
				boolean status=false;
				System.out.println("Enter Id: ");
				int id=sc.nextInt();
				
				for(int i=0; i<aindex; i++)
				{
					if(id==stdaws[i].getStudentId())
					{
						//System.out.println(book[i]);
						System.out.println("Enter Student Id: ");
						int bid=sc.nextInt();
						
						sc.nextLine();
						
						System.out.println("Enter Student Name: ");
						String sname=sc.nextLine();
						
						System.out.println("Enter Student Mail Id: ");
						String mailId=sc.nextLine();
						
						System.out.println("Enter Student Phno :");
						long phno=sc.nextLong();
						
						
						stdaws[i]=new Student(bid, sname, mailId,phno);
						
						System.out.println("Aws Student Details has been updated successfully");
						status=true;
						break;
					}
					
				}
				if(status==false)
				{
					throw new StudentIdNotFoundException("No Student Id Found in system");
				}

		}		
	}
