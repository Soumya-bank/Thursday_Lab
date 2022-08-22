package studentManagementSystem;
import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		int choice;
		
		Scanner sc=new Scanner(System.in);
		
		StudentDetails stdDetails=new StudentDetails();
		
		do
		{
			System.out.println(" ---Choose Your Course to take Admission---  ");
			
			System.out.println("============================================");
			System.out.println("Press 1.Java \n"+
						       "press 2. Aws \n" +
						       "press 3. get Java Student Details \n"+
						       "press 4. get Aws Student Details \n"+
						       "press 5. Update Java Student Details \n"+
						       "press 6. Update Aws Student Details \n"+
							   "press 7. for Exit");
			System.out.println("============================================");
			System.out.println("Enter Your Choice");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						
							stdDetails.javaStudentDetails();
							System.out.println("============================================");
							break;
						
					case 2:
						stdDetails.awsStudentDetails();
						System.out.println("============================================");
						break;
					
					case 3:
						stdDetails.getDetailsJavaStudent();
						System.out.println("============================================");
						break;
					case 4:
						stdDetails.getAwsStudentDetails();
						System.out.println("============================================");
						break;
						
					case 5:
						try
						{
						stdDetails.updateJavaStudent();
						}
						catch(StudentIdNotFoundException e)
						{
							System.out.println(e.getMessage());
						}
					
						System.out.println("============================================");
						break;
					case 6:
						try
						{
						stdDetails.updateAwsStudent();
						}
						catch(StudentIdNotFoundException e)
						{
							System.out.println(e.getMessage());
						}
					
						System.out.println("============================================");
						break;
						
					case 7:
						System.out.println("Exit Successfully");
						System.exit(0);
						break;
						
						default:
							try
							{
							throw new NoCourseFoundException("Sorry...No Sutable Course Available");
							}
							catch(NoCourseFoundException e)
							{
								System.out.println(e.getMessage());
							}
							break;
					
				}
				

		}
		while(choice!=8);
		
		
}
}