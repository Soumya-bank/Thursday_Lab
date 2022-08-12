package bookManagementSystem;
import java.util.Scanner;

public class BookService 
{
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	//creating book method
	
	public static void createBook()
	{
		System.out.println("Enter Book Id: ");
		int id=sc.nextInt();
		
		sc.nextLine(); //it will consume \n character
		
		System.out.println("Enter Book Name: ");
		String bname=sc.nextLine();
		
		System.out.println("Enter Book Price: ");
		double price=sc.nextDouble();
		
		
		book[index]=new Book(id,bname,price);
		index++;
		System.out.println("Book details created Successfully");
		
	}
	//get book details based on id
	public static void getBookById() 
	{
		boolean f=false;
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		
		for(int i=0; i<index; i++)
		{
			if(id==book[i].getBookId())
			{
				//System.out.println(book[i]);
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("============================================");
				f=true;
				break;
			}
			
		}
		if(f==false)
			System.out.println("Data not Found");
		
	}
	
	//get all book deatils
	
	static void getAllBookDetails()
	{
		for(int i=0; i<index; i++)
		{
		System.out.println("Book Id: "+book[i].getBookId());
		System.out.println("Book Name: "+book[i].getBookName());
		System.out.println("Book Price: "+book[i].getBookPrice());
		System.out.println("============================================");
		
		}
	}
	
	//updating book details by book id
	public static void updateBookById()
	{
		boolean status=true;
		System.out.println("Enter Book Id to update book details");
		int id=sc.nextInt();
		for(int i=0; i<index; i++)
		{
			if(id==book[i].getBookId());
			{
				System.out.println("Enter new Book Id: ");
				int bid=sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Book Name: ");
				String bname=sc.nextLine();
				
				System.out.println("Enter Book Price: ");
				double price=sc.nextDouble();
				book[i]=new Book(bid, bname, price);
				
				System.out.println("Book has been updated successfully");
				status=true;	
			}
			if(status==false)
			{
				System.out.println("Book id not found");
				System.out.println("==============================================");
			}
		}
	}

}