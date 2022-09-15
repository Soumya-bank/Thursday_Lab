package com.ems.service;

import java.util.ArrayList;

import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

public class EmployeeService {
 private static ArrayList<Employee> employee=new ArrayList<Employee>();
	 // method to add employee details in array list
 public void addEmployee(long empId,String name,double sal,String city,String country)
 {
	 Address add=new Address(city,country);
	 employee.add(new Employee(empId,name,sal,add));
 }
 // for testing using builder annotation
 public void addEmp(Employee emp)
 {
	 employee.add(emp);
 }
 // method to display all employee details
 public void displayAllEmployee()
 {
	 for(Employee emp:employee)
	 {
		 System.out.println("Employee Id : "+emp.getEmpId());
		 System.out.println("Employee Name : "+emp.getEmpName());
		 System.out.println("Employee Salary : "+emp.getEmpSal());
		 System.out.println("Employee Address : "+emp.getAddress().getCity()
				 +" "+emp.getAddress().getCountry());
	 }
 }
//method to display all employee details by Id
 public Employee displayEmpById(int id) throws GlobalException
 {
	for(int i=0;i<employee.size();i++)
	{
	if(employee.get(i).getEmpId()==id)
	{
		 return employee.get(i);
	}
	else
	{
		throw new GlobalException("Employee id not found");
	}
	}
	return null;
	} // end the method
//method to delete all employee details
	public String deleteAllEmployee()
	{
		employee.clear();
		return "All employees deleted Successfully";
	}
 //method to calculate the yearly salary of employee
	public double calculateYearlySalary(long id)
	{
		double yearlySalary=0.0;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				yearlySalary=employee.get(i).getEmpSal()*12;
			}
		}
		return yearlySalary;
	}
	 //method to calculate the appraisal amount of employee
	public double calculateAppraisalById(long empId)
	{
		double appraisal=0.0;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==empId)
			{
				if(employee.get(i).getEmpSal()<10000)
					appraisal=1000;
				else
				{
					appraisal=2000;
				}
			}
		}
		return appraisal;
	}
	// method to find Employee Id
	public Employee findId(int id)
	{
		Employee emp=null;
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				emp=employee.get(i);
			}
	}
		return emp;
	}
	// method to Update Employee
	public Employee updateEmployee(int index,Employee emp) throws GlobalException
	{
		return employee.set(index, emp);
	}
	// Employee list
	public int lengthOfList()
	{
		return employee.size();
	}
}

