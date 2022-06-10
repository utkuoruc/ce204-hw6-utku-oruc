package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 65 "banking.ump"
public class CreditCard
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CreditCard Attributes
  private boolean openForInternet;
  private int cardNumber;

  //CreditCard Associations
  private CreditCardAccount creditCardAccount;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CreditCard(boolean aOpenForInternet, int aCardNumber, CreditCardAccount aCreditCardAccount)
  {
    openForInternet = aOpenForInternet;
    cardNumber = aCardNumber;
    boolean didAddCreditCardAccount = setCreditCardAccount(aCreditCardAccount);
    if (!didAddCreditCardAccount)
    {
      throw new RuntimeException("Unable to create creditCard due to creditCardAccount. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOpenForInternet(boolean aOpenForInternet)
  {
    boolean wasSet = false;
    openForInternet = aOpenForInternet;
    wasSet = true;
    return wasSet;
  }

  public boolean setCardNumber(int aCardNumber)
  {
    boolean wasSet = false;
    cardNumber = aCardNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean getOpenForInternet()
  {
    return openForInternet;
  }

  public int getCardNumber()
  {
    return cardNumber;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOpenForInternet()
  {
    return openForInternet;
  }
  /* Code from template association_GetOne */
  public CreditCardAccount getCreditCardAccount()
  {
    return creditCardAccount;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setCreditCardAccount(CreditCardAccount aCreditCardAccount)
  {
    boolean wasSet = false;
    //Must provide creditCardAccount to creditCard
    if (aCreditCardAccount == null)
    {
      return wasSet;
    }

    if (creditCardAccount != null && creditCardAccount.numberOfCreditCards() <= CreditCardAccount.minimumNumberOfCreditCards())
    {
      return wasSet;
    }

    CreditCardAccount existingCreditCardAccount = creditCardAccount;
    creditCardAccount = aCreditCardAccount;
    if (existingCreditCardAccount != null && !existingCreditCardAccount.equals(aCreditCardAccount))
    {
      boolean didRemove = existingCreditCardAccount.removeCreditCard(this);
      if (!didRemove)
      {
        creditCardAccount = existingCreditCardAccount;
        return wasSet;
      }
    }
    creditCardAccount.addCreditCard(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    CreditCardAccount placeholderCreditCardAccount = creditCardAccount;
    this.creditCardAccount = null;
    if(placeholderCreditCardAccount != null)
    {
      placeholderCreditCardAccount.removeCreditCard(this);
    }
  }
}