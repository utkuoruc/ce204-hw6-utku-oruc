package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class AccountProxyTest {

	@Test
	public void testAccountProxy() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		assertEquals(true,client.getAccountProxy(0) != null);
	}

	@Test
	public void testAddBalance() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(200,client.getAccountProxy(0).getBalance(),0);
	}

	@Test
	public void testWithdrawBalance() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		client.withdrawBalance(0, 200);
		assertEquals(0,client.getAccountProxy(0).getBalance(),0);
	}

	@Test
	public void testGetBalance() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(200,client.getAccountProxy(0).getBalance(),0);
	}

	@Test
	public void testGetClient() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(client,client.getAccountProxy(0).getClient(0));
	}

	@Test
	public void testGetClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(1,client.getAccountProxy(0).getClients().size());
	}

	@Test
	public void testNumberOfClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(1,client.getAccountProxy(0).numberOfClients());
	}

	@Test
	public void testHasClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(true,client.getAccountProxy(0).hasClients());
	}

	@Test
	public void testIndexOfClient() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(0,client.getAccountProxy(0).indexOfClient(client));
	}

	@Test
	public void testGetAccount() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(true,client.getAccountProxy(0).getAccount() instanceof Account);
	}

	@Test
	public void testHasAccount() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(true,client.getAccountProxy(0).hasAccount());
	}

	@Test
	public void testIsNumberOfClientsValid() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(true,client.getAccountProxy(0).isNumberOfClientsValid());
	}

	@Test
	public void testMinimumNumberOfClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(1,client.getAccountProxy(0).minimumNumberOfClients());
	}

	@Test
	public void testMaximumNumberOfClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.addBalance(0, 200);
		assertEquals(2,client.getAccountProxy(0).maximumNumberOfClients());
	}

	@Test
	public void testAddClient() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		Client client2 = new Client("crista ronaldo suwi", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.getAccountProxy(0).addClient(client2);
		assertEquals(client2,client.getAccountProxy(0).getClient(1));
	}

	@Test
	public void testRemoveClient() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		Client client2 = new Client("crista ronaldo suwi", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.getAccountProxy(0).addClient(client2);
		client.getAccountProxy(0).removeClient(client2);
		assertEquals(1,client.getAccountProxy(0).getClients().size());
	}

	@Test
	public void testSetClients() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		Client client2 = new Client("crista ronaldo suwi", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.getAccountProxy(0).addClient(client2);
		client.getAccountProxy(0).setClients(client,client2);
		assertEquals(2,client.getAccountProxy(0).getClients().size());
	}

	@Test
	public void testSetAccount() {
		AccountFactory accountFactory =  new AccountFactory();
		Client client = new Client("utku", "address", "05444767474");
		Client client2 = new Client("crista ronaldo suwi", "address", "05444767474");
		accountFactory.accountCreater("Credit Card Account", client);
		
		client.getAccountProxy(0).addClient(client2);
		client.getAccountProxy(0).setClients(client,client2);
		assertEquals(2,client.getAccountProxy(0).getClients().size());
	}

	@Test
	public void testDelete() {
		Client client = new Client("utku", "address", "05444767474");
		AccountProxy accountProxy = new AccountProxy(client);
		accountProxy.delete();
		assertEquals(false, accountProxy.hasClients());
	}

}
