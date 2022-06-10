package tests;

import static org.junit.Assert.*;

import java.net.CookieManager;

import org.junit.Test;

import classes.*;

public class ManagerTest {

	@Test
	public void testDelete() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		manager.delete();
		
		assertEquals(null, manager.getManager());
	}

	@Test
	public void testManager() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		
		assertEquals(true, manager != null);
	
	}

	@Test
	public void testGetEmployee() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(employee1, manager.getEmployee(0));
	}

	@Test
	public void testGetEmployees() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(3, manager.getEmployees().size());
	}

	@Test
	public void testNumberOfEmployees() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(3, manager.numberOfEmployees());
	}

	@Test
	public void testHasEmployees() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(true, manager.hasEmployees());
	}

	@Test
	public void testIndexOfEmployee() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(0, manager.indexOfEmployee(employee1));
	}

	@Test
	public void testMinimumNumberOfEmployees() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(0, manager.minimumNumberOfEmployees());
	}

	@Test
	public void testAddEmployee() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		
		assertEquals(employee1, manager.getEmployee(0));
	}

	@Test
	public void testRemoveEmployee() {
		Division division = new Division();
		Manager manager = new Manager("name","address","05510615333",11234,division);
		Employee employee1 = new Employee("ahmet", "duyar sokak", "444 4 444", 233, division);
		Employee employee2 = new Employee("ahmet", "duyar sokak", "444 4 445", 234, division);
		Employee employee3 = new Employee("ahmet", "duyar sokak", "444 4 445", 235, division);
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);
		manager.addEmployee(employee3);
		
		
		manager.removeEmployee(employee1);
		assertEquals(true, manager.getEmployee(0) != employee1);
	}

}
