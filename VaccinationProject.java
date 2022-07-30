package codingjava;

import java.util.Scanner;

//We can't create Instance but we can create reference variable
abstract class Vaccine  //this is a abstract class
{
	//instance variables 
	int age;
	String nationality;
	
	Scanner sc=new Scanner(System.in); //Scanner Class Object to taking data from user
	
	public void firstDose()  //concrete method - method has body
	{	
		
		System.out.println("Enter Your Nationality");
				nationality=sc.next();
				
				//checking User is Indian or Not
		if(nationality.equalsIgnoreCase("Indian"))
		{
			System.out.println("Enter Your Age: ");
			age=sc.nextInt();
			
			//checking user is 18 years or older
			if(age>=18)
			{
				System.out.println("You Can take the First Dose.");
				System.out.println("Your Processing fee will be 250 rs");
				System.out.println(" ");
			}
			else
			{
				System.out.println("You are below 18 year so you are not eligible to take Vaccine");
				 
				System.exit(0); //whenever compiler will come here program will terminate 
			}
			
			
		}
		else
		{
			System.out.println("As You are Not indian so You are not eligible to take vaccine");
			System.exit(0);
		}
		
	}
	
	public void secondDose() //concrete method - method has body
	{
		System.out.println("Have you taken 1st Dose?");
		String chose=sc.next();
		//checking user has take 1st dose or not
		if(chose.equalsIgnoreCase("Yes"))
		{
			System.out.println("You are ready to take 2nd Dose");
			System.out.println("");
		}
		else
		{
			System.out.println("Please take 1st Dose then after 2 months you can take 2nd dose");
			System.exit(0);
		}
		
	}
	//abstract method-method has no body
	abstract public void boosterDose();
	
}

class VaccinationSuccessfull extends Vaccine
{

	@Override
	public void boosterDose() 
	{
		System.out.println("Have you taken 2st Dose?");
		String chose=sc.next();
		//checking user has take 2st dose or not
		if(chose.equalsIgnoreCase("Yes"))
		{
			System.out.println("Please take Booster Dose & complete your vaccination successfully");
			System.out.println(" ");
		}
		else
		{
			System.out.println("Please take 1st Dose then after 2 months you can take 2nd dose");
			System.exit(0);
		}

	}
	
}
public class VaccinationProject {
	public static void main(String[] args) 
	{
		Vaccine v;                 //creating child class object with parent class reference
		 v=new VaccinationSuccessfull();
		 //using parent class reference calling all the methods
		 v.firstDose();
		 v.secondDose();
		 v.boosterDose();	
	}
}
