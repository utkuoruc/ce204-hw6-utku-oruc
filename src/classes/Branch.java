package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 51 "banking.ump"
public class Branch extends Division
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Branch Attributes
  private String address;
  private String branchNumber;

  //Branch Associations
  private List<Account> accounts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Branch(String aAddress, String aBranchNumber)
  {
    super();
    address = aAddress;
    branchNumber = aBranchNumber;
    accounts = new ArrayList<Account>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setBranchNumber(String aBranchNumber)
  {
    boolean wasSet = false;
    branchNumber = aBranchNumber;
    wasSet = true;
    return wasSet;
  }

  public String getAddress()
  {
    return address;
  }

  public String getBranchNumber()
  {
    return branchNumber;
  }
  /* Code from template association_GetMany */
  public Account getAccount(int index)
  {
    Account aAccount = accounts.get(index);
    return aAccount;
  }

  public List<Account> getAccounts()
  {
    List<Account> newAccounts = Collections.unmodifiableList(accounts);
    return newAccounts;
  }

  public int numberOfAccounts()
  {
    int number = accounts.size();
    return number;
  }

  public boolean hasAccounts()
  {
    boolean has = accounts.size() > 0;
    return has;
  }

  public int indexOfAccount(Account aAccount)
  {
    int index = accounts.indexOf(aAccount);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAccounts()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */


  public boolean addAccount(Account aAccount)
  {
    boolean wasAdded = false;
    if (accounts.contains(aAccount)) { return false; }
    Branch existingBranch = aAccount.getBranch();
    boolean isNewBranch = existingBranch != null && !this.equals(existingBranch);
    if (isNewBranch)
    {
      aAccount.setBranch(this);
    }
    else
    {
      accounts.add(aAccount);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAccount(Account aAccount)
  {
    boolean wasRemoved = false;
    //Unable to remove aAccount, as it must always have a branch
    if (!this.equals(aAccount.getBranch()))
    {
      accounts.remove(aAccount);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public void delete()
  {
    for(int i=accounts.size(); i > 0; i--)
    {
      Account aAccount = accounts.get(i - 1);
      aAccount.delete();
    }
    super.delete();
  }
}