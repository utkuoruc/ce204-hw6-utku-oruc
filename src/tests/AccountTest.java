package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import classes.*;

public class AccountTest {

	@Test
	public void testAccount() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		assertEquals(true, account != null);
	}

	@Test
	public void testSetAccountNumber() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setAccountNumber(1);
		
		assertEquals(1, account.getAccountNumber());
	}

	@Test
	public void testSetBalance() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).addBalance(200);
		
		assertEquals(200, account.getBalance(), 0);
	}

	@Test
	public void testSetCreditLimit() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setCreditLimit(2000);
		
		assertEquals(2000, account.getCreditLimit(), 0);
	}

	@Test
	public void testSetInterestRate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setInterestRate(20);
		
		assertEquals(20, account.getInterestRate(), 0);
	}

	@Test
	public void testSetMonthlyFee() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setMonthlyFee(20);
		
		assertEquals(20, account.getMonthlyFee(), 0);
	}

	@Test
	public void testSetPrivileges() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setPrivileges("Unlimited cash acocunt secret one");
		
		assertEquals("Unlimited cash acocunt secret one", account.getPrivileges());
	}

	@Test
	public void testSetOpenDate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setOpenDate("7/7/2022");
		
		assertEquals("7/7/2022", account.getOpenDate());
	}

	@Test
	public void testSetClosedDate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setClosedDate("7/7/2022");
		
		assertEquals("7/7/2022", account.getClosedDate());
	}

	@Test
	public void testGetAccountNumber() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setAccountNumber(1);
		
		assertEquals(1, account.getAccountNumber());
	}

	@Test
	public void testGetBalance() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).addBalance(200);
		
		assertEquals(200, account.getBalance(), 0);
	}

	@Test
	public void testGetCreditLimit() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setCreditLimit(2000);
		
		assertEquals(2000, account.getCreditLimit(), 0);
	}

	@Test
	public void testGetInterestRate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setInterestRate(20);
		
		assertEquals(20, account.getInterestRate(), 0);
	}

	@Test
	public void testGetMonthlyFee() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setMonthlyFee(20);
		
		assertEquals(20, account.getMonthlyFee(), 0);
	}

	@Test
	public void testGetPrivileges() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setPrivileges("Unlimited cash acocunt secret one");
		
		assertEquals("Unlimited cash acocunt secret one", account.getPrivileges());
	}

	@Test
	public void testGetOpenDate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setOpenDate("7/7/2022");
		
		assertEquals("7/7/2022", account.getOpenDate());
	}

	@Test
	public void testGetClosedDate() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().setClosedDate("7/7/2022");
		
		assertEquals("7/7/2022", account.getClosedDate());
	}

	@Test
	public void testGetBranch() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().getBranch();
		
		assertEquals(true, client.getAccountProxy(0).getAccount().getBranch() != null);
	}

	@Test
	public void testGetAccountProxy() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		client.getAccountProxy(0).getAccount().getAccountProxy();
		
		assertEquals(true, client.getAccountProxy(0).getAccount().getAccountProxy() != null);
	}

	@Test
	public void testSetBranch() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Branch branch = new Branch("address somewhere", "122323");
		client.getAccountProxy(0).getAccount().setBranch(branch);
		
		assertEquals(branch, client.getAccountProxy(0).getAccount().getBranch());
	}

	@Test
	public void testSetAccountProxy() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Branch branch = new Branch("address somewhere", "122323");
		client.getAccountProxy(0).getAccount().setBranch(branch);
		
		assertEquals(true, client.getAccountProxy(0).getAccount().getAccountProxy() != null);
	}

	@Test
	public void testDelete() {
		Client client = new Client("utku", "address", "05444767474");
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Branch branch = new Branch("address somewhere", "122323");
		client.getAccountProxy(0).getAccount().setBranch(branch);
		
		account.delete();
		assertEquals(null, client.getAccountProxy(0).getAccount());
	}

}
