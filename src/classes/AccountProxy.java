package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 81 "banking.ump"
public class AccountProxy
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AccountProxy Associations
  private List<Client> clients;
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AccountProxy(Client... allClients)
  {
    clients = new ArrayList<Client>();
    boolean didAddClients = setClients(allClients);
    if (!didAddClients)
    {
      throw new RuntimeException("Unable to create AccountProxy, must have 1 to 2 clients. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }
  
  
  //------------------------
  // client doing client things
  //------------------------
  public double addBalance(double money){
	  account.setBalance(account.getBalance() + money);
	  return account.getBalance();
  }
  /* gets money from the account, account balance decreases */
  public Boolean withdrawBalance(double money) {
	  return account.setBalance(account.getBalance() - money);
  }
  public double getBalance() {
	  return account.getBalance();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Client getClient(int index)
  {
    Client aClient = clients.get(index);
    return aClient;
  }

  public List<Client> getClients()
  {
    List<Client> newClients = Collections.unmodifiableList(clients);
    return newClients;
  }

  public int numberOfClients()
  {
    int number = clients.size();
    return number;
  }

  public boolean hasClients()
  {
    boolean has = clients.size() > 0;
    return has;
  }

  public int indexOfClient(Client aClient)
  {
    int index = clients.indexOf(aClient);
    return index;
  }
  /* Code from template association_GetOne */
  public Account getAccount()
  {
    return account;
  }

  public boolean hasAccount()
  {
    boolean has = account != null;
    return has;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfClientsValid()
  {
    boolean isValid = numberOfClients() >= minimumNumberOfClients() && numberOfClients() <= maximumNumberOfClients();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClients()
  {
    return 1;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfClients()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addClient(Client aClient)
  {
    boolean wasAdded = false;
    if (clients.contains(aClient)) { return false; }
    if (numberOfClients() >= maximumNumberOfClients())
    {
      return wasAdded;
    }

    clients.add(aClient);
    if (aClient.indexOfAccountProxy(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aClient.addAccountProxy(this);
      if (!wasAdded)
      {
        clients.remove(aClient);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeClient(Client aClient)
  {
    boolean wasRemoved = false;
    if (!clients.contains(aClient))
    {
      return wasRemoved;
    }

    if (numberOfClients() <= minimumNumberOfClients())
    {
      return wasRemoved;
    }

    int oldIndex = clients.indexOf(aClient);
    clients.remove(oldIndex);
    if (aClient.indexOfAccountProxy(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aClient.removeAccountProxy(this);
      if (!wasRemoved)
      {
        clients.add(oldIndex,aClient);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setClients(Client... newClients)
  {
    boolean wasSet = false;
    ArrayList<Client> verifiedClients = new ArrayList<Client>();
    for (Client aClient : newClients)
    {
      if (verifiedClients.contains(aClient))
      {
        continue;
      }
      verifiedClients.add(aClient);
    }

    if (verifiedClients.size() != newClients.length || verifiedClients.size() < minimumNumberOfClients() || verifiedClients.size() > maximumNumberOfClients())
    {
      return wasSet;
    }

    ArrayList<Client> oldClients = new ArrayList<Client>(clients);
    clients.clear();
    for (Client aNewClient : verifiedClients)
    {
      clients.add(aNewClient);
      if (oldClients.contains(aNewClient))
      {
        oldClients.remove(aNewClient);
      }
      else
      {
        aNewClient.addAccountProxy(this);
      }
    }

    for (Client anOldClient : oldClients)
    {
      anOldClient.removeAccountProxy(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setAccount(Account aNewAccount)
  {
    boolean wasSet = false;
    if (account != null && !account.equals(aNewAccount) && equals(account.getAccountProxy()))
    {
      //Unable to setAccount, as existing account would become an orphan
      return wasSet;
    }

    account = aNewAccount;
    AccountProxy anOldAccountProxy = aNewAccount != null ? aNewAccount.getAccountProxy() : null;

    if (!this.equals(anOldAccountProxy))
    {
      if (anOldAccountProxy != null)
      {
        anOldAccountProxy.account = null;
      }
      if (account != null)
      {
        account.setAccountProxy(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Client> copyOfClients = new ArrayList<Client>(clients);
    clients.clear();
    for(Client aClient : copyOfClients)
    {
      aClient.removeAccountProxy(this);
    }
    Account existingAccount = account;
    account = null;
    if (existingAccount != null)
    {
      existingAccount.delete();
    }
  }

}