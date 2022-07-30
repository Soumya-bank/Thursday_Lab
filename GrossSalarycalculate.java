/* Write a program to calculate gross salary of an employee.Basic salary should be take
 * from user. If basic salary in greater than 1500,HRA=500 DA=90% will be given else
 * HRA=500 and DA 70% given to the employee */

package codingjava;

import java.util.Scanner;

public class GrossSalarycalculate { // class 

	public static void main(String[] args) {          // main method
		double basic,hra,da,gross;             // variables
System.out.println("Enter the Basic Salary:");
Scanner sc=new Scanner(System.in);               // Scanner class ref. object
basic=sc.nextDouble();
if(basic>1500)             // loop
{
	hra=(basic*20/100);
	da=(basic*90/100);
}
else
{
	hra=500;
	da=(basic*70/100);
}
gross=(basic+hra+da);
{
	System.out.println(" The Gross Salary : "+gross);
}
	}

}
