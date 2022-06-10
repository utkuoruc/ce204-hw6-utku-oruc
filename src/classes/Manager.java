package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 76 "banking.ump"
public class Manager extends Employee
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Manager Associations
  private List<Employee> employees;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Manager(String aName, String aAddress, String aPhoneNumber, int aEmployeeID, Division aDivision)
  {
    super(aName, aAddress, aPhoneNumber, aEmployeeID, aDivision);
    employees = new ArrayList<Employee>();
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEmployees()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addEmployee(Employee aEmployee)
  {
    boolean wasAdded = false;
    if (employees.contains(aEmployee)) { return false; }
    Manager existingManager = aEmployee.getManager();
    if (existingManager == null)
    {
      aEmployee.setManager(this);
    }
    else if (!this.equals(existingManager))
    {
      existingManager.removeEmployee(aEmployee);
      addEmployee(aEmployee);
    }
    else
    {
      employees.add(aEmployee);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEmployee(Employee aEmployee)
  {
    boolean wasRemoved = false;
    if (employees.contains(aEmployee))
    {
      employees.remove(aEmployee);
      aEmployee.setManager(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public void delete()
  {
    while( !employees.isEmpty() )
    {
      employees.get(0).setManager(null);
    }
    super.delete();
  }

}