package coursework;
/**
 * The CreditCard Class is a child class of BankCard.
 * It represents a credit card and contains properties such as cvcNumber, creditLimit, interestRate, expirationDate,
 * gracePeriod, and isGranted. It also has methods to set credit limit, cancel credit card and display output for credit card.
 *
 * @author (Manisha KC)
 * @version (1.2 2023)

 */
    public class CreditCard extends BankCard
{
    private int cvcNumber;//declaring cvcNumber
    private double creditLimit;//declaring creditLimit
    private double interestRate;//declaring interestRate
    private String expirationDate;//declaring expirationDate
    private int gracePeriod;//declaring gracePeriod
    private boolean isGranted;//declaring  isGranted

    //This is a parameterized constructor that accepts 8 parameters.
    public CreditCard(int cardId, double balanceAmount, String issuerBank, String bankAccount, String clientName, int cvcNumber, double interestRate, String expirationDate)
    {
        super(cardId, balanceAmount, issuerBank, bankAccount);// calling cardId, balanceAmount, issuerBank, bankAccount from parent class.
        super.setClientName(clientName);//calling clientName from parent class
        this.cvcNumber = cvcNumber;// intializing cvcNumber
        this.interestRate = interestRate;//intializing interestRate
        this.expirationDate = expirationDate;//intializing expirationDate
        this.isGranted = false;// intializing isGranted
    }
    // getter method for cvcNumber
    public int getCvcNumber() {return cvcNumber;
    }
    // getter method for creditlimit
    public double getCreditLimit()
    {
        return creditLimit;
    }
    // getter method for interestRate
    public double getInterestRate()
    {
        return interestRate;
    }
    // getter method for ExpirationDate
    public String getExpirationDate()
    {
        return expirationDate;
    }
    // getter method for GracePeriod
    public int getGracePeriod()
    {
        return gracePeriod;
    }
    // getter method for isGranted
    public boolean getIsGranted()
    {
        return isGranted;
    }

    // This is a setter method to set a new credit limit.
    // It accepts newCreditLimit and newGracePeriod as parameters.

    public void setCreditLimit(double newCreditLimit, int newGracePeriod)
    {
        if (newCreditLimit <= (2.5 * super.getBalanceAmount()))
        {
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            isGranted = true;
        }else{
        System.out.println("credit cannot be issued. Credit Limit is supposed to be less than or equal to 2.5 times the amount of balance.");
        }
    }
    //This is a method to cancel credit card
    public void cancelCreditCard() {
        cvcNumber = 0;
        creditLimit = 0;
        gracePeriod = 0;
        isGranted = false;
    }

    // Method to display output for credit card.
    // It displays card information based on whether the credit card is granted or not.

    public void display() {
        if (isGranted == true) {
            super.display();
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
        } else {
            super.display();
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
        }
    }

    }
