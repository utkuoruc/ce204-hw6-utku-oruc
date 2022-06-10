package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 1 "banking.ump"
public abstract class Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private String name;
  private String address;
  private String phoneNumber;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Person(String aName, String aAddress, String aPhoneNumber)
  {
    name = aName;
    address = aAddress;
    phoneNumber = aPhoneNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void delete()
  {}
}