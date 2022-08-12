package bookManagementSystem;
import java.util.Scanner;

public class BookMain 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		
		BookService bservice=new BookService();
		
		do {
			System.out.println("--Welcome to Book Mangement System--");
			System.out.println("============================================");
			System.out.println("Press 1. for create Book details \n"
							  +"press 2. for get book details by Id \n"
							  +"press 3. for get all book details \n"
							  +"press 4. for update book details \n"
							  +"press 5. for quit");
			System.out.println("============================================");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					bservice.createBook();
					System.out.println("============================================");
					break;
				case 2:
					bservice.getBookById();
					System.out.println("============================================");
					break;
				case 3:
					bservice.getAllBookDetails();
					System.out.println("============================================");
					break;
				case 4:
					bservice.updateBookById();
					System.out.println("============================================");
					break;
					
				case 5:break;
					
				default:System.out.println("Enter correct choice");
					
					
			}
		}
		while(choice!=5);
		System.out.println("Thanku for visit");
		
	}

}