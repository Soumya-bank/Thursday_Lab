/*
 * create class employee,declare variable empId,empName,basicSalary.,
 * designation declare methods setData() to set the employee information. 
 * create method getAppraisal() method to calculate the increment appraisal.
 * if any employee served minimum 1year,provide 10% increment. declare calculateTA() to calculate travel allowance. 
 * if that employee designation is manager then 3000 TA else 1000 TA will be provided.
 */
package oopsdemoprogram;
import java.util.Scanner;
 class EmployeeManual {
	
		int employeeid;
		String employeeName,designation;
		double employeeSalary;
		int employeeDOJ;
		public void setData(int id,String name,String design,double salary,int doj)
		{
			employeeid=id;
			employeeName=name;
			designation=design;
			employeeSalary=salary;
			employeeDOJ=doj;
		}
		public double getApprisal()
		{
			if(2022-employeeDOJ>1) {
			double Salary=employeeSalary+(employeeSalary*10/100F);
			return Salary;
			}
			else
			return employeeSalary;
		}
		public int TravelAllowance()
		{
			int ta=0;
			if(designation.equals("CEO")||designation.equals("CEO"))
				ta=3000;
			else
				ta=1000;
			return ta;
			
		}
		public void display()
		{
			System.out.println("Employee Id: "+employeeid);
			System.out.println("Employee Name: "+employeeName);
			System.out.println("Employee Designation: "+designation);
			System.out.println("Employee DOJ: "+employeeDOJ);
			double salary=getApprisal();
			System.out.println("Employee Salary: "+salary);
			int travel=TravelAllowance();
			System.out.println("Employee Travel: "+travel);
		}
}	
 public class EmployeeProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Employee Name: ");
		String name=sc.next();
		System.out.println("Enter the Employee Designation: ");
		String design=sc.next();
		System.out.println("Enter the Employee Salary: ");
		double salary=sc.nextDouble();
		System.out.println("Enter the DOJ: ");
		int joining=sc.nextInt();
		EmployeeManual employee=new EmployeeManual();
		employee.setData(id,name,design,salary,joining);
		employee.display();
	}
}