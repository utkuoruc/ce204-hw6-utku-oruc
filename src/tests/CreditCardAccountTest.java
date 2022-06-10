package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class CreditCardAccountTest {

	@Test
	public void testDelete() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		client.getAccountProxy(0).getAccount().delete();
		assertEquals(null, client.getAccountProxy(0).getAccount());
	}

	@Test
	public void testCreditCardAccount() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		assertEquals(true, client.getAccountProxy(0).getAccount() instanceof CreditCardAccount && client.getAccountProxy(0).getAccount() != null);
	}

	@Test
	public void testSetExpireDate() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
			
		((CreditCardAccount) account).setExpireDate("1/1/2023");
		
		
		assertEquals("1/1/2023", ((CreditCardAccount) account).getExpireDate());
	}

	@Test
	public void testGetExpireDate() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
			
		((CreditCardAccount) account).setExpireDate("1/1/2023");
		
		
		assertEquals("1/1/2023", ((CreditCardAccount) account).getExpireDate());
	}

	@Test
	public void testGetCreditCard() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(card, ((CreditCardAccount) account).getCreditCard(0));
	}

	@Test
	public void testGetCreditCards() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(1, ((CreditCardAccount) account).getCreditCards().size());
	}

	@Test
	public void testNumberOfCreditCards() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(1, ((CreditCardAccount) account).numberOfCreditCards());
	}

	@Test
	public void testHasCreditCards() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(true, ((CreditCardAccount) account).hasCreditCards());
	}

	@Test
	public void testIndexOfCreditCard() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(0, ((CreditCardAccount) account).indexOfCreditCard(card));
	}

	@Test
	public void testIsNumberOfCreditCardsValid() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(true, ((CreditCardAccount) account).isNumberOfCreditCardsValid());
	}

	@Test
	public void testMinimumNumberOfCreditCards() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(1, ((CreditCardAccount) account).minimumNumberOfCreditCards());
	}

	@Test
	public void testAddCreditCardBooleanInt() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		((CreditCardAccount) account).addCreditCard(true, 101);
		
		assertEquals(1, ((CreditCardAccount) account).numberOfCreditCards());
	}

	@Test
	public void testAddCreditCardCreditCard() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		
		assertEquals(1, ((CreditCardAccount) account).numberOfCreditCards());
	}

	@Test
	public void testRemoveCreditCard() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		
		CreditCard card = new CreditCard(true, 101, ((CreditCardAccount) account));
		CreditCard card2 = new CreditCard(true, 101, ((CreditCardAccount) account));
		CreditCard card3 = new CreditCard(true, 101, ((CreditCardAccount) account));
		((CreditCardAccount) account).addCreditCard(card);
		((CreditCardAccount) account).addCreditCard(card2);
		((CreditCardAccount) account).addCreditCard(card3);
		((CreditCardAccount) account).removeCreditCard(card3);
		
		assertEquals(3, ((CreditCardAccount) account).numberOfCreditCards());
	}

}
