package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class ClientTest {

	@Test
	public void testDelete() {
		Client client = new Client("utku","duyar sokak","05510615333");
		client.delete();
		assertEquals(true, client != null);
	}

	@Test
	public void testClient() {
		Client client = new Client("utku","duyar sokak","05510615333");
		
		assertEquals(true, client != null);
	}

	@Test
	public void testAddBalance() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.addBalance(0, 200);
		assertEquals("Balance: " + client.getAccountProxy(0).getBalance(), client.viewBalance(0));
	}

	@Test
	public void testWithdrawBalance() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.addBalance(0, 200);
		client.withdrawBalance(0, 50);
		assertEquals("Balance: " + client.getAccountProxy(0).getBalance(), client.viewBalance(0));
	}

	@Test
	public void testViewBalance() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.addBalance(0, 200);
		assertEquals("Balance: " + client.getAccountProxy(0).getBalance(), client.viewBalance(0));
	}

	@Test
	public void testGetEmployee() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(employee, client.getEmployee(0));
	}

	@Test
	public void testGetEmployees() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(1, client.getEmployees().size());
	}

	@Test
	public void testNumberOfEmployees() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(1, client.numberOfEmployees());
	}

	@Test
	public void testHasEmployees() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(true, client.hasEmployees());
	}

	@Test
	public void testIndexOfEmployee() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(0, client.indexOfEmployee(employee));
	}

	@Test
	public void testGetAccountProxy() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(true, client.getAccountProxy(0) != null);
	}

	@Test
	public void testGetAccountProxies() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(1, client.getAccountProxies().size());
	}

	@Test
	public void testNumberOfAccountProxies() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(1, client.numberOfAccountProxies());
	}

	@Test
	public void testHasAccountProxies() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(true, client.hasAccountProxies());
	}

	@Test
	public void testIndexOfAccountProxy() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(0, client.indexOfAccountProxy(client.getAccountProxy(0)));
	}

	@Test
	public void testMinimumNumberOfEmployees() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(0, client.minimumNumberOfEmployees());
	}

	@Test
	public void testAddEmployee() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(employee, client.getEmployee(0));
	}

	@Test
	public void testRemoveEmployee() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Account account2 = accountFactory.accountCreater("Credit Card Account", client);
		client.addAccountProxy(account2.getAccountProxy());
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.removeEmployee(employee);
		assertEquals(0, client.numberOfEmployees());
	}

	@Test
	public void testMinimumNumberOfAccountProxies() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.addBalance(0, 200);
		client.addEmployee(employee);
		assertEquals(0, client.minimumNumberOfEmployees());
	}

	@Test
	public void testAddAccountProxy() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Account account2 = accountFactory.accountCreater("Credit Card Account", client);
		client.addAccountProxy(account2.getAccountProxy());
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		assertEquals(2, client.numberOfAccountProxies());
	}

	@Test
	public void testRemoveAccountProxy() {
		Client client = new Client("utku","duyar sokak","05510615333");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Account account2 = accountFactory.accountCreater("Credit Card Account", client);
		client.addAccountProxy(account2.getAccountProxy());
		Division division = new Division();
		Employee employee = new Employee("ahmet", "duyar sokak", "05510615333", 0, division);
		client.removeAccountProxy(account2.getAccountProxy());
		assertEquals(2, client.numberOfAccountProxies());
	}

}
