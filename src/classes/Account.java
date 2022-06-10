package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 24 "banking.ump"
public abstract class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int accountNumber;
  private double  balance;
  private double  creditLimit;
  private double  interestRate;
  private double  monthlyFee;
  private String privileges;
  private String openDate;
  private String closedDate;

  //Account Associations
  private static Branch branch;
  private static AccountProxy accountProxy;
  private static Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  public Account(int aAccountNumber, double  aBalance, double  aCreditLimit, double  aInterestRate, double  aMonthlyFee, String aPrivileges, String aOpenDate, String aClosedDate, Branch aBranch, AccountProxy aAccountProxy)
  {
    accountNumber = aAccountNumber;
    balance = aBalance;
    creditLimit = aCreditLimit;
    interestRate = aInterestRate;
    monthlyFee = aMonthlyFee;
    privileges = aPrivileges;
    openDate = aOpenDate;
    closedDate = aClosedDate;
    boolean didAddBranch = setBranch(aBranch);
    if (!didAddBranch)
    {
      throw new RuntimeException("Unable to create account due to branch. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddAccountProxy = setAccountProxy(aAccountProxy);
    if (!didAddAccountProxy)
    {
      throw new RuntimeException("Unable to create account due to accountProxy. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccountNumber(int aAccountNumber)
  {
    boolean wasSet = false;
    accountNumber = aAccountNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setBalance(double aBalance)
  {
    boolean wasSet = false;
    if(aBalance >= 0) {
    	balance = aBalance;
        wasSet = true;
    }
    return wasSet;
  }

  public boolean setCreditLimit(double  aCreditLimit)
  {
    boolean wasSet = false;
    creditLimit = aCreditLimit;
    wasSet = true;
    return wasSet;
  }

  public boolean setInterestRate(double  aInterestRate)
  {
    boolean wasSet = false;
    interestRate = aInterestRate;
    wasSet = true;
    return wasSet;
  }

  public boolean setMonthlyFee(double  aMonthlyFee)
  {
    boolean wasSet = false;
    monthlyFee = aMonthlyFee;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrivileges(String aPrivileges)
  {
    boolean wasSet = false;
    privileges = aPrivileges;
    wasSet = true;
    return wasSet;
  }

  public boolean setOpenDate(String aOpenDate)
  {
    boolean wasSet = false;
    openDate = aOpenDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setClosedDate(String aClosedDate)
  {
    boolean wasSet = false;
    closedDate = aClosedDate;
    wasSet = true;
    return wasSet;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }

  public double  getBalance()
  {
    return balance;
  }

  public double  getCreditLimit()
  {
    return creditLimit;
  }

  public double  getInterestRate()
  {
    return interestRate;
  }

  public double  getMonthlyFee()
  {
    return monthlyFee;
  }

  public String getPrivileges()
  {
    return privileges;
  }

  public String getOpenDate()
  {
    return openDate;
  }

  public String getClosedDate()
  {
    return closedDate;
  }
  /* Code from template association_GetOne */
  public Branch getBranch()
  {
    return branch;
  }
  /* Code from template association_GetOne */
  public AccountProxy getAccountProxy()
  {
    return accountProxy;
  }
  /* Code from template association_SetOneToMany */
  public boolean setBranch(Branch aBranch)
  {
    boolean wasSet = false;
    if (aBranch == null)
    {
      return wasSet;
    }

    Branch existingBranch = branch;
    branch = aBranch;
    if (existingBranch != null && !existingBranch.equals(aBranch))
    {
      existingBranch.removeAccount(this);
    }
    branch.addAccount(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setAccountProxy(AccountProxy aNewAccountProxy)
  {
    boolean wasSet = false;
    if (aNewAccountProxy == null)
    {
      //Unable to setAccountProxy to null, as account must always be associated to a accountProxy
      return wasSet;
    }
    
    Account existingAccount = aNewAccountProxy.getAccount();
    if (existingAccount != null && !equals(existingAccount))
    {
      //Unable to setAccountProxy, the current accountProxy already has a account, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    AccountProxy anOldAccountProxy = accountProxy;
    accountProxy = aNewAccountProxy;
    accountProxy.setAccount(this);

    if (anOldAccountProxy != null)
    {
      anOldAccountProxy.setAccount(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Branch placeholderBranch = branch;
    this.branch = null;
    if(placeholderBranch != null)
    {
      placeholderBranch.removeAccount(this);
    }
    AccountProxy existingAccountProxy = accountProxy;
    accountProxy = null;
    if (existingAccountProxy != null)
    {
      existingAccountProxy.setAccount(null);
    }
  }
}