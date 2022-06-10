package classes;

import java.security.PublicKey;

public class Main {
	
	public static void main(String args[]) {
		
		Client client1 = new Client("utku", "duyar", "05510615333");
		
		
		AccountFactory accountFactory = new AccountFactory();
		
		Account account1 = accountFactory.accountCreater("Credit Card Account", client1);
		
		System.out.println(client1.addBalance(0, 200));
		System.out.println(client1.withdrawBalance(0, 200));
	}

}
