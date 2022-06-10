package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 9 "banking.ump"
public class Employee extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Employee Attributes
  private int employeeID;

  //Employee Associations
  private Division division;
  private Manager manager;
  private List<Client> clients;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Employee(String aName, String aAddress, String aPhoneNumber, int aEmployeeID, Division aDivision)
  {
    super(aName, aAddress, aPhoneNumber);
    employeeID = aEmployeeID;
    boolean didAddDivision = setDivision(aDivision);
    if (!didAddDivision)
    {
      throw new RuntimeException("Unable to create employee due to division. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    clients = new ArrayList<Client>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEmployeeID(int aEmployeeID)
  {
    boolean wasSet = false;
    employeeID = aEmployeeID;
    wasSet = true;
    return wasSet;
  }

  public int getEmployeeID()
  {
    return employeeID;
  }
  /* Code from template association_GetOne */
  public Division getDivision()
  {
    return division;
  }
  /* Code from template association_GetOne */
  public Manager getManager()
  {
    return manager;
  }

  public boolean hasManager()
  {
    boolean has = manager != null;
    return has;
  }
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
  /* Code from template association_SetOneToMany */
  public boolean setDivision(Division aDivision)
  {
    boolean wasSet = false;
    if (aDivision == null)
    {
      return wasSet;
    }

    Division existingDivision = division;
    division = aDivision;
    if (existingDivision != null && !existingDivision.equals(aDivision))
    {
      existingDivision.removeEmployee(this);
    }
    division.addEmployee(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setManager(Manager aManager)
  {
    boolean wasSet = false;
    Manager existingManager = manager;
    manager = aManager;
    if (existingManager != null && !existingManager.equals(aManager))
    {
      existingManager.removeEmployee(this);
    }
    if (aManager != null)
    {
      aManager.addEmployee(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClients()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addClient(Client aClient)
  {
    boolean wasAdded = false;
    if (clients.contains(aClient)) { return false; }
    clients.add(aClient);
    if (aClient.indexOfEmployee(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aClient.addEmployee(this);
      if (!wasAdded)
      {
        clients.remove(aClient);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeClient(Client aClient)
  {
    boolean wasRemoved = false;
    if (!clients.contains(aClient))
    {
      return wasRemoved;
    }

    int oldIndex = clients.indexOf(aClient);
    clients.remove(oldIndex);
    if (aClient.indexOfEmployee(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aClient.removeEmployee(this);
      if (!wasRemoved)
      {
        clients.add(oldIndex,aClient);
      }
    }
    return wasRemoved;
  }

  public void delete()
  {
    Division placeholderDivision = division;
    this.division = null;
    if(placeholderDivision != null)
    {
      placeholderDivision.removeEmployee(this);
    }
    if (manager != null)
    {
      Manager placeholderManager = manager;
      this.manager = null;
      placeholderManager.removeEmployee(this);
    }
    ArrayList<Client> copyOfClients = new ArrayList<Client>(clients);
    clients.clear();
    for(Client aClient : copyOfClients)
    {
      aClient.removeEmployee(this);
    }
    super.delete();
  }
}