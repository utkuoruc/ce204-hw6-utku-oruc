package classes;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

public class AccountFactory {
	
	public Account accountCreater(String accountType, Client... clients) {
		AccountProxy accountProxy = new AccountProxy(clients);
		Branch branch = new Branch(accountProxy.getClient(0).getAddress(), accountProxy.getClient(0).getPhoneNumber());
		
		if(accountType == "Credit Card Account") {
			  return new CreditCardAccount(1, 0, 0, 0, 0, "", "", "", branch, accountProxy, "");
		}
		else if(accountType == "Mortgage Account") {
			  return new MortgageAccount(1, 0, 0, 0, 0, "", "", "", branch, accountProxy);
		}
		else if(accountType == "Chequing Account") {
			  return new ChequingAccount(1, 0, 0, 0, 0, "", "", "", branch, accountProxy);
		}
		else throw new RuntimeException("Wrong account type specification");
	}
}
