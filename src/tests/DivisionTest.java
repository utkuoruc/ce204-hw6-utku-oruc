package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class DivisionTest {

	@Test
	public void testDivision() {
		Division division = new Division();
		assertEquals(true, division != null);
	}

	@Test
	public void testGetEmployee() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(employee, division.getEmployee(0));
	}

	@Test
	public void testGetEmployees() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(1, division.getEmployees().size());
	}

	@Test
	public void testNumberOfEmployees() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(1, division.numberOfEmployees());
	}

	@Test
	public void testHasEmployees() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(true, division.hasEmployees());
	}

	@Test
	public void testIndexOfEmployee() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(0, division.indexOfEmployee(employee));
	}

	@Test
	public void testMinimumNumberOfEmployees() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		
		assertEquals(0, division.minimumNumberOfEmployees());
	}

	@Test
	public void testAddEmployeeStringStringStringInt() {
		Division division = new Division();
		
		division.addEmployee("utku","duyar sokak","444 4 444", 22331);
		assertEquals(true, division.hasEmployees());
	}

	@Test
	public void testAddEmployeeEmployee() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		division.addEmployee(employee);
		assertEquals(1, division.numberOfEmployees());
	}

	@Test
	public void testRemoveEmployee() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Employee employee2 = new Employee("utku","duyar sokak","444 4 444", 22332,division);
		Employee employee3 = new Employee("utku","duyar sokak","444 4 444", 22333,division);
		
		division.addEmployee(employee);
		
		division.removeEmployee(employee);
		
		assertEquals(false, division.getEmployee(0) != employee);
	}

	@Test
	public void testDelete() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);

		
		division.delete();
		assertEquals(null, employee.getDivision());
	}

}
