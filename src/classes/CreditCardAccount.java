package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 38 "banking.ump"
public class CreditCardAccount extends Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CreditCardAccount Attributes
  private String expireDate;

  //CreditCardAccount Associations
  private List<CreditCard> creditCards;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CreditCardAccount(int aAccountNumber, float aBalance, float aCreditLimit, float aInterestRate, float aMonthlyFee, String aPrivileges, String aOpenDate, String aClosedDate, Branch aBranch, AccountProxy aAccountProxy, String aExpireDate)
  {
    super(aAccountNumber, aBalance, aCreditLimit, aInterestRate, aMonthlyFee, aPrivileges, aOpenDate, aClosedDate, aBranch, aAccountProxy);
    expireDate = aExpireDate;
    creditCards = new ArrayList<CreditCard>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setExpireDate(String aExpireDate)
  {
    boolean wasSet = false;
    expireDate = aExpireDate;
    wasSet = true;
    return wasSet;
  }

  public String getExpireDate()
  {
    return expireDate;
  }
  /* Code from template association_GetMany */
  public CreditCard getCreditCard(int index)
  {
    CreditCard aCreditCard = creditCards.get(index);
    return aCreditCard;
  }

  public List<CreditCard> getCreditCards()
  {
    List<CreditCard> newCreditCards = Collections.unmodifiableList(creditCards);
    return newCreditCards;
  }

  public int numberOfCreditCards()
  {
    int number = creditCards.size();
    return number;
  }

  public boolean hasCreditCards()
  {
    boolean has = creditCards.size() > 0;
    return has;
  }

  public int indexOfCreditCard(CreditCard aCreditCard)
  {
    int index = creditCards.indexOf(aCreditCard);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfCreditCardsValid()
  {
    boolean isValid = numberOfCreditCards() >= minimumNumberOfCreditCards();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCreditCards()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public CreditCard addCreditCard(boolean aOpenForInternet, int aCardNumber)
  {
    CreditCard aNewCreditCard = new CreditCard(aOpenForInternet, aCardNumber, this);
    return aNewCreditCard;
  }

  public boolean addCreditCard(CreditCard aCreditCard)
  {
    boolean wasAdded = false;
    if (creditCards.contains(aCreditCard)) { return false; }
    CreditCardAccount existingCreditCardAccount = aCreditCard.getCreditCardAccount();
    boolean isNewCreditCardAccount = existingCreditCardAccount != null && !this.equals(existingCreditCardAccount);

    if (isNewCreditCardAccount && existingCreditCardAccount.numberOfCreditCards() <= minimumNumberOfCreditCards())
    {
      return wasAdded;
    }
    if (isNewCreditCardAccount)
    {
      aCreditCard.setCreditCardAccount(this);
    }
    else
    {
      creditCards.add(aCreditCard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCreditCard(CreditCard aCreditCard)
  {
    boolean wasRemoved = false;
    //Unable to remove aCreditCard, as it must always have a creditCardAccount
    if (this.equals(aCreditCard.getCreditCardAccount()))
    {
      return wasRemoved;
    }

    //creditCardAccount already at minimum (1)
    if (numberOfCreditCards() <= minimumNumberOfCreditCards())
    {
      return wasRemoved;
    }

    creditCards.remove(aCreditCard);
    wasRemoved = true;
    return wasRemoved;
  }

  public void delete()
  {
    for(int i=creditCards.size(); i > 0; i--)
    {
      CreditCard aCreditCard = creditCards.get(i - 1);
      aCreditCard.delete();
    }
    super.delete();
  }
}