package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 17 "banking.ump"
public class Client extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Client Associations
  private List<Employee> employees;
  private List<AccountProxy> accountProxies;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Client(String aName, String aAddress, String aPhoneNumber)
  {
    super(aName, aAddress, aPhoneNumber);
    employees = new ArrayList<Employee>();
    accountProxies = new ArrayList<AccountProxy>();
  }
  
  //------------------------
  // client doing client things
  //------------------------
  public String addBalance(int accountProxyID, double amount) {
	  getAccountProxy(accountProxyID).addBalance(amount);
	  return "Success. New Balance: " + getAccountProxy(accountProxyID).getBalance();
  }
  /* gets money from the account, account balance decreases */
  public String withdrawBalance(int accountProxyID, double amount) {
	  if(getAccountProxy(accountProxyID).withdrawBalance(amount)) {
		  return "Success. New Balance: " + getAccountProxy(accountProxyID).getBalance();
	  }
	  else {
		  return "Can't withdraw. Try not to be poor. Your balance is: " + getAccountProxy(accountProxyID).getBalance();
	  }
  }
  public String viewBalance(int accountProxyID) {
	  return "Balance: " + getAccountProxy(accountProxyID).getBalance();
  }
  
  
  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Employee getEmployee(int index)
  {
    Employee aEmployee = employees.get(index);
    return aEmployee;
  }

  public List<Employee> getEmployees()
  {
    List<Employee> newEmployees = Collections.unmodifiableList(employees);
    return newEmployees;
  }

  public int numberOfEmployees()
  {
    int number = employees.size();
    return number;
  }

  public boolean hasEmployees()
  {
    boolean has = employees.size() > 0;
    return has;
  }

  public int indexOfEmployee(Employee aEmployee)
  {
    int index = employees.indexOf(aEmployee);
    return index;
  }
  /* Code from template association_GetMany */
  public AccountProxy getAccountProxy(int index)
  {
    AccountProxy aAccountProxy = accountProxies.get(index);
    return aAccountProxy;
  }

  public List<AccountProxy> getAccountProxies()
  {
    List<AccountProxy> newAccountProxies = Collections.unmodifiableList(accountProxies);
    return newAccountProxies;
  }

  public int numberOfAccountProxies()
  {
    int number = accountProxies.size();
    return number;
  }

  public boolean hasAccountProxies()
  {
    boolean has = accountProxies.size() > 0;
    return has;
  }

  public int indexOfAccountProxy(AccountProxy aAccountProxy)
  {
    int index = accountProxies.indexOf(aAccountProxy);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEmployees()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEmployee(Employee aEmployee)
  {
    boolean wasAdded = false;
    if (employees.contains(aEmployee)) { return false; }
    employees.add(aEmployee);
    if (aEmployee.indexOfClient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEmployee.addClient(this);
      if (!wasAdded)
      {
        employees.remove(aEmployee);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEmployee(Employee aEmployee)
  {
    boolean wasRemoved = false;
    if (!employees.contains(aEmployee))
    {
      return wasRemoved;
    }

    int oldIndex = employees.indexOf(aEmployee);
    employees.remove(oldIndex);
    if (aEmployee.indexOfClient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEmployee.removeClient(this);
      if (!wasRemoved)
      {
        employees.add(oldIndex,aEmployee);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAccountProxies()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAccountProxy(AccountProxy aAccountProxy)
  {
    boolean wasAdded = false;
    if (accountProxies.contains(aAccountProxy)) { return false; }
    accountProxies.add(aAccountProxy);
    if (aAccountProxy.indexOfClient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAccountProxy.addClient(this);
      if (!wasAdded)
      {
        accountProxies.remove(aAccountProxy);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAccountProxy(AccountProxy aAccountProxy)
  {
    boolean wasRemoved = false;
    if (!accountProxies.contains(aAccountProxy))
    {
      return wasRemoved;
    }

    int oldIndex = accountProxies.indexOf(aAccountProxy);
    accountProxies.remove(oldIndex);
    if (aAccountProxy.indexOfClient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAccountProxy.removeClient(this);
      if (!wasRemoved)
      {
        accountProxies.add(oldIndex,aAccountProxy);
      }
    }
    return wasRemoved;
  }

  public void delete()
  {
    ArrayList<Employee> copyOfEmployees = new ArrayList<Employee>(employees);
    employees.clear();
    for(Employee aEmployee : copyOfEmployees)
    {
      aEmployee.removeClient(this);
    }
    ArrayList<AccountProxy> copyOfAccountProxies = new ArrayList<AccountProxy>(accountProxies);
    accountProxies.clear();
    for(AccountProxy aAccountProxy : copyOfAccountProxies)
    {
      if (aAccountProxy.numberOfClients() <= AccountProxy.minimumNumberOfClients())
      {
        aAccountProxy.delete();
      }
      else
      {
        aAccountProxy.removeClient(this);
      }
    }
    super.delete();
  }

}