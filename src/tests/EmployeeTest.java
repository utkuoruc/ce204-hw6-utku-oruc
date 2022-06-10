package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Client;
import classes.Division;
import classes.Employee;
import classes.Manager;

public class EmployeeTest {

	@Test
	public void testDelete() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		employee.delete();
		assertEquals(true, employee != null);
	}

	@Test
	public void testEmployee() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		
		assertEquals(true, employee != null);
	}

	@Test
	public void testSetEmployeeID() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		employee.setEmployeeID(53);
		
		assertEquals(53, employee.getEmployeeID());
	}

	@Test
	public void testGetEmployeeID() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		employee.setEmployeeID(53);
		
		assertEquals(53, employee.getEmployeeID());
	}

	@Test
	public void testGetDivision() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		assertEquals(division, employee.getDivision());
	}

	@Test
	public void testGetManager() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.setManager(manager);
		assertEquals(manager, employee.getManager());
	}

	@Test
	public void testHasManager() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.setManager(manager);
		assertEquals(true, employee.hasManager());
	}

	@Test
	public void testGetClient() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.addClient(client);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		assertEquals(client, employee.getClient(0));
	}

	@Test
	public void testGetClients() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client);
		assertEquals(1, employee.getClients().size());
	}

	@Test
	public void testNumberOfClients() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client);
		assertEquals(1, employee.numberOfClients());
	}

	@Test
	public void testHasClients() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client);
		assertEquals(true, employee.hasClients());
	}

	@Test
	public void testIndexOfClient() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client);
		assertEquals(0, employee.indexOfClient(client));
	}

	@Test
	public void testSetDivision() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		assertEquals(division, employee.getDivision());
	}

	@Test
	public void testSetManager() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.setManager(manager);
		assertEquals(manager, employee.getManager());
	}

	@Test
	public void testMinimumNumberOfClients() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.addClient(client);
		employee.setDivision(division);
		assertEquals(0, employee.indexOfClient(client));
	}

	@Test
	public void testAddClient() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		Client client2 = new Client("utku","duyar sokak","444 4 444");
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client);
		employee.addClient(client2);
		assertEquals(2, employee.numberOfClients());
	}

	@Test
	public void testRemoveClient() {
		Division division = new Division();
		
		Employee employee = new Employee("utku","duyar sokak","444 4 444", 22331,division);
		Manager manager = new Manager("utku","duyar sokak","444 4 444", 22, division);
		Client client = new Client("utku","duyar sokak","444 4 444");
		Client client2 = new Client("utku","duyar sokak","444 4 444");
		employee.addClient(client);
		employee.addClient(client2);
		employee.setEmployeeID(53);
		employee.setDivision(division);
		employee.addClient(client2);
		employee.removeClient(client2);
		assertEquals(1, employee.numberOfClients());
	}

}
