package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Branch;

import classes.*;

public class BranchTest {

	@Test
	public void testDelete() {
		Branch branch = new Branch("duyar sokak", "11243");
		branch.delete();
		assertEquals(0, branch.getAccounts().size());
	}

	@Test
	public void testBranch() {
		Branch branch = new Branch("duyar sokak", "11243");
		
		assertEquals(true, branch != null);
	}

	@Test
	public void testSetAddress() {
		Branch branch = new Branch("duyar sokak", "11243");
		branch.setAddress("islampasa");
		assertEquals("islampasa", branch.getAddress());
	}

	@Test
	public void testSetBranchNumber() {
		Branch branch = new Branch("duyar sokak", "11243");
		branch.setBranchNumber("15");
		assertEquals("15", branch.getBranchNumber());
	}

	@Test
	public void testGetAddress() {
		Branch branch = new Branch("duyar sokak", "11243");
		branch.setAddress("islampasa");
		assertEquals("islampasa", branch.getAddress());
	}

	@Test
	public void testGetBranchNumber() {
		Branch branch = new Branch("duyar sokak", "11243");
		branch.setBranchNumber("15");
		assertEquals("15", branch.getBranchNumber());
	}

	@Test
	public void testGetAccount() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(account, branch.getAccount(0));
	}

	@Test
	public void testGetAccounts() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(1, branch.getAccounts().size());
	}

	@Test
	public void testNumberOfAccounts() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(1, branch.numberOfAccounts());
	}

	@Test
	public void testHasAccounts() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(true, branch.hasAccounts());
	}

	@Test
	public void testIndexOfAccount() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(0, branch.indexOfAccount(account));
	}

	@Test
	public void testMinimumNumberOfAccounts() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(0, branch.minimumNumberOfAccounts());
	}

	@Test
	public void testAddAccount() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		assertEquals(account, branch.getAccount(0));
	}

	@Test
	public void testRemoveAccount() {
		Branch branch = new Branch("duyar sokak", "11243");
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		branch.addAccount(account);
		branch.removeAccount(account);
		assertEquals(account, branch.getAccount(0));
	}

}
