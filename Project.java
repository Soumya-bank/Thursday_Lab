/*Scenario: In a company there are employees with two designations Manager and Trainee. Both 
employees share the same set of attributes and basic salary calculation logic is same but the basic 
salary of trainee and manager are different.
The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other 
employees the travel allowance is 10% of the basic salary. Write a program to maintain the entities
using inheritance*/
// Create a class Employee
package codingjava;
class Employee       
{    // instance variable of class
	long employeeId,employeePhno;
	String  employeeName,employeeAddress;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	/*Create an overloaded constructor in the employee class, which takes the below constructor 
	parameters and initializes them to their respective instance variables*/

	public Employee(long employeeId,String employeeName,String employeeAddress,long employeePhno,double basicSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhno=employeePhno;
		this.basicSalary=basicSalary;
	}
	//Create a method calculateSalary
	
	public void calculateSalary() // salary of manager & trainee
	{
		double salary=basicSalary + (basicSalary*specialAllowance/100) + ( basicSalary*Hra/100);
		System.out.println("SALARY IS: "+salary);
	}
	//Add a method called calculateTransportAllowance for employee
	public void calculateTravelAllowence() 
	{
		 double TravelAllowence=10/100*basicSalary;
		System.out.println("TravelAllownce Is: "+TravelAllowence);
	}
}
/*Create the sub classes Manager and Trainee with base class Employee. Create overloaded 
constructors which takes the below parameters and initializes them to their respective variables in 
the super class*/

class Manager extends Employee  // sub class1 extends super class(hierarchical inheritance)
{
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhno,double basicSalary)
	{
		super(employeeId, employeeName, employeeAddress,employeePhno,basicSalary); // constructor chaining
	}
	//Add a method called calculateTransportAllowance for manager
	
	public void calculateTravelAllowence()
	{
		 double TravelAllowence=15/100*basicSalary;
		System.out.println("TravelAllownce Is: "+TravelAllowence);
	}
		@Override   // generate to String
		public String toString() {
			return "Manager [employeeId=" + employeeId + ", employeePhno=" + employeePhno + ", employeeName="
					+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
					+ ", specialAllowance=" + specialAllowance + ", Hra=" + Hra + "]";
		}
}
class Trainee extends Employee // sub class2 extends super class(hierarchical inheritance)
{
			public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhno,double basicSalary)
			{
				super(employeeId, employeeName, employeeAddress,employeePhno,basicSalary);  // constructor chaining
				super.calculateTravelAllowence();
			}
			@Override       // generate to String
			public String toString() {
				return "Trainee [employeeId=" + employeeId + ", employeePhno=" + employeePhno + ", employeeName="
						+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
						+ ", specialAllowance=" + specialAllowance + ", Hra=" + Hra + "]";
			}
}
public class Project
{

	public static void main(String[] args)  // main method 
		{
			//instance class object for Manager
			Manager ref=new Manager(289670,"SOUMYA","CHINSURAH",8972700849L,17500);
			System.out.println(ref);
			ref.calculateSalary();
			ref.calculateTravelAllowence();
			
			//instance class object for Trainee
			Trainee ref2=new Trainee(289654, "IMROZ","KOLKATA",1234567890L,6000);
			System.out.println(ref2);
			ref2.calculateSalary();
			ref2.calculateTravelAllowence();	
		}
}