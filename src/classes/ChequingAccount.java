package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 59 "banking.ump"
public class ChequingAccount extends Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ChequingAccount(int aAccountNumber, float aBalance, float aCreditLimit, float aInterestRate, float aMonthlyFee, String aPrivileges, String aOpenDate, String aClosedDate, Branch aBranch, AccountProxy aAccountProxy)
  {
    super(aAccountNumber, aBalance, aCreditLimit, aInterestRate, aMonthlyFee, aPrivileges, aOpenDate, aClosedDate, aBranch, aAccountProxy);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}