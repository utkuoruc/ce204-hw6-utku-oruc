package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import classes.*;

public class CreditCardTest {

	@Test
	public void testCreditCard() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		assertEquals(true, card != null);
	}

	@Test
	public void testSetOpenForInternet() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setOpenForInternet(false);
		assertEquals(false, card.isOpenForInternet());
	}

	@Test
	public void testSetCardNumber() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setCardNumber(2);
		assertEquals(2, card.getCardNumber());
	}

	@Test
	public void testGetOpenForInternet() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setOpenForInternet(false);
		assertEquals(false, card.isOpenForInternet());
	}

	@Test
	public void testGetCardNumber() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setCardNumber(2);
		assertEquals(2, card.getCardNumber());
	}

	@Test
	public void testIsOpenForInternet() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setOpenForInternet(false);
		assertEquals(false, card.isOpenForInternet());
	}

	@Test
	public void testGetCreditCardAccount() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		assertEquals(account, card.getCreditCardAccount());
	}

	@Test
	public void testSetCreditCardAccount() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Account account2 = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.setCreditCardAccount((CreditCardAccount) account2);
		assertEquals(account, card.getCreditCardAccount());
	}

	@Test
	public void testDelete() {
		AccountFactory accountFactory = new AccountFactory();
		Client client = new Client("utku", "duyar sokak", "05510615333");
		Account account = accountFactory.accountCreater("Credit Card Account", client);
		Account account2 = accountFactory.accountCreater("Credit Card Account", client);
		CreditCard card = new CreditCard(true, 1, (CreditCardAccount) account);
		
		card.delete();
		assertEquals(null, card.getCreditCardAccount());
	}

}
