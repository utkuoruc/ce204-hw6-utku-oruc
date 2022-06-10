package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 72 "banking.ump"
public class Division
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Division Associations
  private List<Employee> employees;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Division()
  {
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
  /* Code from template association_AddManyToOne */
  public Employee addEmployee(String aName, String aAddress, String aPhoneNumber, int aEmployeeID)
  {
    return new Employee(aName, aAddress, aPhoneNumber, aEmployeeID, this);
  }

  public boolean addEmployee(Employee aEmployee)
  {
    boolean wasAdded = false;
    if (employees.contains(aEmployee)) { return false; }
    Division existingDivision = aEmployee.getDivision();
    boolean isNewDivision = existingDivision != null && !this.equals(existingDivision);
    if (isNewDivision)
    {
      aEmployee.setDivision(this);
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
    //Unable to remove aEmployee, as it must always have a division
    if (!this.equals(aEmployee.getDivision()))
    {
      employees.remove(aEmployee);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public void delete()
  {
    for(int i=employees.size(); i > 0; i--)
    {
      Employee aEmployee = employees.get(i - 1);
      aEmployee.delete();
    }
  }

}