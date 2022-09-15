package com.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
@TestMethodOrder(value = OrderAnnotation.class)
class EmployeeServiceTest {

	EmployeeService employeeService;
	static ArrayList<Employee> emplist;
	@BeforeAll
	static void init()
	{
		emplist=new ArrayList<Employee>();
	}
	@BeforeEach
	void setUp() throws Exception {
		employeeService =new EmployeeService();
	}

	@AfterEach
	void tearDown() throws Exception {
		employeeService =null;
		System.out.println("object is garbage collected");
	}

	@Test
	@DisplayName("testing add Employee method")
	@Order (1)
	public void testAddEmployee() {
		// way 1 
		//employeeService.addEmployee(101, "SOUMYA", 25000, "HOOGHLY", "INDIA");
	   //employeeService.addEmployee(101, "BARNALI", 20000, "HARIT", "INDIA");
		//assertEquals(2,employeeService.lengthOfList());
		// way 2 using builder
		Address add=Address.builder().city("HOOGHLY").country("INDIA").build();
		Employee emp=Employee.builder().empId(101).empName("SOUMYA").empSal(25000).
				address(add).build();
		employeeService.addEmp(emp);
		int length=employeeService.lengthOfList();
		assertThat(length>0).isTrue();
	}
	@Test
	@DisplayName("testing Display Employee By Id")
	@Order(2)
public void testDisplayEmpById() throws GlobalException
{
	Address add=Address.builder().city("HOOGHLY").country("INDIA").build();
	Employee emp=Employee.builder().empId(101).empName("SOUMYA").empSal(25000).
			address(add).build();
	employeeService.addEmp(emp);
	Employee e= employeeService.displayEmpById(101);
	// assertEquals("BARNALI",e.getEmpName());
	assertThat(e.getEmpSal()).isEqualTo(25000.00);
}
	@Test
	@DisplayName("test case for calculate appraisal")
	@Order(3)
	public void testCalculateAppraisalById()
	{
		employeeService.addEmployee(101,"SOUMYA", 25000,"HOOGHLY", "INDIA");
		double appraisal=employeeService.calculateAppraisalById(101);
		// assertEquals(2000,appraisal);
		assertThat(appraisal).isEqualTo(2000);
	}
	@Test
	@DisplayName("test case for calculate yearly salary")
	@Order(4)
	public void testCalculateYearlySalary()
	{
		employeeService.addEmployee(101,"SOUMYA", 25000,"HOOGHLY", "INDIA");
		double yearlysalary=employeeService.calculateYearlySalary(101);
		// assertEquals(300000,yearlysalary);
		assertThat(yearlysalary).isEqualTo(300000);
	}
	@Test
	@DisplayName("test case for update employees")
	@Order(5)
	public void testUpdateEmp() throws GlobalException
	{
		employeeService.addEmployee(101,"SOUMYA", 25000,"HOOGHLY", "INDIA");
		Employee emp=employeeService.findId(101);
		emp.setEmpName("SOU");
		Employee updateEmp=employeeService.updateEmployee(0,emp);
		//assertEquals("SOU",updateEmp.getEmpName());
		assertThat(updateEmp.getEmpName()).isEqualTo("SOU");
	}
	@Test
	@DisplayName("test case for delete employees")
	@Order(6)
	public void testDeleteAllEmployee()
	{
		// String msg=employeeService.deleteAllEmployee();
		assertEquals("All employees deleted Successfully",employeeService.deleteAllEmployee());
	}
	
}
