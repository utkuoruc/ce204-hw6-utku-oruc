package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class MortgageAccountTest {

	@Test
	public void testDelete() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Mortgage Account", client);
		
		account.delete();
		assertEquals(null, account.getAccountProxy());
	}

	@Test
	public void testMortgageAccount() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Mortgage Account", client);
		
		assertEquals(true, account instanceof MortgageAccount);
	}

}
