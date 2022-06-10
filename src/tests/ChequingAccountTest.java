package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Account;
import classes.AccountFactory;
import classes.ChequingAccount;
import classes.Client;

public class ChequingAccountTest {

	@Test
	public void testDelete() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Chequing Account", client);
		
		account.delete();
		assertEquals(null, account.getAccountProxy());
	}

	@Test
	public void testChequingAccount() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Chequing Account", client);
		
		assertEquals(true, account instanceof ChequingAccount);
	}

}
