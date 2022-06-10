package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class AccountFactoryTest {

	@Test
	public void testAccountCreater() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Chequing Account", client);
		
		assertEquals(true, client.getAccountProxy(0).getAccount() instanceof ChequingAccount);
		
		
	}

}
